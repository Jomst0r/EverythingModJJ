package net.mcreator.everythingmodjj.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.client.Minecraft;

import net.mcreator.everythingmodjj.init.EverythingmodjjModItems;

public class SealedDimensionPlayerEntersDimensionProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (world.isClientSide())
			Minecraft.getInstance().gameRenderer.displayItemActivation(new ItemStack(EverythingmodjjModItems.BROKEN_SWORD.get()));
		{
			Entity _ent = entity;
			if (!_ent.level.isClientSide() && _ent.getServer() != null)
				_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4),
						"spawnpoint @p ~ ~ ~");
		}
		if (entity instanceof Player _player && !_player.level.isClientSide())
			_player.displayClientMessage(new TextComponent("\u00A75You have been sealed!"), (true));
	}
}
