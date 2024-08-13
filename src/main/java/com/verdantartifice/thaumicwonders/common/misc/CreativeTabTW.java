package com.verdantartifice.thaumicwonders.common.misc;

import com.verdantartifice.thaumicwonders.common.items.ItemsTW;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class CreativeTabTW extends CreativeTabs {

    public CreativeTabTW(String label) {
        super(label);
    }

    public CreativeTabTW(int index, String label) {
        super(index, label);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public ItemStack createIcon() {
        return new ItemStack(ItemsTW.FLYING_CARPET);
    }
}
