package net.mcreator.arsfauna.procedures;

import net.mcreator.arsfauna.init.ArsFaunaModGamerules;
import net.minecraftforge.common.util.FakePlayer;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.level.BlockEvent;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.BlockTags;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.arsfauna.init.ArsFaunaModEntities;
import org.jetbrains.annotations.NotNull;

@Mod.EventBusSubscriber
public class ThornsprigSpawnProcedure {
	@SubscribeEvent
	public static void onBlockBreak(BlockEvent.BreakEvent event) {
		execute(event, event.getLevel(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), event.getState());
	}

	private static void execute(@NotNull BlockEvent.BreakEvent event, LevelAccessor world, double x, double y, double z, BlockState blockstate) {
		if (!(world instanceof ServerLevel level) || event.getPlayer() instanceof FakePlayer) {
			return;
		}

		if (blockstate.is(BlockTags.LOGS)) {
			if (world.getRandom().nextInt(100) < level.getGameRules().getInt(ArsFaunaModGamerules.RULE_THORNSPRIG_SPAWN_CHANCE)) {
				Entity entityToSpawn = ArsFaunaModEntities.THORNSPRIG.get().spawn(level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
				}
			}
		}
	}
}