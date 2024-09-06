package com.verdantartifice.thaumicwonders.proxy;

import com.verdantartifice.thaumicwonders.ThaumicWonders;
import com.verdantartifice.thaumicwonders.client.config.KeyBindings;

import net.minecraftforge.client.model.obj.OBJLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import thaumcraft.client.lib.ender.ShaderHelper;

public class ClientProxy extends CommonProxy {
    private ProxyEntities proxyEntities = new ProxyEntities();
    private ProxyTESR proxyTESR = new ProxyTESR();
    
    @Override
    public void preInit(FMLPreInitializationEvent event) {
        super.preInit(event);
        this.proxyEntities.setupEntityRenderers();
        OBJLoader.INSTANCE.addDomain(ThaumicWonders.MODID);
    }
    
    @Override
    public void init(FMLInitializationEvent event) {
        super.init(event);
        KeyBindings.init();
        this.proxyTESR.setupTESR();
    }
}
