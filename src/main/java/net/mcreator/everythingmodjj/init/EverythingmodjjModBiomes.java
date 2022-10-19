
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.everythingmodjj.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.biome.Biome;

import net.mcreator.everythingmodjj.world.biome.SealedBiomeBiome;
import net.mcreator.everythingmodjj.EverythingmodjjMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class EverythingmodjjModBiomes {
	public static final DeferredRegister<Biome> REGISTRY = DeferredRegister.create(ForgeRegistries.BIOMES, EverythingmodjjMod.MODID);
	public static final RegistryObject<Biome> SEALED_BIOME = REGISTRY.register("sealed_biome", () -> SealedBiomeBiome.createBiome());

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			SealedBiomeBiome.init();
		});
	}
}
