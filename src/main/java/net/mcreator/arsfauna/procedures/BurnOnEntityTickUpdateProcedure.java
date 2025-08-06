package net.mcreator.arsfauna.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

public class BurnOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (world.getMaxLocalRawBrightness(BlockPos.containing(x, y + 1, z)) > 13) {
			entity.igniteForSeconds(5);
		}
	}
}
