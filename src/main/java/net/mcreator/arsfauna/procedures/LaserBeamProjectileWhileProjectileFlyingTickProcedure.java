package net.mcreator.arsfauna.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.particles.SimpleParticleType;

import net.mcreator.arsfauna.init.ArsFaunaModParticleTypes;

public class LaserBeamProjectileWhileProjectileFlyingTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.addParticle((SimpleParticleType) (ArsFaunaModParticleTypes.LASER_BEAM_BASE.get()), x, y, z, 0, 0, 0);
	}
}
