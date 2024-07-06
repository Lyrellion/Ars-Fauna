package net.mcreator.arsfauna.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionResult;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;

public class ChefbuncleRightClickedOnEntityProcedure {
	public static InteractionResult execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return InteractionResult.PASS;
		entity.getPersistentData().putDouble("foodselect", (Mth.nextInt(RandomSource.create(), 1, 24)));
		if (entity.getPersistentData().getDouble("foodselect") <= 5) {
			if (world instanceof ServerLevel _level) {
				ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.BREAD));
				entityToSpawn.setPickUpDelay(10);
				_level.addFreshEntity(entityToSpawn);
			}
			return InteractionResult.SUCCESS;
		} else if (entity.getPersistentData().getDouble("foodselect") <= 7) {
			if (world instanceof ServerLevel _level) {
				ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.HONEY_BOTTLE));
				entityToSpawn.setPickUpDelay(10);
				_level.addFreshEntity(entityToSpawn);
			}
			return InteractionResult.SUCCESS;
		} else if (entity.getPersistentData().getDouble("foodselect") <= 9) {
			if (world instanceof ServerLevel _level) {
				ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.BAKED_POTATO));
				entityToSpawn.setPickUpDelay(10);
				_level.addFreshEntity(entityToSpawn);
			}
			return InteractionResult.SUCCESS;
		} else if (entity.getPersistentData().getDouble("foodselect") <= 11) {
			if (world instanceof ServerLevel _level) {
				ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.BEETROOT_SOUP));
				entityToSpawn.setPickUpDelay(10);
				_level.addFreshEntity(entityToSpawn);
			}
			return InteractionResult.SUCCESS;
		} else if (entity.getPersistentData().getDouble("foodselect") <= 13) {
			if (world instanceof ServerLevel _level) {
				ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.MUSHROOM_STEW));
				entityToSpawn.setPickUpDelay(10);
				_level.addFreshEntity(entityToSpawn);
			}
			return InteractionResult.SUCCESS;
		} else if (entity.getPersistentData().getDouble("foodselect") == 14) {
			if (world instanceof ServerLevel _level) {
				ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.COOKIE));
				entityToSpawn.setPickUpDelay(10);
				_level.addFreshEntity(entityToSpawn);
			}
			return InteractionResult.SUCCESS;
		} else if (entity.getPersistentData().getDouble("foodselect") == 15) {
			if (world instanceof ServerLevel _level) {
				ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.PUMPKIN_PIE));
				entityToSpawn.setPickUpDelay(10);
				_level.addFreshEntity(entityToSpawn);
			}
			return InteractionResult.SUCCESS;
		} else if (entity.getPersistentData().getDouble("foodselect") == 16) {
			if (world instanceof ServerLevel _level) {
				ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.CAKE));
				entityToSpawn.setPickUpDelay(10);
				_level.addFreshEntity(entityToSpawn);
			}
			return InteractionResult.SUCCESS;
		} else if (entity.getPersistentData().getDouble("foodselect") >= 17) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.POOF, x, y, z, 5, 0, 0, 0, 0.5);
			if (!entity.level().isClientSide())
				entity.discard();
			return InteractionResult.SUCCESS;
		}
		return InteractionResult.SUCCESS;
	}
}
