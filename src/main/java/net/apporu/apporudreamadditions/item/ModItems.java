package net.apporu.apporudreamadditions.item;

import net.apporu.apporudreamadditions.ApporusDreamAdditions;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ApporusDreamAdditions.MOD_ID);

    // Item list Below:
    public static final RegistryObject<Item> SHIITAKE = ITEMS.register("shiitake",() -> new Item(new Item.Properties().tab(ModCreativeModeTab.APPORU_DREAM_ADDITIONS_TAB)));
    public static final RegistryObject<Item> SODALITE = ITEMS.register("sodalite",() -> new Item(new Item.Properties().tab(ModCreativeModeTab.APPORU_DREAM_ADDITIONS_TAB)));


    // Item register eventBus method:
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
