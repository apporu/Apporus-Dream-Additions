package net.apporu.apporudreamadditions.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab APPORU_DREAM_ADDITIONS_TAB = new CreativeModeTab("apporudreamadditionstab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.SHIITAKE.get());
        }
    };
}
