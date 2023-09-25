package lemon_juice.better_berries_nether.item.custom;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class BerryItemNameBlockItem extends ItemNameBlockItem {
    private String type;
    public BerryItemNameBlockItem(Block block, String type, Properties properties) {
        super(block, properties);
        this.type = type;
    }

    @Override
    public void appendHoverText(ItemStack itemStack, @Nullable Level level, List<Component> components, TooltipFlag tooltipFlag) {
        components.add(Component.translatable("tooltip.better_berries_nether.berry_generic"));

        if(type.equals("bane")) components.add(Component.translatable("tooltip.better_berries_nether.berry_bane"));
        if(type.equals("beholder")) components.add(Component.translatable("tooltip.better_berries_nether.berry_beholder"));
        if(type.equals("bite")) components.add(Component.translatable("tooltip.better_berries_nether.berry_bite"));
        if(type.equals("bloat")) components.add(Component.translatable("tooltip.better_berries_nether.berry_bloat"));
    }
}
