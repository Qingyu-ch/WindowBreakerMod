/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.windowbreaker.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.windowbreaker.client.model.Modelwindowbreaker_entitys;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class WindowBreakerModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelwindowbreaker_entitys.LAYER_LOCATION, Modelwindowbreaker_entitys::createBodyLayer);
	}
}