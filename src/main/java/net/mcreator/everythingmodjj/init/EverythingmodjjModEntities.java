
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
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.everythingmodjj.entity.NothingPersonalGunEntity;
import net.mcreator.everythingmodjj.entity.EverythingGunEntity;
import net.mcreator.everythingmodjj.EverythingmodjjMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class EverythingmodjjModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITIES, EverythingmodjjMod.MODID);
	public static final RegistryObject<EntityType<EverythingGunEntity>> EVERYTHING_GUN = register("projectile_everything_gun",
			EntityType.Builder.<EverythingGunEntity>of(EverythingGunEntity::new, MobCategory.MISC).setCustomClientFactory(EverythingGunEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<NothingPersonalGunEntity>> NOTHING_PERSONAL_GUN = register("projectile_nothing_personal_gun",
			EntityType.Builder.<NothingPersonalGunEntity>of(NothingPersonalGunEntity::new, MobCategory.MISC)
					.setCustomClientFactory(NothingPersonalGunEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
	}
}
