package com.carlipoot.poropets.entity;

import com.carlipoot.poropets.utility.LogHelper;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.passive.EntityTameable;
import net.minecraft.world.World;

public class EntityPoro extends EntityTameable {

    public float scale = 5F;
    public float size = 0.35F;

    public EntityPoro(World par1World) {
        super(par1World);
        this.setSize(0.35F * scale, 0.35F * scale);
        LogHelper.info(this.getAIMoveSpeed());
    }

    @Override
    public float getAIMoveSpeed() {
        return 1F;
    }

    @Override
    public EntityAgeable createChild(EntityAgeable var1) {
        return null;
    }

}
