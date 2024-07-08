
package net.mcreator.arsfauna.entity;

import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.ItemSupplier;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.protocol.Packet;

import net.mcreator.arsfauna.init.ArsFaunaModEntities;

@OnlyIn(value = Dist.CLIENT, _interface = ItemSupplier.class)
public class ThornsprigEntityProjectile extends AbstractArrow implements ItemSupplier {
	public ThornsprigEntityProjectile(PlayMessages.SpawnEntity packet, Level world) {
		super(ArsFaunaModEntities.THORNSPRIG_PROJECTILE.get(), world);
	}

	public ThornsprigEntityProjectile(EntityType<? extends ThornsprigEntityProjectile> type, Level world) {
		super(type, world);
	}

	public ThornsprigEntityProjectile(EntityType<? extends ThornsprigEntityProjectile> type, double x, double y, double z, Level world) {
		super(type, x, y, z, world);
	}

	public ThornsprigEntityProjectile(EntityType<? extends ThornsprigEntityProjectile> type, LivingEntity entity, Level world) {
		super(type, entity, world);
	}

	@Override
	public Packet<ClientGamePacketListener> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	protected void doPostHurtEffects(LivingEntity livingEntity) {
		super.doPostHurtEffects(livingEntity);
		livingEntity.setArrowCount(livingEntity.getArrowCount() - 1);
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public ItemStack getItem() {
		return new ItemStack(Items.SLIME_BALL);
	}

	@Override
	protected ItemStack getPickupItem() {
		return new ItemStack(Items.SLIME_BALL);
	}
}
