package com.aemino.oc2_nixos.data;

import javax.annotation.Nullable;

import com.aemino.oc2_nixos.Main;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public final class ModBlockTagsProvider extends BlockTagsProvider {
    public ModBlockTagsProvider(final DataGenerator generator, @Nullable final ExistingFileHelper existingFileHelper) {
        super(generator, Main.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags() {}
}
