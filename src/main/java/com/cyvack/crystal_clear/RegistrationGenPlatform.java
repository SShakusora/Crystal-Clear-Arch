package com.cyvack.crystal_clear;

import com.cyvack.crystal_clear.common.content.blocks.GlassEncasedCogwheel;
import com.cyvack.crystal_clear.common.content.blocks.GlassEncasedShaft;
import com.cyvack.crystal_clear.common.generation.RegistrateGenHelper;
import com.cyvack.crystal_clear.neoforge.RegistrationGenPlatformImpl;
import com.simibubi.create.content.decoration.MetalScaffoldingBlock;
import com.simibubi.create.content.decoration.encasing.EncasableBlock;
import com.simibubi.create.content.decoration.encasing.EncasedBlock;
import com.simibubi.create.content.decoration.encasing.EncasingRegistry;
import com.tterrag.registrate.builders.BlockBuilder;
import com.tterrag.registrate.util.nullness.NonNullSupplier;
import com.tterrag.registrate.util.nullness.NonNullUnaryOperator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.function.Supplier;

public class RegistrationGenPlatform {

    @NotNull
    public static <B extends Block & EncasedBlock, P, E extends Block & EncasableBlock> NonNullUnaryOperator<BlockBuilder<B, P>> baseAdd(Supplier<E> sup) {
        return b -> b.transform(EncasingRegistry.addVariantTo(sup));
    }

    public static <B extends Block & EncasedBlock, P, E extends Block & EncasableBlock> NonNullUnaryOperator<BlockBuilder<B, P>> addVariant(@Nullable ResourceLocation loc, NonNullSupplier<E> sup) {
        return RegistrationGenPlatformImpl.addVariant(loc, sup);
    }

    public static <B extends MetalScaffoldingBlock, P> NonNullUnaryOperator<BlockBuilder<B, P>> glassScaffolding(String modId, String casing, Boolean clear, RegistrateGenHelper.IDArrayHolder<ResourceLocation> holder) {
        return RegistrationGenPlatformImpl.glassScaffolding(modId, casing, clear, holder);
    }

    public static <B extends GlassEncasedShaft, P> NonNullUnaryOperator<BlockBuilder<B, P>> glassEncasedshaft(String modId, String casing, Boolean clear) {
        return RegistrationGenPlatformImpl.glassEncasedshaft(modId, casing, clear);
    }

    public static <B extends GlassEncasedCogwheel, P> NonNullUnaryOperator<BlockBuilder<B, P>> glassEncasedCog(String modId, String casing, boolean large, String name, String blockFolder) {
        return RegistrationGenPlatformImpl.glassEncasedCog(modId, casing, large, name, blockFolder);
    }
}
