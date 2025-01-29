
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.arsfauna.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.entity.RegisterSpawnPlacementsEvent;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.registries.Registries;

import net.mcreator.arsfauna.entity.ZombuncleEntity;
import net.mcreator.arsfauna.entity.VexbuncleEntity;
import net.mcreator.arsfauna.entity.ThornsprigEntity;
import net.mcreator.arsfauna.entity.ThornBoltEntity;
import net.mcreator.arsfauna.entity.TentabuncleEntity;
import net.mcreator.arsfauna.entity.StarbuncleSwarmEntity;
import net.mcreator.arsfauna.entity.SongbuncleEntity;
import net.mcreator.arsfauna.entity.SkelebuncleEntity;
import net.mcreator.arsfauna.entity.ShellbuncleTridentEntity;
import net.mcreator.arsfauna.entity.ShellbuncleEntity;
import net.mcreator.arsfauna.entity.ShadowbuncleEntity;
import net.mcreator.arsfauna.entity.SeasprigEntity;
import net.mcreator.arsfauna.entity.SeabuncleEntity;
import net.mcreator.arsfauna.entity.SculkbuncleEntity;
import net.mcreator.arsfauna.entity.SculkTriggerEntity;
import net.mcreator.arsfauna.entity.SandbuncleEntity;
import net.mcreator.arsfauna.entity.PyrobuncleEntity;
import net.mcreator.arsfauna.entity.PsychicBlastEntity;
import net.mcreator.arsfauna.entity.LaserBeamProjectileEntity;
import net.mcreator.arsfauna.entity.IllusibuncleEntity;
import net.mcreator.arsfauna.entity.GoobuncleEntity;
import net.mcreator.arsfauna.entity.GiantCarnivorousStarbuncleEntity;
import net.mcreator.arsfauna.entity.FrostbuncleEntity;
import net.mcreator.arsfauna.entity.FrostboltEntity;
import net.mcreator.arsfauna.entity.FireboltEntity;
import net.mcreator.arsfauna.entity.FaebuncleEntity;
import net.mcreator.arsfauna.entity.EyebuncleEntity;
import net.mcreator.arsfauna.entity.EnderbuncleEntity;
import net.mcreator.arsfauna.entity.DeepsprigEntity;
import net.mcreator.arsfauna.entity.DarkDrygmyEntity;
import net.mcreator.arsfauna.entity.DarkDrygmyBoltEntity;
import net.mcreator.arsfauna.entity.CloudbuncleEntity;
import net.mcreator.arsfauna.entity.ChefbuncleEntity;
import net.mcreator.arsfauna.entity.CavebuncleEntity;
import net.mcreator.arsfauna.ArsFaunaMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class ArsFaunaModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(Registries.ENTITY_TYPE, ArsFaunaMod.MODID);
	public static final DeferredHolder<EntityType<?>, EntityType<FrostbuncleEntity>> FROSTBUNCLE = register("frostbuncle",
			EntityType.Builder.<FrostbuncleEntity>of(FrostbuncleEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<SeabuncleEntity>> SEABUNCLE = register("seabuncle",
			EntityType.Builder.<SeabuncleEntity>of(SeabuncleEntity::new, MobCategory.WATER_CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<StarbuncleSwarmEntity>> STARBUNCLE_SWARM = register("starbuncle_swarm",
			EntityType.Builder.<StarbuncleSwarmEntity>of(StarbuncleSwarmEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 0.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<EyebuncleEntity>> EYEBUNCLE = register("eyebuncle",
			EntityType.Builder.<EyebuncleEntity>of(EyebuncleEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.2f));
	public static final DeferredHolder<EntityType<?>, EntityType<PyrobuncleEntity>> PYROBUNCLE = register("pyrobuncle",
			EntityType.Builder.<PyrobuncleEntity>of(PyrobuncleEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.6f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<SandbuncleEntity>> SANDBUNCLE = register("sandbuncle",
			EntityType.Builder.<SandbuncleEntity>of(SandbuncleEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<ZombuncleEntity>> ZOMBUNCLE = register("zombuncle",
			EntityType.Builder.<ZombuncleEntity>of(ZombuncleEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<SculkbuncleEntity>> SCULKBUNCLE = register("sculkbuncle",
			EntityType.Builder.<SculkbuncleEntity>of(SculkbuncleEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<VexbuncleEntity>> VEXBUNCLE = register("vexbuncle",
			EntityType.Builder.<VexbuncleEntity>of(VexbuncleEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<SkelebuncleEntity>> SKELEBUNCLE = register("skelebuncle",
			EntityType.Builder.<SkelebuncleEntity>of(SkelebuncleEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<ShadowbuncleEntity>> SHADOWBUNCLE = register("shadowbuncle",
			EntityType.Builder.<ShadowbuncleEntity>of(ShadowbuncleEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.6f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<CloudbuncleEntity>> CLOUDBUNCLE = register("cloudbuncle",
			EntityType.Builder.<CloudbuncleEntity>of(CloudbuncleEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.6f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<GiantCarnivorousStarbuncleEntity>> GIANT_CARNIVOROUS_STARBUNCLE = register("giant_carnivorous_starbuncle",
			EntityType.Builder.<GiantCarnivorousStarbuncleEntity>of(GiantCarnivorousStarbuncleEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.9f, 2.4f));
	public static final DeferredHolder<EntityType<?>, EntityType<FireboltEntity>> FIREBOLT = register("firebolt",
			EntityType.Builder.<FireboltEntity>of(FireboltEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<FrostboltEntity>> FROSTBOLT = register("frostbolt",
			EntityType.Builder.<FrostboltEntity>of(FrostboltEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<GoobuncleEntity>> GOOBUNCLE = register("goobuncle",
			EntityType.Builder.<GoobuncleEntity>of(GoobuncleEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<EnderbuncleEntity>> ENDERBUNCLE = register("enderbuncle",
			EntityType.Builder.<EnderbuncleEntity>of(EnderbuncleEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.6f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<CavebuncleEntity>> CAVEBUNCLE = register("cavebuncle",
			EntityType.Builder.<CavebuncleEntity>of(CavebuncleEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<ShellbuncleEntity>> SHELLBUNCLE = register("shellbuncle",
			EntityType.Builder.<ShellbuncleEntity>of(ShellbuncleEntity::new, MobCategory.WATER_CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.2f));
	public static final DeferredHolder<EntityType<?>, EntityType<ShellbuncleTridentEntity>> SHELLBUNCLE_TRIDENT = register("shellbuncle_trident",
			EntityType.Builder.<ShellbuncleTridentEntity>of(ShellbuncleTridentEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<DarkDrygmyBoltEntity>> DARK_DRYGMY_BOLT = register("dark_drygmy_bolt",
			EntityType.Builder.<DarkDrygmyBoltEntity>of(DarkDrygmyBoltEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<DarkDrygmyEntity>> DARK_DRYGMY = register("dark_drygmy",
			EntityType.Builder.<DarkDrygmyEntity>of(DarkDrygmyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.2f));
	public static final DeferredHolder<EntityType<?>, EntityType<SculkTriggerEntity>> SCULK_TRIGGER = register("sculk_trigger",
			EntityType.Builder.<SculkTriggerEntity>of(SculkTriggerEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<LaserBeamProjectileEntity>> LASER_BEAM_PROJECTILE = register("laser_beam_projectile",
			EntityType.Builder.<LaserBeamProjectileEntity>of(LaserBeamProjectileEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<SongbuncleEntity>> SONGBUNCLE = register("songbuncle",
			EntityType.Builder.<SongbuncleEntity>of(SongbuncleEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<ChefbuncleEntity>> CHEFBUNCLE = register("chefbuncle",
			EntityType.Builder.<ChefbuncleEntity>of(ChefbuncleEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<TentabuncleEntity>> TENTABUNCLE = register("tentabuncle",
			EntityType.Builder.<TentabuncleEntity>of(TentabuncleEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<IllusibuncleEntity>> ILLUSIBUNCLE = register("illusibuncle",
			EntityType.Builder.<IllusibuncleEntity>of(IllusibuncleEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<DeepsprigEntity>> DEEPSPRIG = register("deepsprig",
			EntityType.Builder.<DeepsprigEntity>of(DeepsprigEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<SeasprigEntity>> SEASPRIG = register("seasprig",
			EntityType.Builder.<SeasprigEntity>of(SeasprigEntity::new, MobCategory.WATER_CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<ThornsprigEntity>> THORNSPRIG = register("thornsprig",
			EntityType.Builder.<ThornsprigEntity>of(ThornsprigEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<ThornBoltEntity>> THORN_BOLT = register("thorn_bolt",
			EntityType.Builder.<ThornBoltEntity>of(ThornBoltEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<PsychicBlastEntity>> PSYCHIC_BLAST = register("psychic_blast",
			EntityType.Builder.<PsychicBlastEntity>of(PsychicBlastEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<FaebuncleEntity>> FAEBUNCLE = register("faebuncle",
			EntityType.Builder.<FaebuncleEntity>of(FaebuncleEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.6f, 1.2f));

	// Start of user code block custom entities
	// End of user code block custom entities
	private static <T extends Entity> DeferredHolder<EntityType<?>, EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(RegisterSpawnPlacementsEvent event) {
		FrostbuncleEntity.init(event);
		SeabuncleEntity.init(event);
		StarbuncleSwarmEntity.init(event);
		EyebuncleEntity.init(event);
		PyrobuncleEntity.init(event);
		SandbuncleEntity.init(event);
		ZombuncleEntity.init(event);
		SculkbuncleEntity.init(event);
		VexbuncleEntity.init(event);
		SkelebuncleEntity.init(event);
		ShadowbuncleEntity.init(event);
		CloudbuncleEntity.init(event);
		GiantCarnivorousStarbuncleEntity.init(event);
		GoobuncleEntity.init(event);
		EnderbuncleEntity.init(event);
		CavebuncleEntity.init(event);
		ShellbuncleEntity.init(event);
		DarkDrygmyEntity.init(event);
		SongbuncleEntity.init(event);
		ChefbuncleEntity.init(event);
		TentabuncleEntity.init(event);
		IllusibuncleEntity.init(event);
		DeepsprigEntity.init(event);
		SeasprigEntity.init(event);
		ThornsprigEntity.init(event);
		FaebuncleEntity.init(event);
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
		event.put(SONGBUNCLE.get(), SongbuncleEntity.createAttributes().build());
		event.put(CHEFBUNCLE.get(), ChefbuncleEntity.createAttributes().build());
		event.put(TENTABUNCLE.get(), TentabuncleEntity.createAttributes().build());
		event.put(ILLUSIBUNCLE.get(), IllusibuncleEntity.createAttributes().build());
		event.put(DEEPSPRIG.get(), DeepsprigEntity.createAttributes().build());
		event.put(SEASPRIG.get(), SeasprigEntity.createAttributes().build());
		event.put(THORNSPRIG.get(), ThornsprigEntity.createAttributes().build());
		event.put(FAEBUNCLE.get(), FaebuncleEntity.createAttributes().build());
	}
}
