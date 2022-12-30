package net.apporu.apporudreamadditions.sound;

import net.apporu.apporudreamadditions.ApporusDreamAdditions;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModSounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, ApporusDreamAdditions.MOD_ID);

    // Sound List:
    public static final RegistryObject<SoundEvent> LIL_SUS_SQUEAK = createSoundEvent("lil_sus_squeak");




    private static RegistryObject<SoundEvent> createSoundEvent(final String soundName) {
        return SOUND_EVENTS.register(soundName, () -> new SoundEvent(new ResourceLocation(ApporusDreamAdditions.MOD_ID, soundName)));
    }
    public static void register(IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
    }
}
