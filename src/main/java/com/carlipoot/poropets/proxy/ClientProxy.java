package com.carlipoot.poropets.proxy;

import com.carlipoot.poropets.client.renderer.entity.RenderPoro;
import com.carlipoot.poropets.client.renderer.model.ModelPoro;
import com.carlipoot.poropets.entity.EntityPoro;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy {

    @Override
    public void initRenderingAndTextures() {
        // Entities
        RenderingRegistry.registerEntityRenderingHandler(EntityPoro.class, new RenderPoro(new ModelPoro(), 0.25F));
    }

}
