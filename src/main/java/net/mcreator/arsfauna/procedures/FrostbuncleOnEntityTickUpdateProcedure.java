package net.mcreator.arsfauna.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.core.particles.ParticleTypes;

public class FrostbuncleOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double particleRadius = 0;
		double particleAmount = 0;
		particleAmount = 1;
		particleRadius = 0;
		entity.getPersistentData().putDouble("sparkcounter", (entity.getPersistentData().getDouble("sparkcounter") + 1));
		if (entity.getPersistentData().getDouble("sparkcounter") % 20 == 0) {
			for (int index0 = 0; index0 < (int) particleAmount; index0++) {
				world.addParticle(ParticleTypes.SNOWFLAKE, (x + 0 + Mth.nextDouble(RandomSource.create(), -1, 1) * particleRadius), (y + 1 + Mth.nextDouble(RandomSource.create(), -1, 1) * particleRadius),
						(z + 0 + Mth.nextDouble(RandomSource.create(), -1, 1) * particleRadius), (Mth.nextDouble(RandomSource.create(), -0.001, 0.001)), (Mth.nextDouble(RandomSource.create(), -0.001, 0.001)),
						(Mth.nextDouble(RandomSource.create(), -0.001, 0.001)));
			}
		}
	}
}
