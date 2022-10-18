
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.everythingmodjj.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class EverythingmodjjModTabs {
	public static CreativeModeTab TAB_CREATIVE_TAB;

	public static void load() {
		TAB_CREATIVE_TAB = new CreativeModeTab("tabcreative_tab") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(EverythingmodjjModItems.EVERYTHING_GUN.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
