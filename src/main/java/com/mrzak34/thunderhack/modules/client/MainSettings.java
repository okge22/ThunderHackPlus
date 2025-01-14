package com.mrzak34.thunderhack.modules.client;

import com.mrzak34.thunderhack.modules.Module;
import com.mrzak34.thunderhack.setting.Setting;

public class MainSettings extends Module {
    public MainSettings() {
        super("ClientSettings", "Настройки клиента", Category.CLIENT);
    }

    public Setting<Boolean> showcapes = this.register(new Setting<>("Capes", true));
    public Setting<Boolean> DownloadCapes = this.register(new Setting<>("DownloadCapes", true));
    public Setting<Boolean> notifyToggles = this.register(new Setting<>("NotifyToggles", false));
    public Setting<Boolean> mainMenu = this.register(new Setting<>("MainMenu", true));
    public Setting<ShaderModeEn> shaderMode = register(new Setting("ShaderMode", ShaderModeEn.Smoke));

    public enum ShaderModeEn {
        Smoke,
        WarThunder,
        Dicks
    }
}
