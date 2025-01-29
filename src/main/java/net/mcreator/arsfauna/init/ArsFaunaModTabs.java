
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.arsfauna.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.mcreator.arsfauna.ArsFaunaMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class ArsFaunaModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ArsFaunaMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(ArsFaunaModItems.FROSTBUNCLE_SPAWN_EGG.get());
			tabData.accept(ArsFaunaModItems.SEABUNCLE_SPAWN_EGG.get());
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
			tabData.accept(ArsFaunaModItems.SONGBUNCLE_SPAWN_EGG.get());
			tabData.accept(ArsFaunaModItems.CHEFBUNCLE_SPAWN_EGG.get());
			tabData.accept(ArsFaunaModItems.TENTABUNCLE_SPAWN_EGG.get());
			tabData.accept(ArsFaunaModItems.ILLUSIBUNCLE_SPAWN_EGG.get());
			tabData.accept(ArsFaunaModItems.DEEPSPRIG_SPAWN_EGG.get());
			tabData.accept(ArsFaunaModItems.SEASPRIG_SPAWN_EGG.get());
			tabData.accept(ArsFaunaModItems.THORNSPRIG_SPAWN_EGG.get());
			tabData.accept(ArsFaunaModItems.FAEBUNCLE_SPAWN_EGG.get());
		}
	}
}
