package net.mcreator.arsfauna.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class UndergroundDwellerSpawnRuleProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity.getY() > 50 || world.getBiome(BlockPos.containing(x, y, z)).is(new ResourceLocation("deep_dark"))) {
			if (!entity.level().isClientSide())
				entity.discard();
		}
	}
}
