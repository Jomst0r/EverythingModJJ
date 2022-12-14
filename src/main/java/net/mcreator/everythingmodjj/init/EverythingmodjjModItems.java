
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.everythingmodjj.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.everythingmodjj.item.ZeusLightningBoltItem;
import net.mcreator.everythingmodjj.item.SealedDimensionItem;
import net.mcreator.everythingmodjj.item.NothingPersonalGunItem;
import net.mcreator.everythingmodjj.item.EverythingGunItem;
import net.mcreator.everythingmodjj.item.DarkStarItem;
import net.mcreator.everythingmodjj.item.BulletItem;
import net.mcreator.everythingmodjj.item.BrokenSwordItem;
import net.mcreator.everythingmodjj.EverythingmodjjMod;

public class EverythingmodjjModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, EverythingmodjjMod.MODID);
	public static final RegistryObject<Item> BULLET = REGISTRY.register("bullet", () -> new BulletItem());
	public static final RegistryObject<Item> EVERYTHING_GUN = REGISTRY.register("everything_gun", () -> new EverythingGunItem());
	public static final RegistryObject<Item> BROKEN_SWORD = REGISTRY.register("broken_sword", () -> new BrokenSwordItem());
	public static final RegistryObject<Item> SEALED_DIMENSION = REGISTRY.register("sealed_dimension", () -> new SealedDimensionItem());
	public static final RegistryObject<Item> NOTHING_PERSONAL_GUN = REGISTRY.register("nothing_personal_gun", () -> new NothingPersonalGunItem());
	public static final RegistryObject<Item> DARK_STAR = REGISTRY.register("dark_star", () -> new DarkStarItem());
	public static final RegistryObject<Item> ZEUS_LIGHTNING_BOLT = REGISTRY.register("zeus_lightning_bolt", () -> new ZeusLightningBoltItem());
}
