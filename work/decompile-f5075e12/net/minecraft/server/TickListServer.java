package net.minecraft.server;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class TickListServer<T> implements TickList<T> {

    protected final Predicate<T> a;
    private final Function<T, MinecraftKey> b;
    private final Function<MinecraftKey, T> c;
    private final Set<NextTickListEntry<T>> nextTickListHash = Sets.newHashSet();
    private final Set<NextTickListEntry<T>> nextTickList = Sets.newTreeSet();
    private final List<NextTickListEntry<T>> f = Lists.newArrayList();
    private final List<NextTickListEntry<T>> g = Lists.newArrayList();
    private final WorldServer h;
    private final List<NextTickListEntry<T>> i = Lists.newArrayList();
    private final Consumer<NextTickListEntry<T>> j;

    public TickListServer(WorldServer worldserver, Predicate<T> predicate, Function<T, MinecraftKey> function, Function<MinecraftKey, T> function1, Consumer<NextTickListEntry<T>> consumer) {
        this.a = predicate;
        this.b = function;
        this.c = function1;
        this.h = worldserver;
        this.j = consumer;
    }

    public void a() {
        this.b();
        int i = this.nextTickList.size();

        if (i != this.nextTickListHash.size()) {
            throw new IllegalStateException("TickNextTick list out of synch");
        } else {
            if (i > 65536) {
                i = 65536;
            }

            this.h.getMethodProfiler().enter("selecting");
            Iterator iterator = this.nextTickList.iterator();

            NextTickListEntry nextticklistentry;

            while (iterator.hasNext()) {
                nextticklistentry = (NextTickListEntry) iterator.next();
                if (i < 0 || nextticklistentry.b > this.h.getTime()) {
                    break;
                }

                if (this.h.getChunkProvider().a(nextticklistentry.a)) {
                    this.i.add(nextticklistentry);
                    --i;
                }
            }

            this.h.getMethodProfiler().exitEnter("ticking");
            iterator = this.i.iterator();

            while (iterator.hasNext()) {
                nextticklistentry = (NextTickListEntry) iterator.next();
                if (this.h.getChunkProvider().a(nextticklistentry.a)) {
                    iterator.remove();
                    this.g.add(nextticklistentry);

                    try {
                        this.j.accept(nextticklistentry);
                    } catch (Throwable throwable) {
                        CrashReport crashreport = CrashReport.a(throwable, "Exception while ticking");
                        CrashReportSystemDetails crashreportsystemdetails = crashreport.a("Block being ticked");

                        CrashReportSystemDetails.a(crashreportsystemdetails, nextticklistentry.a, (IBlockData) null);
                        throw new ReportedException(crashreport);
                    }
                }
            }

            this.h.getMethodProfiler().exitEnter("cleaning");
            this.nextTickList.removeAll(this.g);
            this.nextTickListHash.removeAll(this.g);
            this.i.clear();
            this.g.clear();
            this.h.getMethodProfiler().exit();
        }
    }

    @Override
    public boolean b(BlockPosition blockposition, T t0) {
        return this.i.contains(new NextTickListEntry<>(blockposition, t0));
    }

    @Override
    public void a(Stream<NextTickListEntry<T>> stream) {
        stream.forEach(this::a);
    }

    public List<NextTickListEntry<T>> a(boolean flag, ChunkCoordIntPair chunkcoordintpair) {
        int i = (chunkcoordintpair.x << 4) - 2;
        int j = i + 16 + 2;
        int k = (chunkcoordintpair.z << 4) - 2;
        int l = k + 16 + 2;

        return this.a(new StructureBoundingBox(i, 0, k, j, 256, l), flag);
    }

    public List<NextTickListEntry<T>> a(StructureBoundingBox structureboundingbox, boolean flag) {
        this.b();
        List<NextTickListEntry<T>> list = null;
        Iterator iterator = this.nextTickList.iterator();

        while (iterator.hasNext()) {
            NextTickListEntry<T> nextticklistentry = (NextTickListEntry) iterator.next();
            BlockPosition blockposition = nextticklistentry.a;

            if (blockposition.getX() >= structureboundingbox.a && blockposition.getX() < structureboundingbox.d && blockposition.getZ() >= structureboundingbox.c && blockposition.getZ() < structureboundingbox.f) {
                if (flag) {
                    this.nextTickListHash.remove(nextticklistentry);
                    iterator.remove();
                }

                if (list == null) {
                    list = Lists.newArrayList();
                }

                list.add(nextticklistentry);
            }
        }

        return (List) (list == null ? Collections.emptyList() : list);
    }

    public void a(StructureBoundingBox structureboundingbox, BlockPosition blockposition) {
        List<NextTickListEntry<T>> list = this.a(structureboundingbox, false);
        Iterator iterator = list.iterator();

        while (iterator.hasNext()) {
            NextTickListEntry<T> nextticklistentry = (NextTickListEntry) iterator.next();

            if (structureboundingbox.b((BaseBlockPosition) nextticklistentry.a)) {
                BlockPosition blockposition1 = nextticklistentry.a.a((BaseBlockPosition) blockposition);

                this.a(blockposition1, nextticklistentry.a(), (int) (nextticklistentry.b - this.h.getWorldData().getTime()), nextticklistentry.c);
            }
        }

    }

    public NBTTagList a(ChunkCoordIntPair chunkcoordintpair) {
        List<NextTickListEntry<T>> list = this.a(false, chunkcoordintpair);

        return a(this.b, list, this.h.getTime());
    }

    public static <T> NBTTagList a(Function<T, MinecraftKey> function, Iterable<NextTickListEntry<T>> iterable, long i) {
        NBTTagList nbttaglist = new NBTTagList();
        Iterator iterator = iterable.iterator();

        while (iterator.hasNext()) {
            NextTickListEntry<T> nextticklistentry = (NextTickListEntry) iterator.next();
            NBTTagCompound nbttagcompound = new NBTTagCompound();

            nbttagcompound.setString("i", ((MinecraftKey) function.apply(nextticklistentry.a())).toString());
            nbttagcompound.setInt("x", nextticklistentry.a.getX());
            nbttagcompound.setInt("y", nextticklistentry.a.getY());
            nbttagcompound.setInt("z", nextticklistentry.a.getZ());
            nbttagcompound.setInt("t", (int) (nextticklistentry.b - i));
            nbttagcompound.setInt("p", nextticklistentry.c.a());
            nbttaglist.add(nbttagcompound);
        }

        return nbttaglist;
    }

    @Override
    public boolean a(BlockPosition blockposition, T t0) {
        return this.nextTickListHash.contains(new NextTickListEntry<>(blockposition, t0));
    }

    @Override
    public void a(BlockPosition blockposition, T t0, int i, TickListPriority ticklistpriority) {
        if (!this.a.test(t0)) {
            this.a(new NextTickListEntry<>(blockposition, t0, (long) i + this.h.getTime(), ticklistpriority));
        }

    }

    private void a(NextTickListEntry<T> nextticklistentry) {
        this.f.add(nextticklistentry);
    }

    private void b() {
        this.f.forEach((nextticklistentry) -> {
            if (!this.nextTickListHash.contains(nextticklistentry)) {
                this.nextTickListHash.add(nextticklistentry);
                this.nextTickList.add(nextticklistentry);
            }

        });
        this.f.clear();
    }
}