package com.carlipoot.poropets.creativetab;

import com.carlipoot.poropets.init.ModItems;
import com.carlipoot.poropets.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.util.StatCollector;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class CreativeTab {

	public static final CreativeTabs TS_TAB = new CreativeTabs(Reference.MOD_ID) {
        @Override
        public Item getTabIconItem() {
            return Items.arrow;
        }

        @Override
        @SideOnly(Side.CLIENT)
        public String getTranslatedTabLabel() {
            return StatCollector.translateToLocal("key.categories.ts");
        }
    };
	
}
