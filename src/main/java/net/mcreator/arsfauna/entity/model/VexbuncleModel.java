package net.mcreator.arsfauna.entity.model;

import software.bernie.geckolib.model.data.EntityModelData;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.constant.DataTickets;

import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.arsfauna.entity.VexbuncleEntity;

public class VexbuncleModel extends GeoModel<VexbuncleEntity> {
	@Override
	public ResourceLocation getAnimationResource(VexbuncleEntity entity) {
		return new ResourceLocation("ars_fauna", "animations/vexbuncle.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(VexbuncleEntity entity) {
		return new ResourceLocation("ars_fauna", "geo/vexbuncle.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(VexbuncleEntity entity) {
		return new ResourceLocation("ars_fauna", "textures/entities/" + entity.getTexture() + ".png");
	}

	@Override
	public void setCustomAnimations(VexbuncleEntity animatable, long instanceId, AnimationState animationState) {
		CoreGeoBone head = getAnimationProcessor().getBone("head");
		if (head != null) {
			EntityModelData entityData = (EntityModelData) animationState.getData(DataTickets.ENTITY_MODEL_DATA);
			head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
			head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
		}

	}
}
