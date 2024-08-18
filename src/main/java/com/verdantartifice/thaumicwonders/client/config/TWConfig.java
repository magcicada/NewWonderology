package com.verdantartifice.thaumicwonders.client.config;

import com.verdantartifice.thaumicwonders.ThaumicWonders;

import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.ConfigManager;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Config(modid = ThaumicWonders.MODID, name = ThaumicWonders.NAME)
public class TWConfig {
    @Config.Comment("General")
    public static GeneralSettings general_settings = new GeneralSettings();

    public static class GeneralSettings {
        @Config.Name("Cleansing Charm: Capacity")
        @Config.Comment("The maximum Vis capacity of the Cleansing Charm [default: 200]")
        @Config.RangeInt(min = 1, max = 99999)
        @Config.RequiresMcRestart
        public int CC_CAPACITY = 200;

        @Config.Name("Cleansing Charm: Cost")
        @Config.Comment("The Vis cost after Warp is taken by the Cleansing Charm [default: 10]")
        @Config.RangeInt(min = 1, max = 99999)
        @Config.RequiresMcRestart
        public int CC_COST = 10;

        @Config.Name("Cleansing Charm: Flux")
        @Config.Comment("The amount of seconds it takes for Flux to dissipate into the aura while the activated Cleansing Charm is worn [default: 10]")
        @Config.RangeInt(min = 1, max = 99999)
        @Config.RequiresMcRestart
        public int CC_FLUX = 10;

        @Config.Name("Cleansing Charm: Flux Amount")
        @Config.Comment("The amount of Flux that generates from the activated Cleansing Charm [default: 0.1]")
        @Config.RangeDouble(min = 0.1, max = 99999)
        @Config.RequiresMcRestart
        public double CC_FLUX_AMOUNT = 0.1D;

        @Config.Name("Cleansing Charm: Time")
        @Config.Comment("The amount of minutes it takes for the Cleansing Charm to remove Warp [default: 5]")
        @Config.RangeInt(min = 1, max = 99999)
        @Config.RequiresMcRestart
        public int CC_TIME = 5;

        @Config.Name("Cleansing Charm: Warp")
        @Config.Comment("The amount of Warp taken by the Cleansing Charm  [default: 1]")
        @Config.RangeInt(min = 1, max = 99999)
        @Config.RequiresMcRestart
        public int CC_WARP = 1;
    }

    @Mod.EventBusSubscriber(modid = ThaumicWonders.MODID)
    public static class EventHandler {
        @SubscribeEvent
        public static void onConfigChanged(final ConfigChangedEvent.OnConfigChangedEvent event) {
            if (event.getModID().equals(ThaumicWonders.MODID)) {
                ConfigManager.sync(ThaumicWonders.MODID, Config.Type.INSTANCE);
            }
        }
    }
}
