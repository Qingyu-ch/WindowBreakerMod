package net.mcreator.windowbreaker.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.animation.KeyframeAnimations;
import net.minecraft.client.animation.AnimationDefinition;

import net.mcreator.windowbreaker.entity.BreakerEntity;
import net.mcreator.windowbreaker.client.model.animations.windowbreaker_entitysAnimation;
import net.mcreator.windowbreaker.client.model.Modelwindowbreaker_entitys;

import com.mojang.math.Vector3f;

public class BreakerRenderer extends MobRenderer<BreakerEntity, Modelwindowbreaker_entitys<BreakerEntity>> {
	public BreakerRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(Modelwindowbreaker_entitys.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(BreakerEntity entity) {
		return new ResourceLocation("window_breaker:textures/entities/windowbreaker.png");
	}

	private static final class AnimatedModel extends Modelwindowbreaker_entitys<BreakerEntity> {
		private final ModelPart root;
		private final HierarchicalModel animator = new HierarchicalModel<BreakerEntity>() {
			private static final Vector3f ANIMATION_VECTOR_CACHE = new Vector3f();

			@Override
			public ModelPart root() {
				return root;
			}

			private void animateWalk(AnimationDefinition animationDefinition, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw) {
				long accumulatedTime = (long) (limbSwing * 50.0F * ageInTicks);
				float scale = Math.min(limbSwingAmount * netHeadYaw, 1.0F);
				KeyframeAnimations.animate(this, animationDefinition, accumulatedTime, scale, ANIMATION_VECTOR_CACHE);
			}

			@Override
			public void setupAnim(BreakerEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
				this.root().getAllParts().forEach(ModelPart::resetPose);
				this.animateWalk(windowbreaker_entitysAnimation.WALK_A, limbSwing, limbSwingAmount, 1f, 1f);
				this.animate(entity.animationState1, windowbreaker_entitysAnimation.WALK_B, ageInTicks, 1f);
			}
		};

		public AnimatedModel(ModelPart root) {
			super(root);
			this.root = root;
		}

		@Override
		public void setupAnim(BreakerEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			animator.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
			super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
		}
	}
}