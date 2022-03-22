package com.aemino.oc2_nixos.data;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public final class DataGenerators {
    @SubscribeEvent
    public static void gatherData(final GatherDataEvent event) {
        final var generator = event.getGenerator();
        final var existingFileHelper = event.getExistingFileHelper();

        if (event.includeServer()) {
            final var blockTagsProvider = new ModBlockTagsProvider(generator, existingFileHelper);
            final var itemTagsProvider = new ModItemTagsProvider(generator, blockTagsProvider, existingFileHelper);

            generator.addProvider(blockTagsProvider);
            generator.addProvider(itemTagsProvider);
        }
    }
}
