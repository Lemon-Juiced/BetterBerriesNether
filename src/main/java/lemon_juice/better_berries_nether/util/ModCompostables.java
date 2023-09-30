package lemon_juice.better_berries_nether.util;

import lemon_juice.better_berries_nether.item.ModItems;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

import static net.minecraft.world.level.block.ComposterBlock.COMPOSTABLES;

public class ModCompostables {
    public static void setup(final FMLCommonSetupEvent event) {

        add(0.3F, ModItems.BANEBERRIES.get());
        add(0.3F, ModItems.BEHOLDERBERRIES.get());
        add(0.3F, ModItems.BITEBERRIES.get());
        add(0.3F, ModItems.BLOATBERRIES.get());

        add(0.35F, ModItems.BANEBERRY_JUICE.get());
        add(0.35F, ModItems.BEHOLDERBERRY_JUICE.get());
        add(0.35F, ModItems.BITEBERRY_JUICE.get());
        add(0.35F, ModItems.BLOATBERRY_JUICE.get());

        add(0.4F, ModItems.BANEBERRY_SMOOTHIE.get());
        add(0.4F, ModItems.BEHOLDERBERRY_SMOOTHIE.get());
        add(0.4F, ModItems.BITEBERRY_SMOOTHIE.get());
        add(0.4F, ModItems.BLOATBERRY_SMOOTHIE.get());
    }

    public static void add(float quantity, ItemLike itemLike) {
        COMPOSTABLES.put(itemLike.asItem(), quantity);
    }
}
