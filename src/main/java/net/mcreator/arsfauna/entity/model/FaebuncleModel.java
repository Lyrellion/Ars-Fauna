package net.mcreator.arsfauna.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.arsfauna.entity.FaebuncleEntity;

public class FaebuncleModel extends GeoModel<FaebuncleEntity> {
	@Override
	public ResourceLocation getAnimationResource(FaebuncleEntity entity) {
		return new ResourceLocation("ars_fauna", "animations/faebuncle.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FaebuncleEntity entity) {
		return new ResourceLocation("ars_fauna", "geo/faebuncle.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FaebuncleEntity entity) {
		return new ResourceLocation("ars_fauna", "textures/entities/" + entity.getTexture() + ".png");
	}

}
