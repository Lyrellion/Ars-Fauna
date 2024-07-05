package net.mcreator.arsfauna.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.TagKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;

public class CavebuncleOnInitialEntitySpawnProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return false;
		if (world.canSeeSkyFromBelowWater(BlockPos.containing(x, y, z))) {
			if (!entity.level().isClientSide())
				entity.discard();
			return true;
		} else if (world.getBiome(BlockPos.containing(x, y, z)).is(TagKey.create(Registries.BIOME, new ResourceLocation("minecraft:is_nether")))
				|| world.getBiome(BlockPos.containing(x, y, z)).is(TagKey.create(Registries.BIOME, new ResourceLocation("minecraft:is_end")))) {
			if (!entity.level().isClientSide())
				entity.discard();
			return true;
		}
		return false;
	}
}
