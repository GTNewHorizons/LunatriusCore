package com.github.lunatrius.core.proxy;

import com.github.lunatrius.core.handler.ConfigurationHandler;
import com.github.lunatrius.core.handler.GuiHandler;
import cpw.mods.fml.common.FMLCommonHandler;
import net.minecraftforge.common.MinecraftForge;

public class ClientProxy extends CommonProxy {
    @Override
    public void registerTickers() {
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
        MinecraftForge.EVENT_BUS.register(new GuiHandler());
    }
}
