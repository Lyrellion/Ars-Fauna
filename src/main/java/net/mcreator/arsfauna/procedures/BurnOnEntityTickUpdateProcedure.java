package net.mcreator.arsfauna.procedures;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.LightLayer;

public class BurnOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (world.canSeeSkyFromBelowWater(BlockPos.containing(x, y, z))) {
			if (world instanceof Level _lvl1 && _lvl1.isDay() && !world.getLevelData().isRaining()) {
				entity.igniteForSeconds(5);
			}
		}
	}
}