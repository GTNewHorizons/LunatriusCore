package com.github.lunatrius.core.version;

import static cpw.mods.fml.common.gameevent.TickEvent.ClientTickEvent;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class VersionTicker {

    public static final String UPDATESAVAILABLE = "lunatriuscore.message.updatesavailable";

    @SubscribeEvent
    public void onTick(ClientTickEvent event) {

    }

}
