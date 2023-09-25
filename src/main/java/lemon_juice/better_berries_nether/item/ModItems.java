package lemon_juice.better_berries_nether.item;

import lemon_juice.better_berries_nether.BetterBerriesNether;
import lemon_juice.better_berries_nether.block.ModBlocks;
import lemon_juice.better_berries_nether.item.custom.BerryItemNameBlockItem;
import lemon_juice.better_berries_nether.item.custom.BerryMedleyItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, BetterBerriesNether.MOD_ID);

    // Berries
    public static final RegistryObject<Item> BANEBERRIES = ITEMS.register("baneberries", () -> new BerryItemNameBlockItem(ModBlocks.BANEBERRY_BUSH.get(), "bane", (new Item.Properties()).food(ModFoods.BANEBERRIES)));
    public static final RegistryObject<Item> BEHOLDERBERRIES = ITEMS.register("beholderberries", () -> new BerryItemNameBlockItem(ModBlocks.BEHOLDERBERRY_BUSH.get(), "beholder", (new Item.Properties()).food(ModFoods.BEHOLDERBERRIES)));
    public static final RegistryObject<Item> BITEBERRIES = ITEMS.register("biteberries", () -> new BerryItemNameBlockItem(ModBlocks.BITEBERRY_BUSH.get(), "bite", (new Item.Properties()).food(ModFoods.BITEBERRIES)));
    public static final RegistryObject<Item> BLOATBERRIES = ITEMS.register("bloatberries", () -> new BerryItemNameBlockItem(ModBlocks.BLOATBERRY_BUSH.get(), "bloat", (new Item.Properties()).food(ModFoods.BLOATBERRIES)));

    // Berry Medleys
    public static final RegistryObject<Item> BA_BE_BI_MEDLEY = ITEMS.register("ba_be_bi_medley", () -> new BerryMedleyItem((new Item.Properties()).food(ModFoods.BA_BE_BI_MEDLEY), true, true, true, false));
    public static final RegistryObject<Item> BA_BE_BL_MEDLEY = ITEMS.register("ba_be_bl_medley", () -> new BerryMedleyItem((new Item.Properties()).food(ModFoods.BA_BE_BL_MEDLEY), true, true, false, true));
    public static final RegistryObject<Item> BA_BI_BL_MEDLEY = ITEMS.register("ba_bi_bl_medley", () -> new BerryMedleyItem((new Item.Properties()).food(ModFoods.BA_BI_BL_MEDLEY), true, false, true, true));
    public static final RegistryObject<Item> BE_BI_BL_MEDLEY = ITEMS.register("be_bi_bl_medley", () -> new BerryMedleyItem((new Item.Properties()).food(ModFoods.BE_BI_BL_MEDLEY), false, true, true, true));
    public static final RegistryObject<Item> BA_BE_BI_BL_MEDLEY = ITEMS.register("ba_be_bi_bl_medley", () -> new BerryMedleyItem((new Item.Properties()).food(ModFoods.BA_BE_BI_BL_MEDLEY), true, true, true, true));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
