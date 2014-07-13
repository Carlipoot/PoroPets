package com.carlipoot.poropets.configuration;

import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigurationHandler {

    public static void init(File configFile) {
        Configuration configuration = new Configuration(configFile);
        Boolean configValue = false;

        try {
            configuration.load();

            configValue = configuration.get(Configuration.CATEGORY_GENERAL, "configValue", true, "Example value!").getBoolean(true);
        } catch (Exception e) {

        } finally {
            configuration.save();
        }

        System.out.println(configValue);
    }

}
