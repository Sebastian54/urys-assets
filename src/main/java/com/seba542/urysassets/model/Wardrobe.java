package com.seba542.urysassets.model;

import com.seba542.urysassets.UrysAssets;
import net.minecraft.client.model.*;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.client.util.math.MatrixStack;

public class Wardrobe extends Model {
	public static final EntityModelLayer LAYER_LOCATION = new EntityModelLayer(UrysAssets.id(: "main"), "wardrobe")
	private final ModelPart Door;
	private final ModelPart Exterior;

	public model(ModelPart root) {
		super(RenderLayer::getEntitySolid)
		this.Door = root.getChild("Door");
		this.Exterior = root.getChild("Exterior");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData Door = modelPartData.addChild("Door", ModelPartBuilder.create().uv(22, 0).cuboid(12.0F, -34.5F, -5.0F, 8.0F, 6.0F, 0.25F, new Dilation(0.0F))
		.uv(0, 0).cuboid(11.0F, -37.5F, -6.0F, 10.0F, 32.0F, 1.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(12.75F, -26.25F, -4.75F, 6.25F, 0.5F, 0.25F, new Dilation(0.0F))
		.uv(0, 0).cuboid(12.5F, -26.25F, -5.25F, 0.25F, 0.5F, 0.75F, new Dilation(0.0F))
		.uv(0, 0).cuboid(19.0F, -26.25F, -5.25F, 0.25F, 0.5F, 0.75F, new Dilation(0.0F))
		.uv(0, 0).cuboid(11.0966F, -26.4F, -6.1607F, 0.4F, 0.775F, 0.2F, new Dilation(0.0F))
		.uv(0, 0).cuboid(11.5716F, -27.5F, -6.4607F, 0.4F, 2.9F, 0.2F, new Dilation(0.0F))
		.uv(0, 0).cuboid(11.5716F, -27.5F, -6.2607F, 0.4F, 0.5F, 0.3F, new Dilation(0.0F))
		.uv(0, 0).cuboid(11.5716F, -25.1F, -6.2607F, 0.4F, 0.5F, 0.3F, new Dilation(0.0F)), ModelTransform.pivot(-16.0F, 25.5F, 0.0F));

		ModelPartData Exterior = modelPartData.addChild("Exterior", ModelPartBuilder.create().uv(0, 0).cuboid(2.75F, -39.525F, -11.175F, 10.5F, 0.75F, 1.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(3.5F, -39.525F, -10.175F, 1.5F, 0.5F, 0.5F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-0.9142F, -39.525F, -5.9501F, 0.5F, 0.5F, 1.5F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-0.9142F, -39.525F, -1.9501F, 0.5F, 0.5F, 1.5F, new Dilation(0.0F))
		.uv(0, 0).cuboid(7.5F, -39.525F, -10.175F, 1.5F, 0.5F, 0.5F, new Dilation(0.0F))
		.uv(0, 0).cuboid(11.0F, -39.525F, -10.175F, 1.5F, 0.5F, 0.5F, new Dilation(0.0F))
		.uv(4, 67).cuboid(2.0F, -39.025F, -10.175F, 12.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(5, 68).cuboid(1.0F, -39.025F, -9.175F, 14.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(0, 67).cuboid(0.0F, -39.025F, -8.175F, 16.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(0, 65).cuboid(-1.0F, -39.025F, -7.175F, 18.0F, 1.0F, 7.0F, new Dilation(0.0F))
		.uv(1, 68).cuboid(2.06F, -6.04F, -10.1075F, 11.88F, 0.99F, 0.99F, new Dilation(0.0F))
		.uv(39, 19).cuboid(1.07F, -6.04F, -9.1175F, 13.86F, 0.99F, 0.99F, new Dilation(0.0F))
		.uv(2, 67).cuboid(0.08F, -6.04F, -8.1275F, 15.84F, 0.99F, 0.99F, new Dilation(0.0F))
		.uv(-4, 66).cuboid(-0.91F, -6.04F, -7.1375F, 17.82F, 0.99F, 6.93F, new Dilation(0.0F))
		.uv(2, 5).mirrored().cuboid(2.75F, -5.025F, -10.675F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F)).mirrored(false)
		.uv(2, 5).mirrored().cuboid(-1.25F, -5.025F, -2.925F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F)).mirrored(false)
		.uv(2, 5).mirrored().cuboid(15.25F, -5.025F, -2.925F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F)).mirrored(false)
		.uv(2, 5).mirrored().cuboid(11.25F, -5.025F, -10.675F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F)).mirrored(false)
		.uv(0, 32).cuboid(-0.2426F, -38.025F, -1.1824F, 16.5F, 32.0F, 1.0F, new Dilation(0.0F))
		.uv(53, 0).cuboid(-1.2426F, -38.025F, -6.1824F, 1.0F, 32.0F, 6.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-1.8462F, -39.525F, -6.5788F, 1.0F, 0.75F, 6.5F, new Dilation(0.0F))
		.uv(-6, 0).cuboid(16.8462F, -39.525F, -6.5788F, 1.0F, 0.75F, 6.5F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-1.65F, -38.775F, -6.525F, 1.0F, 0.75F, 6.4F, new Dilation(0.0F))
		.uv(-6, 0).cuboid(2.75F, -38.775F, -10.925F, 10.5F, 0.75F, 6.25F, new Dilation(0.0F))
		.uv(57, 1).cuboid(2.75F, -38.025F, -10.8F, 0.25F, 32.0F, 0.375F, new Dilation(0.0F))
		.uv(0, 0).cuboid(16.4142F, -39.525F, -5.9501F, 0.5F, 0.5F, 1.5F, new Dilation(0.0F))
		.uv(0, 0).cuboid(16.65F, -38.775F, -6.525F, 1.0F, 0.75F, 6.4F, new Dilation(0.0F))
		.uv(0, 0).cuboid(2.75F, -5.5F, -11.175F, 10.5F, 0.675F, 1.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(2.8025F, -6.1885F, -10.85F, 10.395F, 0.6683F, 6.1875F, new Dilation(0.0F))
		.uv(0, 0).cuboid(16.5635F, -6.1885F, -6.494F, 0.99F, 0.6683F, 6.336F, new Dilation(0.0F))
		.uv(3, 1).cuboid(16.8462F, -5.5F, -6.5788F, 1.0F, 0.675F, 6.5F, new Dilation(0.0F))
		.uv(57, 1).cuboid(13.0F, -38.025F, -10.8F, 0.25F, 32.0F, 0.375F, new Dilation(0.0F))
		.uv(0, 0).cuboid(16.4142F, -39.525F, -1.9501F, 0.5F, 0.5F, 1.5F, new Dilation(0.0F))
		.uv(53, 0).cuboid(16.2426F, -38.025F, -6.1824F, 1.0F, 32.0F, 6.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-1.5535F, -6.1885F, -6.494F, 0.99F, 0.6683F, 6.336F, new Dilation(0.0F))
		.uv(3, 1).cuboid(-1.8462F, -5.5F, -6.5788F, 1.0F, 0.675F, 6.5F, new Dilation(0.0F)), ModelTransform.pivot(-8.0F, 26.025F, 4.425F));

		ModelPartData cube_r1 = Exterior.addChild("cube_r1", ModelPartBuilder.create().uv(0, 0).cuboid(0.25F, -33.5F, 0.25F, 1.5F, 0.5F, 0.5F, new Dilation(0.0F)), ModelTransform.of(1.4822F, -6.025F, -8.9679F, 0.0F, 0.7854F, 0.0F));

		ModelPartData cube_r2 = Exterior.addChild("cube_r2", ModelPartBuilder.create().uv(0, 0).cuboid(-2.5F, -33.5F, 0.25F, 1.5F, 0.5F, 0.5F, new Dilation(0.0F)), ModelTransform.of(1.0F, -6.025F, -8.425F, 0.0F, 0.7854F, 0.0F));

		ModelPartData cube_r3 = Exterior.addChild("cube_r3", ModelPartBuilder.create().uv(0, 0).cuboid(0.9294F, -0.6683F, -6.4228F, 6.138F, 0.6683F, 6.1875F, new Dilation(0.0F)), ModelTransform.of(8.0F, -5.5202F, -6.9642F, 0.0F, -0.7854F, 0.0F));

		ModelPartData cube_r4 = Exterior.addChild("cube_r4", ModelPartBuilder.create().uv(0, 0).cuboid(0.7601F, 0.0F, -6.6645F, 6.5F, 0.675F, 1.0F, new Dilation(0.0F)), ModelTransform.of(8.0F, -5.5F, -7.0F, 0.0F, -0.7854F, 0.0F));

		ModelPartData cube_r5 = Exterior.addChild("cube_r5", ModelPartBuilder.create().uv(0, 0).cuboid(-7.0674F, -0.6683F, -6.4228F, 6.138F, 0.6683F, 6.1875F, new Dilation(0.0F)), ModelTransform.of(8.0F, -5.5202F, -6.9642F, 0.0F, 0.7854F, 0.0F));

		ModelPartData cube_r6 = Exterior.addChild("cube_r6", ModelPartBuilder.create().uv(0, 0).cuboid(-7.2601F, 0.0F, -6.6645F, 6.5F, 0.675F, 1.0F, new Dilation(0.0F)), ModelTransform.of(8.0F, -5.5F, -7.0F, 0.0F, 0.7854F, 0.0F));

		ModelPartData cube_r7 = Exterior.addChild("cube_r7", ModelPartBuilder.create().uv(0, 0).cuboid(-1.2481F, -33.75F, 2.0F, 6.2F, 0.75F, 6.25F, new Dilation(0.0F)), ModelTransform.of(15.5481F, -5.025F, -11.4553F, 0.0F, -0.7854F, 0.0F));

		ModelPartData cube_r8 = Exterior.addChild("cube_r8", ModelPartBuilder.create().uv(0, 0).cuboid(1.0F, -33.5F, 0.25F, 1.5F, 0.5F, 0.5F, new Dilation(0.0F)), ModelTransform.of(15.0F, -6.025F, -8.425F, 0.0F, -0.7854F, 0.0F));

		ModelPartData cube_r9 = Exterior.addChild("cube_r9", ModelPartBuilder.create().uv(0, 0).cuboid(-1.75F, -33.5F, 0.25F, 1.5F, 0.5F, 0.5F, new Dilation(0.0F)), ModelTransform.of(14.5178F, -6.025F, -8.9679F, 0.0F, -0.7854F, 0.0F));

		ModelPartData cube_r10 = Exterior.addChild("cube_r10", ModelPartBuilder.create().uv(0, 0).cuboid(-4.9519F, -33.75F, 2.0F, 6.2F, 0.75F, 6.25F, new Dilation(0.0F)), ModelTransform.of(0.4519F, -5.025F, -11.4553F, 0.0F, 0.7854F, 0.0F));

		ModelPartData cube_r11 = Exterior.addChild("cube_r11", ModelPartBuilder.create().uv(0, 0).cuboid(-1.25F, -33.5F, 2.0F, 6.5F, 0.75F, 1.0F, new Dilation(0.0F)), ModelTransform.of(15.5481F, -6.025F, -11.7053F, 0.0F, -0.7854F, 0.0F));

		ModelPartData cube_r12 = Exterior.addChild("cube_r12", ModelPartBuilder.create().uv(0, 0).cuboid(-5.25F, -33.5F, 2.0F, 6.5F, 0.75F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.4519F, -6.025F, -11.7053F, 0.0F, 0.7854F, 0.0F));

		ModelPartData cube_r13 = Exterior.addChild("cube_r13", ModelPartBuilder.create().uv(38, 0).cuboid(-4.75F, -32.0F, 2.75F, 6.0F, 32.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.1716F, -6.025F, -11.4857F, 0.0F, 0.7854F, 0.0F));

		ModelPartData cube_r14 = Exterior.addChild("cube_r14", ModelPartBuilder.create().uv(38, 0).cuboid(10.0F, -32.0F, -8.5F, 6.0F, 32.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-0.0815F, -6.025F, -11.4857F, 0.0F, -0.7854F, 0.0F));

		ModelPartData cube_r15 = Exterior.addChild("cube_r15", ModelPartBuilder.create().uv(0, 0).cuboid(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-0.25F, -3.025F, -1.925F, 0.0F, -0.7854F, 0.0F));

		ModelPartData cube_r16 = Exterior.addChild("cube_r16", ModelPartBuilder.create().uv(0, 0).cuboid(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(16.25F, -3.025F, -1.925F, 0.0F, 0.7854F, 0.0F));

		ModelPartData cube_r17 = Exterior.addChild("cube_r17", ModelPartBuilder.create().uv(0, 0).cuboid(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(12.25F, -3.025F, -9.675F, 0.0F, 0.7854F, 0.0F));

		ModelPartData cube_r18 = Exterior.addChild("cube_r18", ModelPartBuilder.create().uv(0, 0).cuboid(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(3.75F, -3.025F, -9.675F, 0.0F, 0.7854F, 0.0F));
		return TexturedModelData.of(modelData, 80, 80);
	}

	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, int color) {
		Door.render(matrices, vertexConsumer, light, overlay, color);
		Exterior.render(matrices, vertexConsumer, light, overlay, color);

		public ModelPart getDoor() {
			return this.Door
		}

	}
}