// Made with Blockbench 5.0.7
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelwindowbreaker_entitys<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "windowbreaker_entitys"), "main");
	private final ModelPart all;
	private final ModelPart body;
	private final ModelPart zarm;
	private final ModelPart yarm;
	private final ModelPart chui;
	private final ModelPart head;
	private final ModelPart leg;
	private final ModelPart zleg;
	private final ModelPart yleg;

	public Modelwindowbreaker_entitys(ModelPart root) {
		this.all = root.getChild("all");
		this.body = this.all.getChild("body");
		this.zarm = this.body.getChild("zarm");
		this.yarm = this.body.getChild("yarm");
		this.chui = this.yarm.getChild("chui");
		this.head = this.body.getChild("head");
		this.leg = this.all.getChild("leg");
		this.zleg = this.leg.getChild("zleg");
		this.yleg = this.leg.getChild("yleg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition all = partdefinition.addOrReplaceChild("all", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition body = all.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -14.0F,
				-2.0F, 8.0F, 14.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -14.0F, 0.0F));

		PartDefinition zarm = body.addOrReplaceChild("zarm", CubeListBuilder.create().texOffs(16, 36).addBox(-2.0F,
				0.0F, -2.0F, 4.0F, 14.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-6.0F, -14.0F, 0.0F));

		PartDefinition yarm = body.addOrReplaceChild("yarm", CubeListBuilder.create().texOffs(0, 30).addBox(-2.0F, 0.0F,
				-2.0F, 4.0F, 14.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(6.0F, -14.0F, 0.0F));

		PartDefinition chui = yarm.addOrReplaceChild("chui",
				CubeListBuilder.create().texOffs(40, 0)
						.addBox(-1.0F, -2.0F, -9.0F, 3.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(32, 36)
						.addBox(0.0F, 0.0F, -6.0F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 13.0F, 0.0F));

		PartDefinition cube_r1 = chui
				.addOrReplaceChild("cube_r1",
						CubeListBuilder.create().texOffs(40, 10).addBox(-2.0F, 0.0F, 0.0F, 3.0F, 2.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(1.0F, 5.0F, -9.0F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r2 = chui.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(40, 14).addBox(-2.0F, 0.0F, -2.0F, 3.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 5.0F, -6.0F, -0.7854F, 0.0F, 0.0F));

		PartDefinition head = body.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 18).addBox(-3.0F,
				-34.0F, -3.0F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 14.0F, 0.0F));

		PartDefinition leg = all.addOrReplaceChild("leg", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition zleg = leg.addOrReplaceChild("zleg", CubeListBuilder.create().texOffs(24, 0).addBox(-2.0F, 0.0F,
				-2.0F, 4.0F, 14.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -14.0F, 0.0F));

		PartDefinition yleg = leg.addOrReplaceChild("yleg", CubeListBuilder.create().texOffs(24, 18).addBox(-2.0F, 0.0F,
				-2.0F, 4.0F, 14.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, -14.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		all.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}