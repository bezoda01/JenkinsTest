package config;

import aquality.selenium.core.utilities.ISettingsFile;
import aquality.selenium.core.utilities.JsonSettingsFile;

public class JsonEnvironment {
    public static final ISettingsFile environment = new JsonSettingsFile("config.json");
}
