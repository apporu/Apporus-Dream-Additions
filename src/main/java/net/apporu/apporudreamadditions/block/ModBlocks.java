package net.apporu.apporudreamadditions.block;

import net.apporu.apporudreamadditions.ApporusDreamAdditions;
import net.apporu.apporudreamadditions.block.custom.PrimordialFleshBlock;
import net.apporu.apporudreamadditions.item.ModCreativeModeTab;
import net.apporu.apporudreamadditions.item.ModItems;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, ApporusDreamAdditions.MOD_ID);

    // Block List:
    public static final RegistryObject<Block> SODALITE_BLOCK = registerBlock("sodalite_block",
                () -> new Block(BlockBehaviour.Properties.of(Material.AMETHYST)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.APPORU_DREAM_ADDITIONS_TAB);

    public static final RegistryObject<Block> SODALITE_ORE = registerBlock("sodalite_ore",
                () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3f).requiresCorrectToolForDrops(), UniformInt.of(2, 4)), ModCreativeModeTab.APPORU_DREAM_ADDITIONS_TAB);

    public static final RegistryObject<Block> PRIMORDIAL_FLESH = registerBlock("primordial_flesh",
            () -> new PrimordialFleshBlock(BlockBehaviour.Properties.of(Material.SCULK)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.APPORU_DREAM_ADDITIONS_TAB);

    // eventBus method
    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

    // Register BLOCK method
    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    // registerBlockItem method
    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab) {

        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }
}
