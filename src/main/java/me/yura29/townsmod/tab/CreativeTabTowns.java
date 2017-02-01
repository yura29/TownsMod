package me.yura29.townsmod.tab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

/**
 * Created by Anonim on 01.02.2017.
 */
public class CreativeTabTowns extends CreativeTabs {

    public CreativeTabTowns(int index, String label) {
        super(index, label);
    }

    @Override
    public Item getTabIconItem() {
        return Items.EMERALD;
    }
}
