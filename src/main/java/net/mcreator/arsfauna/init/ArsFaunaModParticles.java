
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.arsfauna.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.RegisterParticleProvidersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.arsfauna.client.particle.LaserBeamBaseParticle;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ArsFaunaModParticles {
	@SubscribeEvent
	public static void registerParticles(RegisterParticleProvidersEvent event) {
		event.registerSpriteSet(ArsFaunaModParticleTypes.LASER_BEAM_BASE.get(), LaserBeamBaseParticle::provider);
	}
}
