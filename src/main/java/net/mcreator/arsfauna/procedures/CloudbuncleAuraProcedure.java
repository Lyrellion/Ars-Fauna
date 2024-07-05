package net.mcreator.arsfauna.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

public class CloudbuncleAuraProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return false;
		boolean found = false;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		double particleRadius = 0;
		double particleAmount = 0;
		particleAmount = 1;
		particleRadius = 1;
		entity.getPersistentData().putDouble("sparkcounter", (entity.getPersistentData().getDouble("sparkcounter") + 1));
		if (entity.getPersistentData().getDouble("sparkcounter") % 10 == 0) {
			for (int index0 = 0; index0 < (int) particleAmount; index0++) {
				world.addParticle(ParticleTypes.ELECTRIC_SPARK, (x + 0 + Mth.nextDouble(RandomSource.create(), -1, 1) * particleRadius), (y + 0 + Mth.nextDouble(RandomSource.create(), -1, 1) * particleRadius),
						(z + 0 + Mth.nextDouble(RandomSource.create(), -1, 1) * particleRadius), (Mth.nextDouble(RandomSource.create(), -0.001, 0.001)), (Mth.nextDouble(RandomSource.create(), -0.001, 0.001)),
						(Mth.nextDouble(RandomSource.create(), -0.001, 0.001)));
			}
		}
		if (!world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 5, 5, 5), e -> true).isEmpty()) {
			entity.getPersistentData().putDouble("counter1", (entity.getPersistentData().getDouble("counter1") + 1));
			if (entity.getPersistentData().getDouble("counter1") % 100 == 0) {
				if (world instanceof ServerLevel _level) {
					LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
					entityToSpawn.moveTo(Vec3.atBottomCenterOf(BlockPos.containing(x + Mth.nextInt(RandomSource.create(), -3, 3), y, z + Mth.nextInt(RandomSource.create(), -3, 3))));;
					_level.addFreshEntity(entityToSpawn);
				}
				return true;
			}
			return true;
		}
		return false;
	}
}
