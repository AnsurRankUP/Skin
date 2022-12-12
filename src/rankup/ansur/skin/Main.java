package rankup.ansur.skin;

import lombok.Getter;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    @Getter
    private static Main instance;

    @Override
    public void onEnable() {
        instance = this;
        getLogger().info("Initializing:");
        super.onEnable();
    }

}
