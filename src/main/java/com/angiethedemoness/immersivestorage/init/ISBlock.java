package com.angiethedemoness.immersivestorage.init;

import com.angiethedemoness.immersivestorage.block.BlockIS;
import com.angiethedemoness.immersivestorage.block.BlockSteelSheet;
import cpw.mods.fml.common.registry.GameRegistry;

public class ISBlock
{
  public static final BlockIS sheetSteel = new BlockSteelSheet();

  public static void init()
  {
    GameRegistry.registerBlock(sheetSteel, "sheetSteel");
  }
}
