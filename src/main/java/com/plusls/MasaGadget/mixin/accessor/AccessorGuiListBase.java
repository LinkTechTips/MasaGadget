package com.plusls.MasaGadget.mixin.accessor;

import fi.dy.masa.malilib.gui.GuiListBase;
import fi.dy.masa.malilib.gui.widgets.WidgetListBase;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

//@Mixin(GuiListBase.class)
@Mixin(value = GuiListBase.class, remap = false)
public interface AccessorGuiListBase {
    @Invoker
    WidgetListBase<?, ?> invokeGetListWidget();
}
