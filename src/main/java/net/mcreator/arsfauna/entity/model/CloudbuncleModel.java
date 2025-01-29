package net.mcreator.arsfauna.entity.model;

import software.bernie.geckolib.model.data.EntityModelData;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.constant.DataTickets;
import software.bernie.geckolib.cache.object.GeoBone;
import software.bernie.geckolib.animation.AnimationState;

import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.arsfauna.entity.CloudbuncleEntity;

public class CloudbuncleModel extends GeoModel<CloudbuncleEntity> {
	@Override
	public ResourceLocation getAnimationResource(CloudbuncleEntity entity) {
		return ResourceLocation.parse("ars_fauna:animations/cloudbuncle.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CloudbuncleEntity entity) {
		return ResourceLocation.parse("ars_fauna:geo/cloudbuncle.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CloudbuncleEntity entity) {
		return ResourceLocation.parse("ars_fauna:textures/entities/" + entity.getTexture() + ".png");
	}

	@Override
	public void setCustomAnimations(CloudbuncleEntity animatable, long instanceId, AnimationState animationState) {
		GeoBone head = getAnimationProcessor().getBone("head");
		if (head != null) {
			EntityModelData entityData = (EntityModelData) animationState.getData(DataTickets.ENTITY_MODEL_DATA);
			head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
			head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
		}

	}
}
