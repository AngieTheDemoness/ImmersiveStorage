package com.angiethedemoness.immersivestorage;


import com.angiethedemoness.immersivestorage.handler.ConfigurationHandler;
import com.angiethedemoness.immersivestorage.init.ISBlock;
import com.angiethedemoness.immersivestorage.init.Recipes;
import com.angiethedemoness.immersivestorage.proxy.IProxy;
import com.angiethedemoness.immersivestorage.reference.Reference;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid=Reference.MOD_ID, name=Reference.MOD_NAME, version=Reference.VERSION, guiFactory=Reference.GUI_FACTORY_CLASS)
public class ImmersiveStorage
{
  @Mod.Instance(Reference.MOD_ID)
  public static ImmersiveStorage instance;

  @SidedProxy(clientSide=Reference.CLIENT_PROXY_CLASS, serverSide=Reference.SERVER_PROXY_CLASS)
  public static IProxy proxy;

  @Mod.EventHandler
  public void preInit(FMLPreInitializationEvent event)
  {
    ConfigurationHandler.init(event.getSuggestedConfigurationFile());
    FMLCommonHandler.instance().bus().register(new ConfigurationHandler());

    ISBlock.init();
  }

  @Mod.EventHandler
  public void init(FMLInitializationEvent event)
  {
    Recipes.init();
  }

  @Mod.EventHandler
  public void postInit(FMLPostInitializationEvent event)
  {

  }

}
