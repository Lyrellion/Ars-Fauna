
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.arsfauna.init;

import net.neoforged.neoforge.client.event.RegisterParticleProvidersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.arsfauna.client.particle.LaserBeamBaseParticle;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ArsFaunaModParticles {
	@SubscribeEvent
	public static void registerParticles(RegisterParticleProvidersEvent event) {
		event.registerSpriteSet(ArsFaunaModParticleTypes.LASER_BEAM_BASE.get(), LaserBeamBaseParticle::provider);
	}
}
