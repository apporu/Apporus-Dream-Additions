package net.apporu.apporudreamadditions.item.custom;

import net.apporu.apporudreamadditions.sound.ModSounds;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

// Little Among Us Crewmate toy which squeaks.
public class LilSusItem extends Item {
    public LilSusItem(Properties properties) { // Constructor
        super(properties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        if(!level.isClientSide() && hand == InteractionHand.MAIN_HAND) {
            level.playSound((Player)null, player.getX(), player.getY(), player.getZ(), ModSounds.LIL_SUS_SQUEAK.get(), SoundSource.NEUTRAL, 1f, 1f);
        }

        return super.use(level, player, hand);
    }
}