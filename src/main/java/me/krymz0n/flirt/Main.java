package me.krymz0n.flirt;

import me.krymz0n.flirt.command.Command;
import me.krymz0n.flirt.utils.Color;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public final class Main extends JavaPlugin {
    public FileConfiguration config = getConfig();
    public Logger log;

    @Override
    public void onEnable() {
        log = getLogger();
        log.info(Color.chat("&6Enabling the flirt plugin! By: KRYMZ0N"));

        saveDefaultConfig();

        new Command(this);

    }

    @Override
    public void onDisable() {
        log.info(Color.chat("&6Disabling the Flirt plugin! By: KRYMZ0N"));
    }
}
