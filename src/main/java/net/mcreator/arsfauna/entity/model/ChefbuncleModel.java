package net.mcreator.arsfauna.entity.model;

import software.bernie.geckolib.model.data.EntityModelData;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.constant.DataTickets;

import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.arsfauna.entity.ChefbuncleEntity;

public class ChefbuncleModel extends GeoModel<ChefbuncleEntity> {
	@Override
	public ResourceLocation getAnimationResource(ChefbuncleEntity entity) {
		return new ResourceLocation("ars_fauna", "animations/chefbuncle.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ChefbuncleEntity entity) {
		return new ResourceLocation("ars_fauna", "geo/chefbuncle.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ChefbuncleEntity entity) {
		return new ResourceLocation("ars_fauna", "textures/entities/" + entity.getTexture() + ".png");
	}

	@Override
	public void setCustomAnimations(ChefbuncleEntity animatable, long instanceId, AnimationState animationState) {
		CoreGeoBone head = getAnimationProcessor().getBone("head");
		if (head != null) {
			EntityModelData entityData = (EntityModelData) animationState.getData(DataTickets.ENTITY_MODEL_DATA);
			head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
			head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
		}

	}
}
