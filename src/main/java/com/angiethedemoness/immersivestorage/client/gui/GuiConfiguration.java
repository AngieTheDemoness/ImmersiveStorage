package com.angiethedemoness.immersivestorage.client.gui;

import com.angiethedemoness.immersivestorage.handler.ConfigurationHandler;
import com.angiethedemoness.immersivestorage.reference.Reference;
import cpw.mods.fml.client.config.GuiConfig;
import jdk.nashorn.internal.runtime.regexp.joni.Config;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;

public class GuiConfiguration extends GuiConfig
{
  public GuiConfiguration(GuiScreen guiScreen)
  {
    super (guiScreen,
        new ConfigElement(ConfigurationHandler.configuration.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(),
        Reference.MOD_ID,
        false,
        false,
        GuiConfig.getAbridgedConfigPath(ConfigurationHandler.configuration.toString()));
  }
}
