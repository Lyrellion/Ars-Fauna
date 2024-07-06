package net.mcreator.arsfauna.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

public class BurnOnEntityTickUpdateProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return false;
		if (world.dayTime() < 12000) {
			entity.getPersistentData().putDouble("counter1", (entity.getPersistentData().getDouble("counter1") + 1));
			if (entity.getPersistentData().getDouble("counter1") % 5 == 0) {
				if (!(world.getLevelData().isRaining() || world.getLevelData().isThundering())) {
					if (world.canSeeSkyFromBelowWater(BlockPos.containing(x, y, z))) {
						entity.setSecondsOnFire(3);
					}
				}
			}
		}
		return false;
	}
}
