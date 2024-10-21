package net.mcreator.arsfauna.init;

import net.minecraft.world.level.GameRules;

public class ArsFaunaModGamerules {
	// Ideally we would have a range, but that doesn't seem possible without mixins and values outside of [0..100] arent harmful.
	public static final GameRules.Key<GameRules.IntegerValue> RULE_THORNSPRIG_SPAWN_CHANCE = GameRules.register("thornsprigSpawnChance", GameRules.Category.SPAWNING, GameRules.IntegerValue.create(1));
}
