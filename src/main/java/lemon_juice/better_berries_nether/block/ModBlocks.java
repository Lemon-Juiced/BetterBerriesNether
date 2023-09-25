package lemon_juice.better_berries_nether.block;

import lemon_juice.better_berries_nether.BetterBerriesNether;
import lemon_juice.better_berries_nether.block.custom.BaneberryBushBlock;
import lemon_juice.better_berries_nether.block.custom.BeholderberryBushBlock;
import lemon_juice.better_berries_nether.block.custom.BiteberryBushBlock;
import lemon_juice.better_berries_nether.block.custom.BloatberryBushBlock;
import lemon_juice.better_berries_nether.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, BetterBerriesNether.MOD_ID);

    public static final RegistryObject<Block> BANEBERRY_BUSH = registerBlockWithoutBlockItem("baneberry_bush", () -> new BaneberryBushBlock(BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).randomTicks().noCollission().sound(SoundType.SWEET_BERRY_BUSH).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> BEHOLDERBERRY_BUSH = registerBlockWithoutBlockItem("beholderberry_bush", () -> new BeholderberryBushBlock(BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).randomTicks().noCollission().sound(SoundType.SWEET_BERRY_BUSH).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> BITEBERRY_BUSH = registerBlockWithoutBlockItem("biteberry_bush", () -> new BiteberryBushBlock(BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).randomTicks().noCollission().sound(SoundType.SWEET_BERRY_BUSH).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> BLOATBERRY_BUSH = registerBlockWithoutBlockItem("bloatberry_bush", () -> new BloatberryBushBlock(BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).randomTicks().noCollission().sound(SoundType.SWEET_BERRY_BUSH).pushReaction(PushReaction.DESTROY)));


    /******************************** Registry ********************************/
    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<T> registerBlockWithoutBlockItem(String name, Supplier<T> block) {
        return BLOCKS.register(name, block);
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
