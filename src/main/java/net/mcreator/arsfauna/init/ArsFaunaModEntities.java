
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.arsfauna.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.arsfauna.entity.ZombuncleEntity;
import net.mcreator.arsfauna.entity.VexbuncleEntity;
import net.mcreator.arsfauna.entity.StarbuncleSwarmEntity;
import net.mcreator.arsfauna.entity.SkelebuncleEntity;
import net.mcreator.arsfauna.entity.ShellbuncleTridentEntity;
import net.mcreator.arsfauna.entity.ShellbuncleEntity;
import net.mcreator.arsfauna.entity.ShadowbuncleEntity;
import net.mcreator.arsfauna.entity.SeabuncleEntity;
import net.mcreator.arsfauna.entity.SculkbuncleEntity;
import net.mcreator.arsfauna.entity.SculkTriggerEntity;
import net.mcreator.arsfauna.entity.SandbuncleEntity;
import net.mcreator.arsfauna.entity.PyrobuncleEntity;
import net.mcreator.arsfauna.entity.LaserBeamProjectileEntity;
import net.mcreator.arsfauna.entity.GoobuncleEntity;
import net.mcreator.arsfauna.entity.GiantCarnivorousStarbuncleEntity;
import net.mcreator.arsfauna.entity.FrostbuncleEntity;
import net.mcreator.arsfauna.entity.FrostboltEntity;
import net.mcreator.arsfauna.entity.FireboltEntity;
import net.mcreator.arsfauna.entity.EyebuncleEntity;
import net.mcreator.arsfauna.entity.EnderbuncleEntity;
import net.mcreator.arsfauna.entity.DarkDrygmyEntity;
import net.mcreator.arsfauna.entity.DarkDrygmyBoltEntity;
import net.mcreator.arsfauna.entity.CloudbuncleEntity;
import net.mcreator.arsfauna.entity.CavebuncleEntity;
import net.mcreator.arsfauna.ArsFaunaMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ArsFaunaModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, ArsFaunaMod.MODID);
	public static final RegistryObject<EntityType<FrostbuncleEntity>> FROSTBUNCLE = register("frostbuncle",
			EntityType.Builder.<FrostbuncleEntity>of(FrostbuncleEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(FrostbuncleEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<SeabuncleEntity>> SEABUNCLE = register("seabuncle",
			EntityType.Builder.<SeabuncleEntity>of(SeabuncleEntity::new, MobCategory.WATER_CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SeabuncleEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<StarbuncleSwarmEntity>> STARBUNCLE_SWARM = register("starbuncle_swarm",
			EntityType.Builder.<StarbuncleSwarmEntity>of(StarbuncleSwarmEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(StarbuncleSwarmEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<EyebuncleEntity>> EYEBUNCLE = register("eyebuncle",
			EntityType.Builder.<EyebuncleEntity>of(EyebuncleEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EyebuncleEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<PyrobuncleEntity>> PYROBUNCLE = register("pyrobuncle", EntityType.Builder.<PyrobuncleEntity>of(PyrobuncleEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
			.setUpdateInterval(3).setCustomClientFactory(PyrobuncleEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<SandbuncleEntity>> SANDBUNCLE = register("sandbuncle",
			EntityType.Builder.<SandbuncleEntity>of(SandbuncleEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SandbuncleEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ZombuncleEntity>> ZOMBUNCLE = register("zombuncle",
			EntityType.Builder.<ZombuncleEntity>of(ZombuncleEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ZombuncleEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<SculkbuncleEntity>> SCULKBUNCLE = register("sculkbuncle",
			EntityType.Builder.<SculkbuncleEntity>of(SculkbuncleEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SculkbuncleEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<VexbuncleEntity>> VEXBUNCLE = register("vexbuncle",
			EntityType.Builder.<VexbuncleEntity>of(VexbuncleEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(VexbuncleEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<SkelebuncleEntity>> SKELEBUNCLE = register("skelebuncle",
			EntityType.Builder.<SkelebuncleEntity>of(SkelebuncleEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SkelebuncleEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ShadowbuncleEntity>> SHADOWBUNCLE = register("shadowbuncle", EntityType.Builder.<ShadowbuncleEntity>of(ShadowbuncleEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ShadowbuncleEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<CloudbuncleEntity>> CLOUDBUNCLE = register("cloudbuncle", EntityType.Builder.<CloudbuncleEntity>of(CloudbuncleEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CloudbuncleEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<GiantCarnivorousStarbuncleEntity>> GIANT_CARNIVOROUS_STARBUNCLE = register("giant_carnivorous_starbuncle",
			EntityType.Builder.<GiantCarnivorousStarbuncleEntity>of(GiantCarnivorousStarbuncleEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(GiantCarnivorousStarbuncleEntity::new)

					.sized(0.9f, 2.4f));
	public static final RegistryObject<EntityType<FireboltEntity>> FIREBOLT = register("firebolt",
			EntityType.Builder.<FireboltEntity>of(FireboltEntity::new, MobCategory.MISC).setCustomClientFactory(FireboltEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<FrostboltEntity>> FROSTBOLT = register("frostbolt",
			EntityType.Builder.<FrostboltEntity>of(FrostboltEntity::new, MobCategory.MISC).setCustomClientFactory(FrostboltEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<GoobuncleEntity>> GOOBUNCLE = register("goobuncle",
			EntityType.Builder.<GoobuncleEntity>of(GoobuncleEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GoobuncleEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<EnderbuncleEntity>> ENDERBUNCLE = register("enderbuncle", EntityType.Builder.<EnderbuncleEntity>of(EnderbuncleEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EnderbuncleEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<CavebuncleEntity>> CAVEBUNCLE = register("cavebuncle",
			EntityType.Builder.<CavebuncleEntity>of(CavebuncleEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CavebuncleEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ShellbuncleEntity>> SHELLBUNCLE = register("shellbuncle",
			EntityType.Builder.<ShellbuncleEntity>of(ShellbuncleEntity::new, MobCategory.WATER_CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ShellbuncleEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ShellbuncleTridentEntity>> SHELLBUNCLE_TRIDENT = register("shellbuncle_trident", EntityType.Builder.<ShellbuncleTridentEntity>of(ShellbuncleTridentEntity::new, MobCategory.MISC)
			.setCustomClientFactory(ShellbuncleTridentEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<DarkDrygmyBoltEntity>> DARK_DRYGMY_BOLT = register("dark_drygmy_bolt",
			EntityType.Builder.<DarkDrygmyBoltEntity>of(DarkDrygmyBoltEntity::new, MobCategory.MISC).setCustomClientFactory(DarkDrygmyBoltEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<DarkDrygmyEntity>> DARK_DRYGMY = register("dark_drygmy",
			EntityType.Builder.<DarkDrygmyEntity>of(DarkDrygmyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DarkDrygmyEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<SculkTriggerEntity>> SCULK_TRIGGER = register("sculk_trigger",
			EntityType.Builder.<SculkTriggerEntity>of(SculkTriggerEntity::new, MobCategory.MISC).setCustomClientFactory(SculkTriggerEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<LaserBeamProjectileEntity>> LASER_BEAM_PROJECTILE = register("laser_beam_projectile", EntityType.Builder.<LaserBeamProjectileEntity>of(LaserBeamProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(LaserBeamProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			FrostbuncleEntity.init();
			SeabuncleEntity.init();
			StarbuncleSwarmEntity.init();
			EyebuncleEntity.init();
			PyrobuncleEntity.init();
			SandbuncleEntity.init();
			ZombuncleEntity.init();
			SculkbuncleEntity.init();
			VexbuncleEntity.init();
			SkelebuncleEntity.init();
			ShadowbuncleEntity.init();
			CloudbuncleEntity.init();
			GiantCarnivorousStarbuncleEntity.init();
			GoobuncleEntity.init();
			EnderbuncleEntity.init();
			CavebuncleEntity.init();
			ShellbuncleEntity.init();
			DarkDrygmyEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(FROSTBUNCLE.get(), FrostbuncleEntity.createAttributes().build());
		event.put(SEABUNCLE.get(), SeabuncleEntity.createAttributes().build());
		event.put(STARBUNCLE_SWARM.get(), StarbuncleSwarmEntity.createAttributes().build());
		event.put(EYEBUNCLE.get(), EyebuncleEntity.createAttributes().build());
		event.put(PYROBUNCLE.get(), PyrobuncleEntity.createAttributes().build());
		event.put(SANDBUNCLE.get(), SandbuncleEntity.createAttributes().build());
		event.put(ZOMBUNCLE.get(), ZombuncleEntity.createAttributes().build());
		event.put(SCULKBUNCLE.get(), SculkbuncleEntity.createAttributes().build());
		event.put(VEXBUNCLE.get(), VexbuncleEntity.createAttributes().build());
		event.put(SKELEBUNCLE.get(), SkelebuncleEntity.createAttributes().build());
		event.put(SHADOWBUNCLE.get(), ShadowbuncleEntity.createAttributes().build());
		event.put(CLOUDBUNCLE.get(), CloudbuncleEntity.createAttributes().build());
		event.put(GIANT_CARNIVOROUS_STARBUNCLE.get(), GiantCarnivorousStarbuncleEntity.createAttributes().build());
		event.put(GOOBUNCLE.get(), GoobuncleEntity.createAttributes().build());
		event.put(ENDERBUNCLE.get(), EnderbuncleEntity.createAttributes().build());
		event.put(CAVEBUNCLE.get(), CavebuncleEntity.createAttributes().build());
		event.put(SHELLBUNCLE.get(), ShellbuncleEntity.createAttributes().build());
		event.put(DARK_DRYGMY.get(), DarkDrygmyEntity.createAttributes().build());
	}
}
