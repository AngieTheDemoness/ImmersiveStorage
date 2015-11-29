package com.angiethedemoness.immersivestorage.init;

import blusunrize.immersiveengineering.common.IEContent;
import blusunrize.immersiveengineering.common.IERecipes;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;

import java.util.HashMap;

public class Recipes
{
  public static HashMap hashMap;

  public static void init()
  {
    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ISBlock.sheetSteel), " s ", "shs", " s ", 's', "ingotSteel", 'h', new ItemStack(IEContent.itemTool, 1, 0)));
    IERecipes.addArcRecipe((new ItemStack(IEContent.itemMetal, 1, 7)), ISBlock.sheetSteel, 200, 512, null);
  }
}
