package com.github.lunatrius.core.version;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;

import static cpw.mods.fml.common.gameevent.TickEvent.ClientTickEvent;

public class VersionTicker {
    public static final String UPDATESAVAILABLE = "lunatriuscore.message.updatesavailable";

    @SubscribeEvent
    public void onTick(ClientTickEvent event) {

    }

}
