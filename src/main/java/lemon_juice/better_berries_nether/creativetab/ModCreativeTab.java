package lemon_juice.better_berries_nether.creativetab;

import lemon_juice.better_berries_nether.BetterBerriesNether;
import lemon_juice.better_berries_nether.item.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BetterBerriesNether.MOD_ID);

    public static final RegistryObject<CreativeModeTab> BETTER_BERRIES_NETHER_TAB = CREATIVE_MODE_TABS.register("better_berries_nether", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.better_berries_nether"))
            .icon(() -> new ItemStack(ModItems.BA_BE_BI_BL_MEDLEY.get()))
            .build());

    public static void registerTabs(BuildCreativeModeTabContentsEvent event) {
        if (event.getTab() == BETTER_BERRIES_NETHER_TAB.get()) {
            event.accept(ModItems.BANEBERRIES.get());
            event.accept(ModItems.BEHOLDERBERRIES.get());
            event.accept(ModItems.BITEBERRIES.get());
            event.accept(ModItems.BLOATBERRIES.get());

            /*
            event.accept(ModItems.BLACKBERRY_JUICE.get());
            event.accept(ModItems.BLUEBERRY_JUICE.get());
            event.accept(ModItems.GLOW_BERRY_JUICE.get());
            event.accept(ModItems.MALOBERRY_JUICE.get());
            event.accept(ModItems.RASPBERRY_JUICE.get());
            event.accept(ModItems.SWEET_BERRY_JUICE.get());


            event.accept(ModItems.BLACKBERRY_SMOOTHIE.get());
            event.accept(ModItems.BLUEBERRY_SMOOTHIE.get());
            event.accept(ModItems.GLOW_BERRY_SMOOTHIE.get());
            event.accept(ModItems.MALOBERRY_SMOOTHIE.get());
            event.accept(ModItems.RASPBERRY_SMOOTHIE.get());
            event.accept(ModItems.SWEET_BERRY_SMOOTHIE.get());
             */

            event.accept(ModItems.BA_BE_BI_MEDLEY.get());
            event.accept(ModItems.BA_BE_BL_MEDLEY.get());
            event.accept(ModItems.BA_BI_BL_MEDLEY.get());
            event.accept(ModItems.BE_BI_BL_MEDLEY.get());
            event.accept(ModItems.BA_BE_BI_BL_MEDLEY.get());
        }
    }

    /******************************** Registry ********************************/
    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
