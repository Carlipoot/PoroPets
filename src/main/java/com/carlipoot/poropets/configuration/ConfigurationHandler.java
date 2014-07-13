package com.carlipoot.poropets.configuration;

import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigurationHandler {

    public static Configuration configuration;

    public static void init(File configFile) {
         configuration = new Configuration(configFile);
        Boolean configValue = false;

        try {
            configuration.load();

            configValue = configuration.get(Configuration.CATEGORY_GENERAL, "configValue", true, "Example value!").getBoolean(true);
        } catch (Exception e) {

        } finally {
            if ( configuration.hasChanged() ) {
                configuration.save();
            }
        }
    }

}
