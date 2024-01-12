package com.nothrottle.log_minecraft_startup;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.fabricmc.loader.api.entrypoint.PreLaunchEntrypoint;

public class PreLaunch implements PreLaunchEntrypoint {

    public static Logger LOGGER = LoggerFactory.getLogger("log_minecraft_startup");

    @Override
    public void onPreLaunch() {

        LOGGER.info("Minecraft Pre-launching - LOGMCPRELAUNCH");


    }


}
