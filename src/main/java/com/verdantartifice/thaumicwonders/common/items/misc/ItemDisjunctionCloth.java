package com.verdantartifice.thaumicwonders.common.items.misc;

import com.verdantartifice.thaumicwonders.common.items.base.ItemTW;

import net.minecraft.item.ItemStack;

public class ItemDisjunctionCloth extends ItemTW {
    public ItemDisjunctionCloth() {
        super("disjunction_cloth");
        setMaxStackSize(1);
        setNoRepair();
    }
    
    @Override
    public boolean isBookEnchantable(ItemStack stack, ItemStack book) {
        return false;
    }
}
