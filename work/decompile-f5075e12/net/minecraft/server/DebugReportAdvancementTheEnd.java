package net.minecraft.server;

import java.util.function.Consumer;

public class DebugReportAdvancementTheEnd implements Consumer<Consumer<Advancement>> {

    public DebugReportAdvancementTheEnd() {}

    public void accept(Consumer<Advancement> consumer) {
        Advancement advancement = Advancement.SerializedAdvancement.a().a((IMaterial) Blocks.END_STONE, new ChatMessage("advancements.end.root.title", new Object[0]), new ChatMessage("advancements.end.root.description", new Object[0]), new MinecraftKey("textures/gui/advancements/backgrounds/end.png"), AdvancementFrameType.TASK, false, false, false).a("entered_end", (CriterionInstance) CriterionTriggerChangedDimension.b.a(DimensionManager.THE_END)).a(consumer, "end/root");
        Advancement advancement1 = Advancement.SerializedAdvancement.a().a(advancement).a((IMaterial) Blocks.DRAGON_HEAD, new ChatMessage("advancements.end.kill_dragon.title", new Object[0]), new ChatMessage("advancements.end.kill_dragon.description", new Object[0]), (MinecraftKey) null, AdvancementFrameType.TASK, true, true, false).a("killed_dragon", (CriterionInstance) CriterionTriggerKilled.b.a(CriterionConditionEntity.a.a().a(EntityTypes.ENDER_DRAGON))).a(consumer, "end/kill_dragon");
        Advancement advancement2 = Advancement.SerializedAdvancement.a().a(advancement1).a((IMaterial) Items.ENDER_PEARL, new ChatMessage("advancements.end.enter_end_gateway.title", new Object[0]), new ChatMessage("advancements.end.enter_end_gateway.description", new Object[0]), (MinecraftKey) null, AdvancementFrameType.TASK, true, true, false).a("entered_end_gateway", (CriterionInstance) CriterionTriggerEnterBlock.b.a(Blocks.END_GATEWAY)).a(consumer, "end/enter_end_gateway");
        Advancement advancement3 = Advancement.SerializedAdvancement.a().a(advancement1).a((IMaterial) Items.END_CRYSTAL, new ChatMessage("advancements.end.respawn_dragon.title", new Object[0]), new ChatMessage("advancements.end.respawn_dragon.description", new Object[0]), (MinecraftKey) null, AdvancementFrameType.GOAL, true, true, false).a("summoned_dragon", (CriterionInstance) CriterionTriggerSummonedEntity.b.a(CriterionConditionEntity.a.a().a(EntityTypes.ENDER_DRAGON))).a(consumer, "end/respawn_dragon");
        Advancement advancement4 = Advancement.SerializedAdvancement.a().a(advancement2).a((IMaterial) Blocks.PURPUR_BLOCK, new ChatMessage("advancements.end.find_end_city.title", new Object[0]), new ChatMessage("advancements.end.find_end_city.description", new Object[0]), (MinecraftKey) null, AdvancementFrameType.TASK, true, true, false).a("in_city", (CriterionInstance) CriterionTriggerLocation.b.a(CriterionConditionLocation.a(WorldGenerator.END_CITY))).a(consumer, "end/find_end_city");
        Advancement advancement5 = Advancement.SerializedAdvancement.a().a(advancement1).a((IMaterial) Items.DRAGON_BREATH, new ChatMessage("advancements.end.dragon_breath.title", new Object[0]), new ChatMessage("advancements.end.dragon_breath.description", new Object[0]), (MinecraftKey) null, AdvancementFrameType.GOAL, true, true, false).a("dragon_breath", (CriterionInstance) CriterionTriggerInventoryChanged.b.a(Items.DRAGON_BREATH)).a(consumer, "end/dragon_breath");
        Advancement advancement6 = Advancement.SerializedAdvancement.a().a(advancement4).a((IMaterial) Items.SHULKER_SHELL, new ChatMessage("advancements.end.levitate.title", new Object[0]), new ChatMessage("advancements.end.levitate.description", new Object[0]), (MinecraftKey) null, AdvancementFrameType.CHALLENGE, true, true, false).a(AdvancementRewards.a.a(50)).a("levitated", (CriterionInstance) CriterionTriggerLevitation.b.a(CriterionConditionDistance.b(CriterionConditionValue.FloatRange.b(50.0F)))).a(consumer, "end/levitate");
        Advancement advancement7 = Advancement.SerializedAdvancement.a().a(advancement4).a((IMaterial) Items.ELYTRA, new ChatMessage("advancements.end.elytra.title", new Object[0]), new ChatMessage("advancements.end.elytra.description", new Object[0]), (MinecraftKey) null, AdvancementFrameType.GOAL, true, true, false).a("elytra", (CriterionInstance) CriterionTriggerInventoryChanged.b.a(Items.ELYTRA)).a(consumer, "end/elytra");
        Advancement advancement8 = Advancement.SerializedAdvancement.a().a(advancement1).a((IMaterial) Blocks.DRAGON_EGG, new ChatMessage("advancements.end.dragon_egg.title", new Object[0]), new ChatMessage("advancements.end.dragon_egg.description", new Object[0]), (MinecraftKey) null, AdvancementFrameType.GOAL, true, true, false).a("dragon_egg", (CriterionInstance) CriterionTriggerInventoryChanged.b.a(Blocks.DRAGON_EGG)).a(consumer, "end/dragon_egg");
    }
}
