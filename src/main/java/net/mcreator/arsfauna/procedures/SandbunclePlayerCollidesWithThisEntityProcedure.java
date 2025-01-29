package net.mcreator.arsfauna.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;

public class SandbunclePlayerCollidesWithThisEntityProcedure {
	public static void execute(LevelAccessor world, Entity sourceentity) {
		if (sourceentity == null)
			return;
		sourceentity.hurt(new DamageSource(world.holderOrThrow(DamageTypes.CACTUS)), 1);
	}
}
