package com.carlipoot.poropets.entity;

import com.carlipoot.poropets.PoroPets;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.entity.EntityList;
import net.minecraft.item.Item;

import java.util.Random;

public class ModEntities {

    public static void init() {
        registerEntity(EntityPoro.class, "poro");
    }

    private static void registerEntity(Class entityClass, String entityName) {
        int entityID = EntityRegistry.findGlobalUniqueEntityId();
        long seed = entityName.hashCode();
        Random rand = new Random(seed);
        int primaryColor = rand.nextInt() * 16777215;
        int secondaryColor = rand.nextInt() * 16777215;

        EntityRegistry.registerGlobalEntityID(entityClass, entityName, entityID);
        EntityRegistry.registerModEntity(entityClass, entityName, entityID, PoroPets.instance, 64, 1, true);
        EntityList.entityEggs.put(Integer.valueOf(entityID), new EntityList.EntityEggInfo(entityID, primaryColor, secondaryColor));
    }

}
