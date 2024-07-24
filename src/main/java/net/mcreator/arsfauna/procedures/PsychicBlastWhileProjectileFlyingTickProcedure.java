package net.mcreator.arsfauna.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.particles.ParticleTypes;

public class PsychicBlastWhileProjectileFlyingTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.addParticle(ParticleTypes.SONIC_BOOM, x, y, z, 0, 0, 0);
	}
}
