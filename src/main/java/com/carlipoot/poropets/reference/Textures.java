package com.carlipoot.poropets.reference;

import com.carlipoot.poropets.reference.Reference;
import net.minecraft.util.ResourceLocation;

public class Textures {

	public static final String RESOURCE_PREFIX = Reference.MOD_ID.toLowerCase() + ":";
	
	// Path names
	public static final String GUI_SHEET_LOCATION = "textures/gui/";
    public static final String ENTITY_TEXTURE_LOCATION = "textures/entity/";

    // Overlay
//	public static final ResourceLocation GUI_ICON_SHEET = new ResourceLocation(RESOURCE_PREFIX + GUI_SHEET_LOCATION + "icons.png");

    // Entities
    public static final ResourceLocation ENTITY_PORO_TEXTURE = new ResourceLocation(RESOURCE_PREFIX + ENTITY_TEXTURE_LOCATION + "poro.png");

}
