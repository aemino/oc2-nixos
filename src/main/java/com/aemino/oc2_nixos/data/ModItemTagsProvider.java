package com.aemino.oc2_nixos.data;

import javax.annotation.Nullable;

import com.aemino.oc2_nixos.Main;
import com.aemino.oc2_nixos.item.Items;

import static li.cil.oc2.common.tags.ItemTags.*;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public final class ModItemTagsProvider extends ItemTagsProvider {
    public ModItemTagsProvider(final DataGenerator generator, final BlockTagsProvider blockTagsProvider, @Nullable final ExistingFileHelper existingFileHelper) {
        super(generator, blockTagsProvider, Main.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags() {
        tag(DEVICES_HARD_DRIVE).add(
            Items.HARD_DRIVE_CUSTOM.get()
        );

        tag(DEVICES_FLASH_MEMORY).add(
            Items.FLASH_MEMORY_CUSTOM.get()
        );

        tag(DEVICE_NEEDS_REBOOT).add(
            Items.FLASH_MEMORY_CUSTOM.get(),
            Items.HARD_DRIVE_CUSTOM.get()
        );
    }
}
