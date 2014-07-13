package com.carlipoot.poropets.client.renderer.entity;

import com.carlipoot.poropets.reference.Textures;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderPoro extends RenderLiving {

    public RenderPoro(ModelBase par1ModelBase, float par2) {
        super(par1ModelBase, par2);
    }

    @Override
    protected ResourceLocation getEntityTexture(Entity var1) {
        return Textures.ENTITY_PORO_TEXTURE;
    }

}
