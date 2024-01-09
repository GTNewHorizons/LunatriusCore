package com.github.lunatrius.core.reference;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Reference {

    public static final String MODID = "LunatriusCore";
    public static final String NAME = "LunatriusCore";
    public static final String VERSION = "GRADLETOKEN_VERSION";
    public static final String PROXY_SERVER = "com.github.lunatrius.core.proxy.ServerProxy";
    public static final String PROXY_CLIENT = "com.github.lunatrius.core.proxy.ClientProxy";
    public static final String GUI_FACTORY = "com.github.lunatrius.core.client.gui.GuiFactory";

    public static Logger logger = LogManager.getLogger(Reference.MODID);
}
