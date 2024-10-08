package net.mcreator.arsfauna.entity.model;

import software.bernie.geckolib.model.data.EntityModelData;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.constant.DataTickets;

import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.arsfauna.entity.IllusibuncleEntity;

public class IllusibuncleModel extends GeoModel<IllusibuncleEntity> {
	@Override
	public ResourceLocation getAnimationResource(IllusibuncleEntity entity) {
		return new ResourceLocation("ars_fauna", "animations/illusibuncle.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(IllusibuncleEntity entity) {
		return new ResourceLocation("ars_fauna", "geo/illusibuncle.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(IllusibuncleEntity entity) {
		return new ResourceLocation("ars_fauna", "textures/entities/" + entity.getTexture() + ".png");
	}

	@Override
	public void setCustomAnimations(IllusibuncleEntity animatable, long instanceId, AnimationState animationState) {
		CoreGeoBone head = getAnimationProcessor().getBone("head2");
		if (head != null) {
			EntityModelData entityData = (EntityModelData) animationState.getData(DataTickets.ENTITY_MODEL_DATA);
			head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
			head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
		}

	}
}
