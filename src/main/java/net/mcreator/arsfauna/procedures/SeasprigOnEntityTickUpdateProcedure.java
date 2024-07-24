package net.mcreator.arsfauna.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.BoneMealItem;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

public class SeasprigOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean found = false;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		entity.getPersistentData().putDouble("growthcounter", (entity.getPersistentData().getDouble("growthcounter") + 1));
		if (entity.getPersistentData().getDouble("growthcounter") % 400 == 0) {
			sx = -1;
			sy = -1;
			found = false;
			for (int index0 = 0; index0 < 3; index0++) {
				sz = -1;
				for (int index1 = 0; index1 < 3; index1++) {
					if (world instanceof Level _level) {
						BlockPos _bp = BlockPos.containing(x, y, z);
						if (BoneMealItem.growCrop(new ItemStack(Items.BONE_MEAL), _level, _bp) || BoneMealItem.growWaterPlant(new ItemStack(Items.BONE_MEAL), _level, _bp, null)) {
							if (!_level.isClientSide())
								_level.levelEvent(2005, _bp, 0);
						}
					}
					sz = sz + 1;
				}
			}
			sx = sx + 1;
		}
	}
}
