package lemon_juice.better_berries_nether.item;

import lemon_juice.better_berries_nether.BetterBerriesNether;
import lemon_juice.better_berries_nether.block.ModBlocks;
import lemon_juice.better_berries_nether.item.custom.BerryItemNameBlockItem;
import lemon_juice.better_berries_nether.item.custom.BerryMedleyItem;
import lemon_juice.better_berries_nether.item.custom.DrinkItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static net.minecraft.world.item.Items.GLASS_BOTTLE;

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

    // Juice
    public static final RegistryObject<Item> BANEBERRY_JUICE = ITEMS.register("baneberry_juice", () -> new DrinkItem((new Item.Properties()).craftRemainder(GLASS_BOTTLE).food(ModFoods.BANEBERRY_JUICE).stacksTo(16), "bane"));
    public static final RegistryObject<Item> BEHOLDERBERRY_JUICE = ITEMS.register("beholderberry_juice", () -> new DrinkItem((new Item.Properties()).craftRemainder(GLASS_BOTTLE).food(ModFoods.BEHOLDERBERRY_JUICE).stacksTo(16), "beholder"));
    public static final RegistryObject<Item> BITEBERRY_JUICE = ITEMS.register("biteberry_juice", () -> new DrinkItem((new Item.Properties()).craftRemainder(GLASS_BOTTLE).food(ModFoods.BITEBERRY_JUICE).stacksTo(16), "bite"));
    public static final RegistryObject<Item> BLOATBERRY_JUICE = ITEMS.register("bloatberry_juice", () -> new DrinkItem((new Item.Properties()).craftRemainder(GLASS_BOTTLE).food(ModFoods.BLOATBERRY_JUICE).stacksTo(16), "bloat"));

    // Smoothies
    public static final RegistryObject<Item> BANEBERRY_SMOOTHIE = ITEMS.register("baneberry_smoothie", () -> new DrinkItem((new Item.Properties()).craftRemainder(GLASS_BOTTLE).food(ModFoods.BANEBERRY_SMOOTHIE).stacksTo(16), "bane"));
    public static final RegistryObject<Item> BEHOLDERBERRY_SMOOTHIE = ITEMS.register("beholderberry_smoothie", () -> new DrinkItem((new Item.Properties()).craftRemainder(GLASS_BOTTLE).food(ModFoods.BEHOLDERBERRY_SMOOTHIE).stacksTo(16), "beholder"));
    public static final RegistryObject<Item> BITEBERRY_SMOOTHIE = ITEMS.register("biteberry_smoothie", () -> new DrinkItem((new Item.Properties()).craftRemainder(GLASS_BOTTLE).food(ModFoods.BITEBERRY_SMOOTHIE).stacksTo(16), "bite"));
    public static final RegistryObject<Item> BLOATBERRY_SMOOTHIE = ITEMS.register("bloatberry_smoothie", () -> new DrinkItem((new Item.Properties()).craftRemainder(GLASS_BOTTLE).food(ModFoods.BLOATBERRY_SMOOTHIE).stacksTo(16), "bloat"));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
