package com.angiethedemoness.immersivestorage.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockSteelSheet extends BlockIS
{
  public BlockSteelSheet()
  {
    super(Material.iron);
    this.setBlockName("sheetSteel");
    setStepSound(Block.soundTypeMetal);
  }

}
