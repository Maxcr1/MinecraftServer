package net.minecraft.server;

import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class WorldGenFeatureVillageTaiga {

    public static void a() {}

    static {
        ImmutableList<DefinedStructureProcessor> immutablelist = ImmutableList.of(new DefinedStructureProcessorRule(ImmutableList.of(new DefinedStructureProcessorPredicates(new DefinedStructureTestRandomBlock(Blocks.COBBLESTONE, 0.8F), DefinedStructureTestTrue.a, Blocks.MOSSY_COBBLESTONE.getBlockData()), new DefinedStructureProcessorPredicates(new DefinedStructureTestTag(TagsBlock.DOORS), DefinedStructureTestTrue.a, Blocks.AIR.getBlockData()), new DefinedStructureProcessorPredicates(new DefinedStructureTestBlock(Blocks.TORCH), DefinedStructureTestTrue.a, Blocks.AIR.getBlockData()), new DefinedStructureProcessorPredicates(new DefinedStructureTestBlock(Blocks.WALL_TORCH), DefinedStructureTestTrue.a, Blocks.AIR.getBlockData()), new DefinedStructureProcessorPredicates(new DefinedStructureTestBlock(Blocks.CAMPFIRE), DefinedStructureTestTrue.a, (IBlockData) Blocks.CAMPFIRE.getBlockData().set(BlockCampfire.b, false)), new DefinedStructureProcessorPredicates(new DefinedStructureTestRandomBlock(Blocks.COBBLESTONE, 0.08F), DefinedStructureTestTrue.a, Blocks.COBWEB.getBlockData()), new DefinedStructureProcessorPredicates(new DefinedStructureTestRandomBlock(Blocks.SPRUCE_LOG, 0.08F), DefinedStructureTestTrue.a, Blocks.COBWEB.getBlockData()), new DefinedStructureProcessorPredicates(new DefinedStructureTestRandomBlock(Blocks.GLASS_PANE, 0.5F), DefinedStructureTestTrue.a, Blocks.COBWEB.getBlockData()), new DefinedStructureProcessorPredicates(new DefinedStructureTestBlockState((IBlockData) ((IBlockData) Blocks.GLASS_PANE.getBlockData().set(BlockIronBars.NORTH, true)).set(BlockIronBars.SOUTH, true)), DefinedStructureTestTrue.a, (IBlockData) ((IBlockData) Blocks.BROWN_STAINED_GLASS_PANE.getBlockData().set(BlockIronBars.NORTH, true)).set(BlockIronBars.SOUTH, true)), new DefinedStructureProcessorPredicates(new DefinedStructureTestBlockState((IBlockData) ((IBlockData) Blocks.GLASS_PANE.getBlockData().set(BlockIronBars.EAST, true)).set(BlockIronBars.WEST, true)), DefinedStructureTestTrue.a, (IBlockData) ((IBlockData) Blocks.BROWN_STAINED_GLASS_PANE.getBlockData().set(BlockIronBars.EAST, true)).set(BlockIronBars.WEST, true)), new DefinedStructureProcessorPredicates(new DefinedStructureTestRandomBlock(Blocks.WHEAT, 0.3F), DefinedStructureTestTrue.a, Blocks.PUMPKIN_STEM.getBlockData()), new DefinedStructureProcessorPredicates(new DefinedStructureTestRandomBlock(Blocks.WHEAT, 0.2F), DefinedStructureTestTrue.a, Blocks.POTATOES.getBlockData()), new DefinedStructureProcessorPredicates[0])));
        ImmutableList<DefinedStructureProcessor> immutablelist1 = ImmutableList.of(new DefinedStructureProcessorRule(ImmutableList.of(new DefinedStructureProcessorPredicates(new DefinedStructureTestRandomBlock(Blocks.COBBLESTONE, 0.1F), DefinedStructureTestTrue.a, Blocks.MOSSY_COBBLESTONE.getBlockData()))));

        WorldGenFeatureDefinedStructureJigsawPlacement.a.a(new WorldGenFeatureDefinedStructurePoolTemplate(new MinecraftKey("village/taiga/town_centers"), new MinecraftKey("empty"), ImmutableList.of(new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/taiga/town_centers/taiga_meeting_point_1", immutablelist1), 49), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/taiga/town_centers/taiga_meeting_point_2", immutablelist1), 49), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/taiga/zombie/town_centers/taiga_meeting_point_1", immutablelist), 1), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/taiga/zombie/town_centers/taiga_meeting_point_2", immutablelist), 1)), WorldGenFeatureDefinedStructurePoolTemplate.Matching.RIGID));
        ImmutableList<DefinedStructureProcessor> immutablelist2 = ImmutableList.of(new DefinedStructureProcessorRule(ImmutableList.of(new DefinedStructureProcessorPredicates(new DefinedStructureTestBlock(Blocks.GRASS_PATH), new DefinedStructureTestBlock(Blocks.WATER), Blocks.SPRUCE_PLANKS.getBlockData()), new DefinedStructureProcessorPredicates(new DefinedStructureTestRandomBlock(Blocks.GRASS_PATH, 0.2F), DefinedStructureTestTrue.a, Blocks.GRASS_BLOCK.getBlockData()), new DefinedStructureProcessorPredicates(new DefinedStructureTestBlock(Blocks.GRASS_BLOCK), new DefinedStructureTestBlock(Blocks.WATER), Blocks.WATER.getBlockData()), new DefinedStructureProcessorPredicates(new DefinedStructureTestBlock(Blocks.DIRT), new DefinedStructureTestBlock(Blocks.WATER), Blocks.WATER.getBlockData()))));

        WorldGenFeatureDefinedStructureJigsawPlacement.a.a(new WorldGenFeatureDefinedStructurePoolTemplate(new MinecraftKey("village/taiga/streets"), new MinecraftKey("village/taiga/terminators"), ImmutableList.of(new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/taiga/streets/corner_01", immutablelist2), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/taiga/streets/corner_02", immutablelist2), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/taiga/streets/corner_03", immutablelist2), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/taiga/streets/straight_01", immutablelist2), 4), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/taiga/streets/straight_02", immutablelist2), 4), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/taiga/streets/straight_03", immutablelist2), 4), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/taiga/streets/straight_04", immutablelist2), 7), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/taiga/streets/straight_05", immutablelist2), 7), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/taiga/streets/straight_06", immutablelist2), 4), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/taiga/streets/crossroad_01", immutablelist2), 1), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/taiga/streets/crossroad_02", immutablelist2), 1), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/taiga/streets/crossroad_03", immutablelist2), 2), new Pair[] { new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/taiga/streets/crossroad_04", immutablelist2), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/taiga/streets/crossroad_05", immutablelist2), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/taiga/streets/crossroad_06", immutablelist2), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/taiga/streets/turn_01", immutablelist2), 3)}), WorldGenFeatureDefinedStructurePoolTemplate.Matching.TERRAIN_MATCHING));
        WorldGenFeatureDefinedStructureJigsawPlacement.a.a(new WorldGenFeatureDefinedStructurePoolTemplate(new MinecraftKey("village/taiga/zombie/streets"), new MinecraftKey("village/taiga/terminators"), ImmutableList.of(new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/taiga/zombie/streets/corner_01", immutablelist2), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/taiga/zombie/streets/corner_02", immutablelist2), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/taiga/zombie/streets/corner_03", immutablelist2), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/taiga/zombie/streets/straight_01", immutablelist2), 4), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/taiga/zombie/streets/straight_02", immutablelist2), 4), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/taiga/zombie/streets/straight_03", immutablelist2), 4), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/taiga/zombie/streets/straight_04", immutablelist2), 7), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/taiga/zombie/streets/straight_05", immutablelist2), 7), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/taiga/zombie/streets/straight_06", immutablelist2), 4), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/taiga/zombie/streets/crossroad_01", immutablelist2), 1), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/taiga/zombie/streets/crossroad_02", immutablelist2), 1), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/taiga/zombie/streets/crossroad_03", immutablelist2), 2), new Pair[] { new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/taiga/zombie/streets/crossroad_04", immutablelist2), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/taiga/zombie/streets/crossroad_05", immutablelist2), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/taiga/zombie/streets/crossroad_06", immutablelist2), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/taiga/zombie/streets/turn_01", immutablelist2), 3)}), WorldGenFeatureDefinedStructurePoolTemplate.Matching.TERRAIN_MATCHING));
        ImmutableList<DefinedStructureProcessor> immutablelist3 = ImmutableList.of(new DefinedStructureProcessorRule(ImmutableList.of(new DefinedStructureProcessorPredicates(new DefinedStructureTestRandomBlock(Blocks.WHEAT, 0.3F), DefinedStructureTestTrue.a, Blocks.PUMPKIN_STEM.getBlockData()), new DefinedStructureProcessorPredicates(new DefinedStructureTestRandomBlock(Blocks.WHEAT, 0.2F), DefinedStructureTestTrue.a, Blocks.POTATOES.getBlockData()))));

        WorldGenFeatureDefinedStructureJigsawPlacement.a.a(new WorldGenFeatureDefinedStructurePoolTemplate(new MinecraftKey("village/taiga/houses"), new MinecraftKey("village/taiga/terminators"), ImmutableList.of(new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/taiga/houses/taiga_small_house_1", immutablelist1), 4), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/taiga/houses/taiga_small_house_2", immutablelist1), 4), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/taiga/houses/taiga_small_house_3", immutablelist1), 4), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/taiga/houses/taiga_small_house_4", immutablelist1), 4), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/taiga/houses/taiga_small_house_5", immutablelist1), 4), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/taiga/houses/taiga_medium_house_1", immutablelist1), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/taiga/houses/taiga_medium_house_2", immutablelist1), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/taiga/houses/taiga_medium_house_3", immutablelist1), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/taiga/houses/taiga_medium_house_4", immutablelist1), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/taiga/houses/taiga_butcher_shop_1", immutablelist1), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/taiga/houses/taiga_tool_smith_1", immutablelist1), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/taiga/houses/taiga_fletcher_house_1", immutablelist1), 2), new Pair[] { new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/taiga/houses/taiga_shepherds_house_1", immutablelist1), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/taiga/houses/taiga_armorer_house_1", immutablelist1), 1), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/taiga/houses/taiga_armorer_2", immutablelist1), 1), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/taiga/houses/taiga_fisher_cottage_1", immutablelist1), 3), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/taiga/houses/taiga_tannery_1", immutablelist1), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/taiga/houses/taiga_cartographer_house_1", immutablelist1), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/taiga/houses/taiga_library_1", immutablelist1), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/taiga/houses/taiga_masons_house_1", immutablelist1), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/taiga/houses/taiga_weaponsmith_1", immutablelist1), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/taiga/houses/taiga_weaponsmith_2", immutablelist1), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/taiga/houses/taiga_temple_1", immutablelist1), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/taiga/houses/taiga_large_farm_1", immutablelist3), 6), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/taiga/houses/taiga_large_farm_2", immutablelist3), 6), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/taiga/houses/taiga_small_farm_1", immutablelist1), 1), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/taiga/houses/taiga_animal_pen_1", immutablelist1), 2), Pair.of(WorldGenFeatureDefinedStructurePoolEmpty.a, 6)}), WorldGenFeatureDefinedStructurePoolTemplate.Matching.RIGID));
        WorldGenFeatureDefinedStructureJigsawPlacement.a.a(new WorldGenFeatureDefinedStructurePoolTemplate(new MinecraftKey("village/taiga/zombie/houses"), new MinecraftKey("village/taiga/terminators"), ImmutableList.of(new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/taiga/zombie/houses/taiga_small_house_1", immutablelist), 4), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/taiga/zombie/houses/taiga_small_house_2", immutablelist), 4), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/taiga/zombie/houses/taiga_small_house_3", immutablelist), 4), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/taiga/zombie/houses/taiga_small_house_4", immutablelist), 4), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/taiga/zombie/houses/taiga_small_house_5", immutablelist), 4), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/taiga/zombie/houses/taiga_medium_house_1", immutablelist), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/taiga/zombie/houses/taiga_medium_house_2", immutablelist), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/taiga/zombie/houses/taiga_medium_house_3", immutablelist), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/taiga/zombie/houses/taiga_medium_house_4", immutablelist), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/taiga/houses/taiga_butcher_shop_1", immutablelist), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/taiga/zombie/houses/taiga_tool_smith_1", immutablelist), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/taiga/houses/taiga_fletcher_house_1", immutablelist), 2), new Pair[] { new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/taiga/zombie/houses/taiga_shepherds_house_1", immutablelist), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/taiga/houses/taiga_armorer_house_1", immutablelist), 1), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/taiga/zombie/houses/taiga_fisher_cottage_1", immutablelist), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/taiga/houses/taiga_tannery_1", immutablelist), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/taiga/zombie/houses/taiga_cartographer_house_1", immutablelist), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/taiga/zombie/houses/taiga_library_1", immutablelist), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/taiga/houses/taiga_masons_house_1", immutablelist), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/taiga/houses/taiga_weaponsmith_1", immutablelist), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/taiga/zombie/houses/taiga_weaponsmith_2", immutablelist), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/taiga/zombie/houses/taiga_temple_1", immutablelist), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/taiga/houses/taiga_large_farm_1", immutablelist), 6), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/taiga/zombie/houses/taiga_large_farm_2", immutablelist), 6), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/taiga/houses/taiga_small_farm_1", immutablelist), 1), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/taiga/houses/taiga_animal_pen_1", immutablelist), 2), Pair.of(WorldGenFeatureDefinedStructurePoolEmpty.a, 6)}), WorldGenFeatureDefinedStructurePoolTemplate.Matching.RIGID));
        WorldGenFeatureDefinedStructureJigsawPlacement.a.a(new WorldGenFeatureDefinedStructurePoolTemplate(new MinecraftKey("village/taiga/terminators"), new MinecraftKey("empty"), ImmutableList.of(new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/plains/terminators/terminator_01", immutablelist2), 1), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/plains/terminators/terminator_02", immutablelist2), 1), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/plains/terminators/terminator_03", immutablelist2), 1), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/plains/terminators/terminator_04", immutablelist2), 1)), WorldGenFeatureDefinedStructurePoolTemplate.Matching.TERRAIN_MATCHING));
        WorldGenFeatureDefinedStructureJigsawPlacement.a.a(new WorldGenFeatureDefinedStructurePoolTemplate(new MinecraftKey("village/taiga/decor"), new MinecraftKey("empty"), ImmutableList.of(new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/taiga/taiga_lamp_post_1"), 10), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/taiga/taiga_decoration_1"), 4), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/taiga/taiga_decoration_2"), 1), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/taiga/taiga_decoration_3"), 1), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/taiga/taiga_decoration_4"), 1), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/taiga/taiga_decoration_5"), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/taiga/taiga_decoration_6"), 1), new Pair(new WorldGenFeatureDefinedStructurePoolFeature(new WorldGenFeatureConfigured<>(WorldGenerator.SPRUCE_TREE, WorldGenFeatureConfiguration.e)), 4), new Pair(new WorldGenFeatureDefinedStructurePoolFeature(new WorldGenFeatureConfigured<>(WorldGenerator.PINE_TREE, WorldGenFeatureConfiguration.e)), 4), new Pair(new WorldGenFeatureDefinedStructurePoolFeature(new WorldGenFeatureConfigured<>(WorldGenerator.PUMPKIN_PILE, WorldGenFeatureConfiguration.e)), 2), new Pair(new WorldGenFeatureDefinedStructurePoolFeature(new WorldGenFeatureConfigured<>(WorldGenerator.TAIGA_GRASS, WorldGenFeatureConfiguration.e)), 4), new Pair(new WorldGenFeatureDefinedStructurePoolFeature(new WorldGenFeatureConfigured<>(WorldGenerator.SWEET_BERRY_BUSH, WorldGenFeatureConfiguration.e)), 1), new Pair[] { Pair.of(WorldGenFeatureDefinedStructurePoolEmpty.a, 4)}), WorldGenFeatureDefinedStructurePoolTemplate.Matching.RIGID));
        WorldGenFeatureDefinedStructureJigsawPlacement.a.a(new WorldGenFeatureDefinedStructurePoolTemplate(new MinecraftKey("village/taiga/zombie/decor"), new MinecraftKey("empty"), ImmutableList.of(new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/taiga/taiga_decoration_1"), 4), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/taiga/taiga_decoration_2"), 1), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/taiga/taiga_decoration_3"), 1), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/taiga/taiga_decoration_4"), 1), new Pair(new WorldGenFeatureDefinedStructurePoolFeature(new WorldGenFeatureConfigured<>(WorldGenerator.SPRUCE_TREE, WorldGenFeatureConfiguration.e)), 4), new Pair(new WorldGenFeatureDefinedStructurePoolFeature(new WorldGenFeatureConfigured<>(WorldGenerator.PINE_TREE, WorldGenFeatureConfiguration.e)), 4), new Pair(new WorldGenFeatureDefinedStructurePoolFeature(new WorldGenFeatureConfigured<>(WorldGenerator.PUMPKIN_PILE, WorldGenFeatureConfiguration.e)), 2), new Pair(new WorldGenFeatureDefinedStructurePoolFeature(new WorldGenFeatureConfigured<>(WorldGenerator.TAIGA_GRASS, WorldGenFeatureConfiguration.e)), 4), new Pair(new WorldGenFeatureDefinedStructurePoolFeature(new WorldGenFeatureConfigured<>(WorldGenerator.SWEET_BERRY_BUSH, WorldGenFeatureConfiguration.e)), 1), Pair.of(WorldGenFeatureDefinedStructurePoolEmpty.a, 4)), WorldGenFeatureDefinedStructurePoolTemplate.Matching.RIGID));
        WorldGenFeatureDefinedStructureJigsawPlacement.a.a(new WorldGenFeatureDefinedStructurePoolTemplate(new MinecraftKey("village/taiga/villagers"), new MinecraftKey("empty"), ImmutableList.of(new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/taiga/villagers/nitwit"), 1), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/taiga/villagers/baby"), 1), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/taiga/villagers/unemployed"), 10)), WorldGenFeatureDefinedStructurePoolTemplate.Matching.RIGID));
        WorldGenFeatureDefinedStructureJigsawPlacement.a.a(new WorldGenFeatureDefinedStructurePoolTemplate(new MinecraftKey("village/taiga/zombie/villagers"), new MinecraftKey("empty"), ImmutableList.of(new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/taiga/zombie/villagers/nitwit"), 1), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/taiga/zombie/villagers/unemployed"), 10)), WorldGenFeatureDefinedStructurePoolTemplate.Matching.RIGID));
    }
}
