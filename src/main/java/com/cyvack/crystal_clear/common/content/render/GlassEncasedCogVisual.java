package com.cyvack.crystal_clear.common.content.render;

import com.simibubi.create.AllPartialModels;
import com.simibubi.create.content.kinetics.base.KineticBlockEntity;
import com.simibubi.create.content.kinetics.simpleRelays.encased.EncasedCogVisual;
import dev.engine_room.flywheel.api.visualization.VisualizationContext;
import dev.engine_room.flywheel.lib.model.Models;

public class GlassEncasedCogVisual extends EncasedCogVisual {

    private GlassEncasedCogVisual(VisualizationContext context, KineticBlockEntity blockEntity, boolean large, float partialTick) {
        super(context, blockEntity, large, partialTick,
                Models.partial(large ? AllPartialModels.SHAFTLESS_LARGE_COGWHEEL : AllPartialModels.SHAFTLESS_COGWHEEL));
    }

    public static GlassEncasedCogVisual small(VisualizationContext context, KineticBlockEntity blockEntity, float partialTick) {
        return new GlassEncasedCogVisual(context, blockEntity, false, partialTick);
    }

    public static GlassEncasedCogVisual large(VisualizationContext context, KineticBlockEntity blockEntity, float partialTick) {
        return new GlassEncasedCogVisual(context, blockEntity, true, partialTick);
    }
}
