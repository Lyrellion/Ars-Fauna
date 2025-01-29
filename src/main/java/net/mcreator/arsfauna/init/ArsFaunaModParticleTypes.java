
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.arsfauna.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.core.registries.Registries;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

import net.mcreator.arsfauna.ArsFaunaMod;

public class ArsFaunaModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(Registries.PARTICLE_TYPE, ArsFaunaMod.MODID);
	public static final DeferredHolder<ParticleType<?>, SimpleParticleType> LASER_BEAM_BASE = REGISTRY.register("laser_beam_base", () -> new SimpleParticleType(false));
}
