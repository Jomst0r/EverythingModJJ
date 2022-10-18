
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.everythingmodjj.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.everythingmodjj.item.BulletItem;
import net.mcreator.everythingmodjj.EverythingmodjjMod;

public class EverythingmodjjModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, EverythingmodjjMod.MODID);
	public static final RegistryObject<Item> BULLET = REGISTRY.register("bullet", () -> new BulletItem());
}
