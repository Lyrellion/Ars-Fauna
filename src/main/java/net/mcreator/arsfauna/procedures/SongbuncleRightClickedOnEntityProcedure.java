package net.mcreator.arsfauna.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;

import net.mcreator.arsfauna.ArsFaunaMod;

public class SongbuncleRightClickedOnEntityProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.note_block.harp")), SoundSource.NEUTRAL, 2, (float) 0.707107);
			} else {
				_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.note_block.harp")), SoundSource.NEUTRAL, 2, (float) 0.707107, false);
			}
		}
		ArsFaunaMod.queueServerWork(5, () -> {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.note_block.harp")), SoundSource.NEUTRAL, 2, (float) 1.189207);
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.note_block.harp")), SoundSource.NEUTRAL, 2, (float) 1.189207, false);
				}
			}
			ArsFaunaMod.queueServerWork(5, () -> {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.note_block.harp")), SoundSource.NEUTRAL, 2, (float) 1.059463);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.note_block.harp")), SoundSource.NEUTRAL, 2, (float) 1.059463, false);
					}
				}
				ArsFaunaMod.queueServerWork(5, () -> {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.note_block.harp")), SoundSource.NEUTRAL, 2, (float) 1.189207);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.note_block.harp")), SoundSource.NEUTRAL, 2, (float) 1.189207, false);
						}
					}
					ArsFaunaMod.queueServerWork(5, () -> {
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.note_block.harp")), SoundSource.NEUTRAL, 2, (float) 0.707107);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.note_block.harp")), SoundSource.NEUTRAL, 2, (float) 0.707107, false);
							}
						}
						ArsFaunaMod.queueServerWork(10, () -> {
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.note_block.harp")), SoundSource.NEUTRAL, 2, (float) 0.707107);
								} else {
									_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.note_block.harp")), SoundSource.NEUTRAL, 2, (float) 0.707107, false);
								}
							}
							ArsFaunaMod.queueServerWork(5, () -> {
								if (world instanceof Level _level) {
									if (!_level.isClientSide()) {
										_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.note_block.harp")), SoundSource.NEUTRAL, 2, (float) 1.189207);
									} else {
										_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.note_block.harp")), SoundSource.NEUTRAL, 2, (float) 1.189207, false);
									}
								}
								ArsFaunaMod.queueServerWork(5, () -> {
									if (world instanceof Level _level) {
										if (!_level.isClientSide()) {
											_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.note_block.harp")), SoundSource.NEUTRAL, 2, (float) 1.059463);
										} else {
											_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.note_block.harp")), SoundSource.NEUTRAL, 2, (float) 1.059463, false);
										}
									}
									ArsFaunaMod.queueServerWork(5, () -> {
										if (world instanceof Level _level) {
											if (!_level.isClientSide()) {
												_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.note_block.harp")), SoundSource.NEUTRAL, 2, (float) 1.189207);
											} else {
												_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.note_block.harp")), SoundSource.NEUTRAL, 2, (float) 1.189207, false);
											}
										}
										ArsFaunaMod.queueServerWork(5, () -> {
											if (world instanceof Level _level) {
												if (!_level.isClientSide()) {
													_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.note_block.harp")), SoundSource.NEUTRAL, 2, (float) 0.749154);
												} else {
													_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.note_block.harp")), SoundSource.NEUTRAL, 2, (float) 0.749154, false);
												}
											}
										});
									});
								});
							});
						});
					});
				});
			});
		});
	}
}
