package net.mcreator.arsfauna.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingAttackEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.arsfauna.entity.StarbuncleSwarmEntity;
import net.mcreator.arsfauna.entity.ShadowbuncleEntity;
import net.mcreator.arsfauna.entity.CavebuncleEntity;
import net.mcreator.arsfauna.ArsFaunaMod;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class BuncleAttackEffectsProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingAttackEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity().level(), event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity(), event.getSource().getDirectEntity());
		}
	}

	public static boolean execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity immediatesourceentity) {
		return execute(null, world, x, y, z, entity, immediatesourceentity);
	}

	private static boolean execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity, Entity immediatesourceentity) {
		if (entity == null || immediatesourceentity == null)
			return false;
		double particleRadius = 0;
		double particleAmount = 0;
		if (immediatesourceentity instanceof StarbuncleSwarmEntity && entity instanceof Player) {
			if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(Items.GOLD_NUGGET)) : false) {
				if (immediatesourceentity.getPersistentData().getBoolean("robber") == false) {
					entity.getPersistentData().putDouble("lottery", (Mth.nextDouble(RandomSource.create(), 1, 20)));
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Items.GOLD_NUGGET);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
					immediatesourceentity.getPersistentData().putBoolean("robber", true);
					ArsFaunaMod.queueServerWork(100, () -> {
						if (entity.getPersistentData().getDouble("lottery") == 20) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (immediatesourceentity.getX()), (immediatesourceentity.getY()), (immediatesourceentity.getZ()), new ItemStack(Items.GOLD_INGOT));
								entityToSpawn.setPickUpDelay(10);
								_level.addFreshEntity(entityToSpawn);
							}
						} else {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (immediatesourceentity.getX()), (immediatesourceentity.getY()), (immediatesourceentity.getZ()), new ItemStack(Items.GOLD_NUGGET));
								entityToSpawn.setPickUpDelay(10);
								_level.addFreshEntity(entityToSpawn);
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (immediatesourceentity.getX()), (immediatesourceentity.getY()), (immediatesourceentity.getZ()), new ItemStack(Items.GOLD_NUGGET));
								entityToSpawn.setPickUpDelay(10);
								_level.addFreshEntity(entityToSpawn);
							}
						}
						ArsFaunaMod.queueServerWork(20, () -> {
							if (world instanceof ServerLevel _level)
								_level.sendParticles(ParticleTypes.POOF, (immediatesourceentity.getX()), (immediatesourceentity.getY()), (immediatesourceentity.getZ()), 8, 1, 1, 1, 0.2);
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.shulker.teleport")), SoundSource.NEUTRAL, 1, 1);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.shulker.teleport")), SoundSource.NEUTRAL, 1, 1, false);
								}
							}
							if (!immediatesourceentity.level().isClientSide())
								immediatesourceentity.discard();
						});
					});
					return true;
				}
			}
			return true;
		} else if (immediatesourceentity instanceof CavebuncleEntity) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.POISON, 60, 1));
		} else if (immediatesourceentity instanceof ShadowbuncleEntity) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.WITHER, 60, 1));
		}
		return false;
	}
}
