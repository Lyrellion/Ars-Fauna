
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.arsfauna.init;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.mcreator.arsfauna.ArsFaunaMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ArsFaunaModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ArsFaunaMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(ArsFaunaModItems.SEABUNCLE_SPAWN_EGG.get());
			tabData.accept(ArsFaunaModItems.FROSTBUNCLE_SPAWN_EGG.get());
			tabData.accept(ArsFaunaModItems.STARBUNCLE_SWARM_SPAWN_EGG.get());
			tabData.accept(ArsFaunaModItems.EYEBUNCLE_SPAWN_EGG.get());
			tabData.accept(ArsFaunaModItems.PYROBUNCLE_SPAWN_EGG.get());
			tabData.accept(ArsFaunaModItems.SANDBUNCLE_SPAWN_EGG.get());
			tabData.accept(ArsFaunaModItems.ZOMBUNCLE_SPAWN_EGG.get());
			tabData.accept(ArsFaunaModItems.SCULKBUNCLE_SPAWN_EGG.get());
			tabData.accept(ArsFaunaModItems.VEXBUNCLE_SPAWN_EGG.get());
			tabData.accept(ArsFaunaModItems.SKELEBUNCLE_SPAWN_EGG.get());
			tabData.accept(ArsFaunaModItems.SHADOWBUNCLE_SPAWN_EGG.get());
			tabData.accept(ArsFaunaModItems.CLOUDBUNCLE_SPAWN_EGG.get());
			tabData.accept(ArsFaunaModItems.GIANT_CARNIVOROUS_STARBUNCLE_SPAWN_EGG.get());
			tabData.accept(ArsFaunaModItems.GOOBUNCLE_SPAWN_EGG.get());
			tabData.accept(ArsFaunaModItems.ENDERBUNCLE_SPAWN_EGG.get());
			tabData.accept(ArsFaunaModItems.CAVEBUNCLE_SPAWN_EGG.get());
			tabData.accept(ArsFaunaModItems.SHELLBUNCLE_SPAWN_EGG.get());
			tabData.accept(ArsFaunaModItems.DARK_DRYGMY_SPAWN_EGG.get());
		}
	}
}
