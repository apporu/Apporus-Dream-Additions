package net.apporu.apporudreamadditions.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

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
}