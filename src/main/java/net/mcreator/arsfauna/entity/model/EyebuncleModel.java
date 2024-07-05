package net.mcreator.arsfauna.entity.model;

import software.bernie.geckolib.model.data.EntityModelData;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.constant.DataTickets;

import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.arsfauna.entity.EyebuncleEntity;

public class EyebuncleModel extends GeoModel<EyebuncleEntity> {
	@Override
	public ResourceLocation getAnimationResource(EyebuncleEntity entity) {
		return new ResourceLocation("ars_fauna", "animations/eyebuncle.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(EyebuncleEntity entity) {
		return new ResourceLocation("ars_fauna", "geo/eyebuncle.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(EyebuncleEntity entity) {
		return new ResourceLocation("ars_fauna", "textures/entities/" + entity.getTexture() + ".png");
	}

	@Override
	public void setCustomAnimations(EyebuncleEntity animatable, long instanceId, AnimationState animationState) {
		CoreGeoBone head = getAnimationProcessor().getBone("head");
		if (head != null) {
			EntityModelData entityData = (EntityModelData) animationState.getData(DataTickets.ENTITY_MODEL_DATA);
			head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
			head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
		}

	}
}
