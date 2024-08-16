package net.mcreator.arsfauna.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class ConvertToMyceliumProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putDouble("funguscounter", (entity.getPersistentData().getDouble("funguscounter") + 1));
		if (entity.getPersistentData().getDouble("funguscounter") % 2400 == 0) {
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.CAVE_AIR) {
				if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).is(BlockTags.create(new ResourceLocation("forge:stone")))
						|| (world.getBlockState(BlockPos.containing(x, y - 1, z))).is(BlockTags.create(new ResourceLocation("minecraft:dirt")))) {
					world.setBlock(BlockPos.containing(x, y - 1, z), Blocks.MYCELIUM.defaultBlockState(), 3);
				}
			}
		}
	}
}
