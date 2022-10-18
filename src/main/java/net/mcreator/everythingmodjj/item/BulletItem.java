
package net.mcreator.everythingmodjj.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.everythingmodjj.init.EverythingmodjjModTabs;

public class BulletItem extends Item {
	public BulletItem() {
		super(new Item.Properties().tab(EverythingmodjjModTabs.TAB_CREATIVE_TAB).stacksTo(64).rarity(Rarity.COMMON));
	}
}
