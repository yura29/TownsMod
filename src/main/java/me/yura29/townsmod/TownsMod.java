package me.yura29.townsmod;

import me.yura29.townsmod.proxy.CommonProxy;
import me.yura29.townsmod.tab.CreativeTabTowns;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = TownsMod.MODID, version = TownsMod.VERSION, name = TownsMod.NAME)
public class TownsMod
{
    public static final String MODID = "townsmod";
    public static final String VERSION = "1.0";
    public static final String NAME  = "Towns mod";

    @SidedProxy(clientSide = "me.yura29.townsmod.proxy.ClientProxy", serverSide = "me.yura29.townsmod.proxy.CommonProxy")
    public static CommonProxy proxy;

    @Mod.Instance
    public static TownsMod instance;

    public static CreativeTabTowns tabTowns;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        tabTowns = new CreativeTabTowns(CreativeTabs.getNextID(), "tab_towns");
        proxy.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.init(event);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        proxy.postInit(event);
    }
}
