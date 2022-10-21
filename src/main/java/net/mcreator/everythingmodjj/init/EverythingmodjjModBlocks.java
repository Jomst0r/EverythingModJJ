
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.everythingmodjj.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.everythingmodjj.block.SealedDimensionPortalBlock;
import net.mcreator.everythingmodjj.EverythingmodjjMod;

public class EverythingmodjjModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, EverythingmodjjMod.MODID);
	public static final RegistryObject<Block> SEALED_DIMENSION_PORTAL = REGISTRY.register("sealed_dimension_portal",
			() -> new SealedDimensionPortalBlock());
}
