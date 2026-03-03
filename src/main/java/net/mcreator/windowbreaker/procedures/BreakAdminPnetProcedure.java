package net.mcreator.windowbreaker.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.windowbreaker.network.WindowBreakerModVariables;

public class BreakAdminPnetProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		WindowBreakerModVariables.MapVariables.get(world).TypeBreakAdmin = true;
		WindowBreakerModVariables.MapVariables.get(world).markSyncDirty();
		if (WindowLinkProcedure.execute(world, x, y, z)) {
			return true;
		}
		return false;
	}
}