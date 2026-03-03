/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.windowbreaker.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

import net.mcreator.windowbreaker.WindowBreakerMod;

public class WindowBreakerModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, WindowBreakerMod.MODID);
	public static final RegistryObject<Item> BREAKER_SPAWN_EGG;
	static {
		BREAKER_SPAWN_EGG = REGISTRY.register("breaker_spawn_egg", () -> new ForgeSpawnEggItem(WindowBreakerModEntities.BREAKER, -1, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	}
	// Start of user code block custom items
	// End of user code block custom items
}