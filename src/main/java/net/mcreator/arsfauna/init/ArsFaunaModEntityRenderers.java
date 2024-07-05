
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.arsfauna.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.arsfauna.client.renderer.ZombuncleRenderer;
import net.mcreator.arsfauna.client.renderer.VexbuncleRenderer;
import net.mcreator.arsfauna.client.renderer.StarbuncleSwarmRenderer;
import net.mcreator.arsfauna.client.renderer.SkelebuncleRenderer;
import net.mcreator.arsfauna.client.renderer.ShellbuncleRenderer;
import net.mcreator.arsfauna.client.renderer.ShadowbuncleRenderer;
import net.mcreator.arsfauna.client.renderer.SeabuncleRenderer;
import net.mcreator.arsfauna.client.renderer.SculkbuncleRenderer;
import net.mcreator.arsfauna.client.renderer.SandbuncleRenderer;
import net.mcreator.arsfauna.client.renderer.PyrobuncleRenderer;
import net.mcreator.arsfauna.client.renderer.GoobuncleRenderer;
import net.mcreator.arsfauna.client.renderer.GiantCarnivorousStarbuncleRenderer;
import net.mcreator.arsfauna.client.renderer.FrostbuncleRenderer;
import net.mcreator.arsfauna.client.renderer.EyebuncleRenderer;
import net.mcreator.arsfauna.client.renderer.EnderbuncleRenderer;
import net.mcreator.arsfauna.client.renderer.DarkDrygmyRenderer;
import net.mcreator.arsfauna.client.renderer.CloudbuncleRenderer;
import net.mcreator.arsfauna.client.renderer.CavebuncleRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ArsFaunaModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(ArsFaunaModEntities.FROSTBUNCLE.get(), FrostbuncleRenderer::new);
		event.registerEntityRenderer(ArsFaunaModEntities.SEABUNCLE.get(), SeabuncleRenderer::new);
		event.registerEntityRenderer(ArsFaunaModEntities.STARBUNCLE_SWARM.get(), StarbuncleSwarmRenderer::new);
		event.registerEntityRenderer(ArsFaunaModEntities.EYEBUNCLE.get(), EyebuncleRenderer::new);
		event.registerEntityRenderer(ArsFaunaModEntities.PYROBUNCLE.get(), PyrobuncleRenderer::new);
		event.registerEntityRenderer(ArsFaunaModEntities.SANDBUNCLE.get(), SandbuncleRenderer::new);
		event.registerEntityRenderer(ArsFaunaModEntities.ZOMBUNCLE.get(), ZombuncleRenderer::new);
		event.registerEntityRenderer(ArsFaunaModEntities.SCULKBUNCLE.get(), SculkbuncleRenderer::new);
		event.registerEntityRenderer(ArsFaunaModEntities.VEXBUNCLE.get(), VexbuncleRenderer::new);
		event.registerEntityRenderer(ArsFaunaModEntities.SKELEBUNCLE.get(), SkelebuncleRenderer::new);
		event.registerEntityRenderer(ArsFaunaModEntities.SHADOWBUNCLE.get(), ShadowbuncleRenderer::new);
		event.registerEntityRenderer(ArsFaunaModEntities.CLOUDBUNCLE.get(), CloudbuncleRenderer::new);
		event.registerEntityRenderer(ArsFaunaModEntities.GIANT_CARNIVOROUS_STARBUNCLE.get(), GiantCarnivorousStarbuncleRenderer::new);
		event.registerEntityRenderer(ArsFaunaModEntities.FIREBOLT.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(ArsFaunaModEntities.FROSTBOLT.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(ArsFaunaModEntities.GOOBUNCLE.get(), GoobuncleRenderer::new);
		event.registerEntityRenderer(ArsFaunaModEntities.ENDERBUNCLE.get(), EnderbuncleRenderer::new);
		event.registerEntityRenderer(ArsFaunaModEntities.CAVEBUNCLE.get(), CavebuncleRenderer::new);
		event.registerEntityRenderer(ArsFaunaModEntities.SHELLBUNCLE.get(), ShellbuncleRenderer::new);
		event.registerEntityRenderer(ArsFaunaModEntities.SHELLBUNCLE_TRIDENT.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(ArsFaunaModEntities.DARK_DRYGMY_BOLT.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(ArsFaunaModEntities.DARK_DRYGMY.get(), DarkDrygmyRenderer::new);
		event.registerEntityRenderer(ArsFaunaModEntities.SCULK_TRIGGER.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(ArsFaunaModEntities.LASER_BEAM_PROJECTILE.get(), ThrownItemRenderer::new);
	}
}
