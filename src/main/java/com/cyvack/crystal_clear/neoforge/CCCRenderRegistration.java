package com.cyvack.crystal_clear.neoforge;

import com.cyvack.crystal_clear.common.content.render.GlassEncasedCogRenderer;
import com.cyvack.crystal_clear.common.content.render.GlassEncasedCogVisual;
import com.cyvack.crystal_clear.common.content.render.GlassEncasedShaftRenderer;
import com.cyvack.crystal_clear.common.content.render.GlassEncasedShaftVisual;
import com.cyvack.crystal_clear.common.registry.CCCBlockEntities;
import dev.engine_room.flywheel.lib.visualization.SimpleBlockEntityVisualizer;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderers;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;

public class CCCRenderRegistration {

    public static void onClientSetup(FMLClientSetupEvent event) {
        event.enqueueWork(() -> {
            BlockEntityRenderers.register(CCCBlockEntities.GLASS_ENCASED_SHAFT.get(), GlassEncasedShaftRenderer::new);
            BlockEntityRenderers.register(CCCBlockEntities.GLASS_ENCASED_COG.get(), GlassEncasedCogRenderer::small);
            BlockEntityRenderers.register(CCCBlockEntities.GLASS_ENCASED_LARGE_COG.get(), GlassEncasedCogRenderer::large);

            SimpleBlockEntityVisualizer.builder(CCCBlockEntities.GLASS_ENCASED_SHAFT.get())
                    .factory(GlassEncasedShaftVisual::create)
                    .neverSkipVanillaRender()
                    .apply();

            SimpleBlockEntityVisualizer.builder(CCCBlockEntities.GLASS_ENCASED_COG.get())
                    .factory(GlassEncasedCogVisual::small)
                    .neverSkipVanillaRender()
                    .apply();

            SimpleBlockEntityVisualizer.builder(CCCBlockEntities.GLASS_ENCASED_LARGE_COG.get())
                    .factory(GlassEncasedCogVisual::large)
                    .neverSkipVanillaRender()
                    .apply();
        });
    }
}
