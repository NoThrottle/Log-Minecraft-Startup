package com.nothrottle.log_minecraft_startup;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Initializer implements ModInitializer {

    public static final Logger LOGGER = LoggerFactory.getLogger("log_minecraft_startup");

    @Override
    public void onInitialize() {

        LOGGER.info("Minecraft Initializing - LOGMCINIT");

    }
}