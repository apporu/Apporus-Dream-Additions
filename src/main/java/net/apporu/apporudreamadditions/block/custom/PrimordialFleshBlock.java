package net.apporu.apporudreamadditions.block.custom;

import net.minecraft.ChatFormatting;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class PrimordialFleshBlock extends Block {
    public PrimordialFleshBlock(Properties properties) {
        super(properties);
    }

    @Override
    public void stepOn(Level level, BlockPos blockPos, BlockState blockState, Entity entity) {
        if(!entity.isSteppingCarefully() && entity instanceof LivingEntity livingEntity) {
            livingEntity.hurt(DamageSource.HOT_FLOOR, 1.0F);
            livingEntity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 3, 1200));
        }
        super.stepOn(level, blockPos, blockState, entity);
    }

    // TOOLTIP
    @Override
    public void appendHoverText(ItemStack itemStack, @Nullable BlockGetter getter, List<Component> components, TooltipFlag flag) {
        if(Screen.hasShiftDown()) {
            components.add(Component.literal("Stepping on this will make you stronger... with blood as payment.").withStyle(ChatFormatting.DARK_RED, ChatFormatting.BOLD));
        } else {
            components.add(Component.literal("Press SHIFT for more info").withStyle(ChatFormatting.YELLOW));
        }

        super.appendHoverText(itemStack, getter, components, flag);
    }
}
