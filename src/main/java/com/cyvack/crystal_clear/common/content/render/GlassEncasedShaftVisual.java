package com.cyvack.crystal_clear.common.content.render;

import com.simibubi.create.AllPartialModels;
import com.simibubi.create.content.kinetics.base.KineticBlockEntity;
import com.simibubi.create.content.kinetics.base.SingleAxisRotatingVisual;
import dev.engine_room.flywheel.api.visualization.VisualizationContext;
import dev.engine_room.flywheel.lib.model.Models;

public class GlassEncasedShaftVisual extends SingleAxisRotatingVisual<KineticBlockEntity> {

    public GlassEncasedShaftVisual(VisualizationContext context, KineticBlockEntity blockEntity, float partialTick) {
        super(context, blockEntity, partialTick, Models.partial(AllPartialModels.SHAFT));
    }

    public static GlassEncasedShaftVisual create(VisualizationContext context, KineticBlockEntity blockEntity, float partialTick) {
        return new GlassEncasedShaftVisual(context, blockEntity, partialTick);
    }
}
