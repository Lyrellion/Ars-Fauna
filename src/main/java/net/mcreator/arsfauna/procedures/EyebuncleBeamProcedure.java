package net.mcreator.arsfauna.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerPlayer;

public class EyebuncleBeamProcedure {
	public static boolean execute(double x, double y, double z, Entity entity) {
		if (entity == null)
			return false;
		entity.getPersistentData().putDouble("beameffect", (Mth.nextInt(RandomSource.create(), 1, 9)));
		if (entity.getPersistentData().getDouble("beameffect") == 1) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.BLINDNESS, 60, 1));
		} else if (entity.getPersistentData().getDouble("beameffect") == 2) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.HUNGER, 60, 1));
		} else if (entity.getPersistentData().getDouble("beameffect") == 3) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.CONFUSION, 60, 1));
		} else if (entity.getPersistentData().getDouble("beameffect") == 4) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 60, 1));
		} else if (entity.getPersistentData().getDouble("beameffect") == 5) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.WEAKNESS, 60, 1));
		} else if (entity.getPersistentData().getDouble("beameffect") == 6) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.WITHER, 60, 1));
		} else if (entity.getPersistentData().getDouble("beameffect") == 7) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.HARM, 1, 1));
		} else if (entity.getPersistentData().getDouble("beameffect") == 8) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.POISON, 60, 1));
		} else if (entity.getPersistentData().getDouble("beameffect") == 9) {
			{
				Entity _ent = entity;
				_ent.teleportTo((x + Mth.nextDouble(RandomSource.create(), -5, 5)), (y + Mth.nextDouble(RandomSource.create(), -5, 5)), (z + Mth.nextDouble(RandomSource.create(), -5, 5)));
				if (_ent instanceof ServerPlayer _serverPlayer)
					_serverPlayer.connection.teleport((x + Mth.nextDouble(RandomSource.create(), -5, 5)), (y + Mth.nextDouble(RandomSource.create(), -5, 5)), (z + Mth.nextDouble(RandomSource.create(), -5, 5)), _ent.getYRot(), _ent.getXRot());
			}
			return true;
		}
		return false;
	}
}
