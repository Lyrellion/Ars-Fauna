package net.mcreator.arsfauna.entity.model;

import software.bernie.geckolib.model.data.EntityModelData;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.constant.DataTickets;

import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.arsfauna.entity.SandbuncleEntity;

public class SandbuncleModel extends GeoModel<SandbuncleEntity> {
	@Override
	public ResourceLocation getAnimationResource(SandbuncleEntity entity) {
		return new ResourceLocation("ars_fauna", "animations/sandbuncle.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SandbuncleEntity entity) {
		return new ResourceLocation("ars_fauna", "geo/sandbuncle.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SandbuncleEntity entity) {
		return new ResourceLocation("ars_fauna", "textures/entities/" + entity.getTexture() + ".png");
	}

	@Override
	public void setCustomAnimations(SandbuncleEntity animatable, long instanceId, AnimationState animationState) {
		CoreGeoBone head = getAnimationProcessor().getBone("head");
		if (head != null) {
			EntityModelData entityData = (EntityModelData) animationState.getData(DataTickets.ENTITY_MODEL_DATA);
			head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
			head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
		}

	}
}
