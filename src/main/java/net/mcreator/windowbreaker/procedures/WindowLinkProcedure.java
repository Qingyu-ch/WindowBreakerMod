package net.mcreator.windowbreaker.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.windowbreaker.network.WindowBreakerModVariables;

public class WindowLinkProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		double WinX = 0;
		double WinY = 0;
		double WinZ = 0;
		double TypeXYZ = 0;
		double Type = 0;
		WinX = x + 1;
		WinY = y + 1;
		WinZ = z + 1;
		while (WinX >= x - 1) {
			while (WinY >= y - 1) {
				while (WinZ >= z - 1) {
					if ((world.getBlockState(new BlockPos(WinX, WinY, WinZ))).getBlock() == Blocks.GLASS || (world.getBlockState(new BlockPos(WinX, WinY, WinZ))).getBlock() == Blocks.TINTED_GLASS
							|| (world.getBlockState(new BlockPos(WinX, WinY, WinZ))).getBlock() == Blocks.WHITE_STAINED_GLASS || (world.getBlockState(new BlockPos(WinX, WinY, WinZ))).getBlock() == Blocks.ORANGE_STAINED_GLASS
							|| (world.getBlockState(new BlockPos(WinX, WinY, WinZ))).getBlock() == Blocks.MAGENTA_STAINED_GLASS || (world.getBlockState(new BlockPos(WinX, WinY, WinZ))).getBlock() == Blocks.LIGHT_BLUE_STAINED_GLASS
							|| (world.getBlockState(new BlockPos(WinX, WinY, WinZ))).getBlock() == Blocks.YELLOW_STAINED_GLASS || (world.getBlockState(new BlockPos(WinX, WinY, WinZ))).getBlock() == Blocks.LIME_STAINED_GLASS
							|| (world.getBlockState(new BlockPos(WinX, WinY, WinZ))).getBlock() == Blocks.PINK_STAINED_GLASS || (world.getBlockState(new BlockPos(WinX, WinY, WinZ))).getBlock() == Blocks.GRAY_STAINED_GLASS
							|| (world.getBlockState(new BlockPos(WinX, WinY, WinZ))).getBlock() == Blocks.LIGHT_GRAY_STAINED_GLASS || (world.getBlockState(new BlockPos(WinX, WinY, WinZ))).getBlock() == Blocks.CYAN_STAINED_GLASS
							|| (world.getBlockState(new BlockPos(WinX, WinY, WinZ))).getBlock() == Blocks.PURPLE_STAINED_GLASS || (world.getBlockState(new BlockPos(WinX, WinY, WinZ))).getBlock() == Blocks.BLUE_STAINED_GLASS
							|| (world.getBlockState(new BlockPos(WinX, WinY, WinZ))).getBlock() == Blocks.BROWN_STAINED_GLASS || (world.getBlockState(new BlockPos(WinX, WinY, WinZ))).getBlock() == Blocks.GREEN_STAINED_GLASS
							|| (world.getBlockState(new BlockPos(WinX, WinY, WinZ))).getBlock() == Blocks.RED_STAINED_GLASS || (world.getBlockState(new BlockPos(WinX, WinY, WinZ))).getBlock() == Blocks.BLACK_STAINED_GLASS
							|| (world.getBlockState(new BlockPos(WinX, WinY, WinZ))).getBlock() == Blocks.GLASS_PANE || (world.getBlockState(new BlockPos(WinX, WinY, WinZ))).getBlock() == Blocks.WHITE_STAINED_GLASS_PANE
							|| (world.getBlockState(new BlockPos(WinX, WinY, WinZ))).getBlock() == Blocks.ORANGE_STAINED_GLASS_PANE || (world.getBlockState(new BlockPos(WinX, WinY, WinZ))).getBlock() == Blocks.MAGENTA_STAINED_GLASS_PANE
							|| (world.getBlockState(new BlockPos(WinX, WinY, WinZ))).getBlock() == Blocks.LIGHT_BLUE_STAINED_GLASS_PANE || (world.getBlockState(new BlockPos(WinX, WinY, WinZ))).getBlock() == Blocks.YELLOW_STAINED_GLASS_PANE
							|| (world.getBlockState(new BlockPos(WinX, WinY, WinZ))).getBlock() == Blocks.LIME_STAINED_GLASS_PANE || (world.getBlockState(new BlockPos(WinX, WinY, WinZ))).getBlock() == Blocks.PINK_STAINED_GLASS_PANE
							|| (world.getBlockState(new BlockPos(WinX, WinY, WinZ))).getBlock() == Blocks.GRAY_STAINED_GLASS_PANE || (world.getBlockState(new BlockPos(WinX, WinY, WinZ))).getBlock() == Blocks.LIGHT_GRAY_STAINED_GLASS_PANE
							|| (world.getBlockState(new BlockPos(WinX, WinY, WinZ))).getBlock() == Blocks.CYAN_STAINED_GLASS_PANE || (world.getBlockState(new BlockPos(WinX, WinY, WinZ))).getBlock() == Blocks.PURPLE_STAINED_GLASS_PANE
							|| (world.getBlockState(new BlockPos(WinX, WinY, WinZ))).getBlock() == Blocks.BLUE_STAINED_GLASS_PANE || (world.getBlockState(new BlockPos(WinX, WinY, WinZ))).getBlock() == Blocks.BROWN_STAINED_GLASS_PANE
							|| (world.getBlockState(new BlockPos(WinX, WinY, WinZ))).getBlock() == Blocks.GREEN_STAINED_GLASS_PANE || (world.getBlockState(new BlockPos(WinX, WinY, WinZ))).getBlock() == Blocks.GREEN_STAINED_GLASS_PANE
							|| (world.getBlockState(new BlockPos(WinX, WinY, WinZ))).getBlock() == Blocks.RED_STAINED_GLASS_PANE || (world.getBlockState(new BlockPos(WinX, WinY, WinZ))).getBlock() == Blocks.BLACK_STAINED_GLASS_PANE) {
						if (WindowBreakerModVariables.MapVariables.get(world).TypeBreakAdmin == false) {
							{
								BlockPos _pos = new BlockPos(WinX, WinY, WinZ);
								Block.dropResources(world.getBlockState(_pos), world, new BlockPos(WinX, WinY, WinZ), null);
								world.destroyBlock(_pos, false);
							}
							world.levelEvent(2001, new BlockPos(WinX, WinY, WinZ), Block.getId(Blocks.GLASS.defaultBlockState()));
						} else {
							return true;
						}
					}
					WinZ = WinZ - 1;
				}
				WinZ = z + 1;
				WinY = WinY - 1;
			}
			WinY = y + 1;
			WinX = WinX - 1;
		}
		return false;
	}
}