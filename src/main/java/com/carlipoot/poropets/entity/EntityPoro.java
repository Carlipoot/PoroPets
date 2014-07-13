package com.carlipoot.poropets.entity;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.passive.EntityTameable;
import net.minecraft.world.World;

public class EntityPoro extends EntityTameable {

    public EntityPoro(World par1World) {
        super(par1World);
    }

    @Override
    public EntityAgeable createChild(EntityAgeable var1) {
        return null;
    }

}
