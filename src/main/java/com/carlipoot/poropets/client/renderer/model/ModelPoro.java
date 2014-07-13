package com.carlipoot.poropets.client.renderer.model;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

@SideOnly(Side.CLIENT)
public class ModelPoro extends ModelBase{

    // Parts
    private ModelRenderer body;
    private ModelRenderer footBL;
    private ModelRenderer footFL;
    private ModelRenderer footFR;
    private ModelRenderer footBR;
    private ModelRenderer hornBaseR;
    private ModelRenderer hornBaseL;
    private ModelRenderer hornTipL;
    private ModelRenderer hornTipR;

    // Texture fields
    private int textureWidth = 64;
    private int textureHeight = 32;

    public ModelPoro() {
        body = new ModelRenderer(this, 1, 11);
        body.addBox(-2F, -2F, -2F, 4, 4, 4, 0F);
        body.setRotationPoint(0F, 0F, 0F);
        body.rotateAngleX = 0F;
        body.rotateAngleY = 0F;
        body.rotateAngleZ = 0F;
        footBL = new ModelRenderer(this, 0, 25);
        footBL.addBox(-1F, -1F, -1F, 2, 2, 2, 0F);
        footBL.setRotationPoint(2F, 2F, 1.466667F);
        footBL.rotateAngleX = 0F;
        footBL.rotateAngleY = 0F;
        footBL.rotateAngleZ = 0F;
        footFL = new ModelRenderer(this, 0, 20);
        footFL.addBox(-1F, -1F, -1F, 2, 2, 2, 0F);
        footFL.setRotationPoint(2F, 2F, -1.5F);
        footFL.rotateAngleX = 0F;
        footFL.rotateAngleY = 0F;
        footFL.rotateAngleZ = 0F;
        footFR = new ModelRenderer(this, 10, 20);
        footFR.addBox(-1F, -1F, -1F, 2, 2, 2, 0F);
        footFR.setRotationPoint(-2F, 2F, -1.5F);
        footFR.rotateAngleX = 0F;
        footFR.rotateAngleY = 0F;
        footFR.rotateAngleZ = 0F;
        footBR = new ModelRenderer(this, 10, 25);
        footBR.addBox(-1F, -1F, -1F, 2, 2, 2, 0F);
        footBR.setRotationPoint(-2F, 2F, 1.5F);
        footBR.rotateAngleX = 0F;
        footBR.rotateAngleY = 0F;
        footBR.rotateAngleZ = 0F;
        hornBaseR = new ModelRenderer(this, 10, 7);
        hornBaseR.addBox(-0.5F, -2F, -1F, 1, 2, 1, 0F);
        hornBaseR.setRotationPoint(-1F, -1F, -1F);
        hornBaseR.rotateAngleX = -0.5235988F;
        hornBaseR.rotateAngleY = 0F;
        hornBaseR.rotateAngleZ = 0F;
        hornBaseL = new ModelRenderer(this, 3, 7);
        hornBaseL.addBox(-0.5F, -2F, -1F, 1, 2, 1, 0F);
        hornBaseL.setRotationPoint(1F, -1F, -1F);
        hornBaseL.rotateAngleX = -0.5235988F;
        hornBaseL.rotateAngleY = 0F;
        hornBaseL.rotateAngleZ = 0F;
        hornTipL = new ModelRenderer(this, 3, 4);
        hornTipL.addBox(-0.5F, -0.5F, -0.5F, 1, 1, 1, 0F);
        hornTipL.setRotationPoint(1F, -3F, -0.5F);
        hornTipL.rotateAngleX = 0F;
        hornTipL.rotateAngleY = 0F;
        hornTipL.rotateAngleZ = 0F;
        hornTipR = new ModelRenderer(this, 10, 4);
        hornTipR.addBox(0F, 0F, 0F, 1, 1, 1, 0F);
        hornTipR.setRotationPoint(0F, 0F, 0F);
        hornTipR.rotateAngleX = 0F;
        hornTipR.rotateAngleY = 0F;
        hornTipR.rotateAngleZ = 0F;
    }

    public void render(Entity entity, float time, float swingSuppress, float f2, float headAngleY, float headAngleX, float f5) {
        super.render(entity, time, swingSuppress, f2, headAngleY, headAngleX, f5);
        setRotationAngles(time, swingSuppress, f2, headAngleY, headAngleX, f5, entity);
        body.render(f5);
        footBL.render(f5);
        footFL.render(f5);
        footFR.render(f5);
        footBR.render(f5);
        hornBaseR.render(f5);
        hornBaseL.render(f5);
        hornTipL.render(f5);
        hornTipR.render(f5);
    }

    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    }

}
