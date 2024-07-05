
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.arsfauna.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

import net.mcreator.arsfauna.ArsFaunaMod;

public class ArsFaunaModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, ArsFaunaMod.MODID);
	public static final RegistryObject<SimpleParticleType> LASER_BEAM_BASE = REGISTRY.register("laser_beam_base", () -> new SimpleParticleType(false));
}
