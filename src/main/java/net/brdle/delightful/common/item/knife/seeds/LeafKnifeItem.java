package net.brdle.delightful.common.item.knife.seeds;

import net.brdle.delightful.common.item.DelightfulTiers;
import net.brdle.delightful.common.item.knife.CompatKnifeItem;
import net.brdle.delightful.data.DelightfulItemTags;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;
import javax.annotation.Nullable;
import java.util.List;

public class LeafKnifeItem extends CompatKnifeItem {
	public LeafKnifeItem(Properties properties) {
		super("seeds", DelightfulItemTags.SHARP_LEAF, DelightfulTiers.LEAF, properties, null, ChatFormatting.YELLOW);
	}

	/**
	 * allows items to add custom lines of information to the mouseover description
	 */
	@Override
	public void appendHoverText(@NotNull ItemStack pStack, @Nullable Level pLevel, @NotNull List<Component> tool, @NotNull TooltipFlag pIsAdvanced) {
		super.appendHoverText(pStack, pLevel, tool, pIsAdvanced);
		if (this.isEnabled()) {
			tool.add(new TextComponent("Very sharp").withStyle(ChatFormatting.GRAY));
		}
	}
}
