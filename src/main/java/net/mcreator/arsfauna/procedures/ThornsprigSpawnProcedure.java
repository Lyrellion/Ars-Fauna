package net.mcreator.arsfauna.procedures;

import net.mcreator.arsfauna.init.ArsFaunaModGamerules;
import net.minecraft.client.gui.screens.worldselection.WorldCreationUiState;
import net.neoforged.neoforge.event.level.BlockEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.tags.BlockTags;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.arsfauna.init.ArsFaunaModEntities;

import javax.annotation.Nullable;

@EventBusSubscriber
public class ThornsprigSpawnProcedure {
	@SubscribeEvent
	public static void onBlockBreak(BlockEvent.BreakEvent event) {
		execute(event, event.getLevel(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), event.getState());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, BlockState blockstate) {
		execute(null, world, x, y, z, blockstate);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, BlockState blockstate) {
		if (blockstate.is(BlockTags.create(ResourceLocation.parse("minecraft:logs")))) {
			if (world instanceof ServerLevel level) {
				if (Mth.nextInt(RandomSource.create(), 1, 100) < level.getGameRules().getInt(ArsFaunaModGamerules.RULE_THORNSPRIG_SPAWN_CHANCE)) {
					Entity entityToSpawn = ArsFaunaModEntities.THORNSPRIG.get().spawn(level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(level.getRandom().nextFloat() * 360F);
					}
				}
			}
		}
	}
}
