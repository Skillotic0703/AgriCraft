package com.infinityraider.agricraft.render.items.journal.page;

import com.infinityraider.agricraft.AgriCraft;
import com.infinityraider.agricraft.api.v1.content.items.IAgriJournalItem;
import com.infinityraider.agricraft.render.items.journal.PageRenderer;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

public class FrontPage extends Page {
    public static final Page INSTANCE = new FrontPage();

    private static final ResourceLocation BACKGROUND_FRONT_RIGHT = new ResourceLocation(
            AgriCraft.instance.getModId().toLowerCase(),
            "textures/journal/front_page.png"
    );

    private FrontPage() {}

    @Override
    public void drawLeftSheet(PageRenderer renderer, MatrixStack transforms, ItemStack stack, IAgriJournalItem journal) {
        // Draw nothing
    }

    @Override
    public void drawRightSheet(PageRenderer renderer, MatrixStack transforms, ItemStack stack, IAgriJournalItem journal) {
        renderer.drawFullPageTexture(transforms, BACKGROUND_FRONT_RIGHT);
    }
}
