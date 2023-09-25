package lemon_juice.better_berries_nether.item.custom;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.BowlFoodItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class BerryMedleyItem extends BowlFoodItem {
    private boolean type1, type2, type3, type4;
    public BerryMedleyItem(Properties properties, boolean type1, boolean type2, boolean type3, boolean type4) {
        super(properties);
        this.type1 = type1;
        this.type2 = type2;
        this.type3 = type3;
        this.type4 = type4;
    }

    @Override
    public void appendHoverText(ItemStack itemStack, @Nullable Level level, List<Component> components, TooltipFlag tooltipFlag) {
        components.add(Component.translatable("tooltip.better_berries_nether.irresistible_combination"));

        if(type1) components.add(Component.translatable("tooltip.better_berries_nether.berry_bane"));
        if(type2) components.add(Component.translatable("tooltip.better_berries_nether.berry_beholder"));
        if(type3) components.add(Component.translatable("tooltip.better_berries_nether.berry_bite"));
        if(type4) components.add(Component.translatable("tooltip.better_berries_nether.berry_bloat"));
    }
}
