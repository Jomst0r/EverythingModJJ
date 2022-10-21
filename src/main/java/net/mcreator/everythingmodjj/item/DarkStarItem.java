
package net.mcreator.everythingmodjj.item;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.everythingmodjj.init.EverythingmodjjModTabs;

public class DarkStarItem extends Item {
	public DarkStarItem() {
		super(new Item.Properties().tab(EverythingmodjjModTabs.TAB_CREATIVE_TAB).stacksTo(4).fireResistant().rarity(Rarity.EPIC));
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}
}
