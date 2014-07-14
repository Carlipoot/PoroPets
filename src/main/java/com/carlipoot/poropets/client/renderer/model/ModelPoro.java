package com.carlipoot.poropets.client.renderer.model;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelCreeper;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

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
//    private ModelRenderer hornTipL;
//    private ModelRenderer hornTipR;

    // Texture fields
    private int textureWidth = 64;
    private int textureHeight = 32;

    private float scale = 0F;

    public ModelPoro() {
        body = new ModelRenderer(this, 1, 11);
        body.addBox(-2F, -2F, -2F, 4, 4, 4, scale);
        body.setRotationPoint(0F, 21F, 0F);
        setRotation(body, 0F, 0F, 0F);

        footBL = new ModelRenderer(this, 0, 25);
        footBL.addBox(-1F, -1F, -1F, 2, 2, 2, scale);
        footBL.setRotationPoint(1.5F, 2F, 1.466667F);
        setRotation(footBL, 0F, 0F, 0F);
        body.addChild(footBL);

        footFL = new ModelRenderer(this, 0, 20);
        footFL.addBox(-1F, -1F, -1F, 2, 2, 2, scale);
        footFL.setRotationPoint(1.5F, 2F, -1.5F);
        setRotation(footFL, 0F, 0F, 0F);
        body.addChild(footFL);

        footFR = new ModelRenderer(this, 10, 20);
        footFR.addBox(-1F, -1F, -1F, 2, 2, 2, scale);
        footFR.setRotationPoint(-1.5F, 2F, -1.5F);
        setRotation(footFR, 0F, 0F, 0F);
        body.addChild(footFR);

        footBR = new ModelRenderer(this, 10, 25);
        footBR.addBox(-1F, -1F, -1F, 2, 2, 2, scale);
        footBR.setRotationPoint(-1.5F, 2F, 1.5F);
        setRotation(footBR, 0F, 0F, 0F);
        body.addChild(footBR);

        hornBaseR = new ModelRenderer(this, 10, 7);
        hornBaseR.addBox(-0.5F, -2F, -0.5F, 1, 2, 1, scale);
        hornBaseR.setRotationPoint(-1F, -1.5F, -1.5F);
        setRotation(hornBaseR, degToRad(-55F), 0F, degToRad(-20F));
        body.addChild(hornBaseR);

        hornBaseL = new ModelRenderer(this, 3, 7);
        hornBaseL.addBox(-0.5F, -2F, -0.5F, 1, 2, 1, scale);
        hornBaseL.setRotationPoint(1F, -1.5F, -1.5F);
        setRotation(hornBaseL, degToRad(-55F), 0F, degToRad(20F));
        body.addChild(hornBaseL);

//        hornTipL = new ModelRenderer(this, 3, 4);
//        hornTipL.addBox(-0.5F, -0.5F, -0.5F, 1, 1, 1, 0F);
//        hornTipL.setRotationPoint(0F, -2F, 0F);
//        setRotation(hornTipL, 0F, 0F, 0F);
//        hornBaseL.addChild(hornTipL);
//
//        hornTipR = new ModelRenderer(this, 10, 4);
//        hornTipR.addBox(-0.5F, -4F, -0.5F, 1, 1, 1, 0F);
//        hornTipR.setRotationPoint(0F, 0F, 0F);
//        setRotation(hornTipR, 0F, 0F, 0F);
//        hornBaseR.addChild(hornTipR);
    }

    public void render(Entity entity, float time, float swingSuppress, float f2, float headAngleY, float headAngleX, float f5) {
        super.render(entity, time, swingSuppress, f2, headAngleY, headAngleX, f5);
        setRotationAngles(time, swingSuppress, f2, headAngleY, headAngleX, f5, entity);

        float s = 5F;

        GL11.glPushMatrix();
        GL11.glScalef(s, s, s);
        body.render(f5);
        GL11.glPopMatrix();
    }

    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);

        resetRotations();
        body.setRotationPoint(0F, 1.8F, 0F);

        this.footBL.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
        this.footBR.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
        this.footFL.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
        this.footFR.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
    }

    public void setRotation(ModelRenderer m, float x, float y, float z) {
        m.rotateAngleX = x;
        m.rotateAngleY = y;
        m.rotateAngleZ = z;
    }

    public float degToRad(float degrees) {
        return degrees * (float)Math.PI / 180 ;
    }

    public void resetRotations() {
        setRotation(body, 0F, 0F, 0F);
        setRotation(footBL, 0F, 0F, 0F);
        setRotation(footFL, 0F, 0F, 0F);
        setRotation(footFR, 0F, 0F, 0F);
        setRotation(footBR, 0F, 0F, 0F);
        setRotation(hornBaseR, degToRad(-55F), 0F, degToRad(-20F));
        setRotation(hornBaseL, degToRad(-55F), 0F, degToRad(20F));
//        setRotation(hornTipL, 0F, 0F, 0F);
//        setRotation(hornTipR, 0F, 0F, 0F);
    }

}
