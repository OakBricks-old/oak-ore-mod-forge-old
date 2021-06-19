package org.oakbricks.oakores;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.oakbricks.oakores.block.RegisterBlock;
import org.oakbricks.oakores.item.RegisterItem;

import static org.oakbricks.oakores.OakOres.MOD_ID;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(MOD_ID)
public class OakOres
{
    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "oakores";
    public static final ItemGroup MAIN_GROUP = new MainGroup("oakorestab");

    public OakOres() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        // Register the setup method for modloading
        bus.addListener(this::setup);
        RegisterItem.ITEMS.register(bus);
        // Register ourselves for server and other game events we are interested in

        RegisterItem.ITEMS.register(bus);
        RegisterBlock.BLOCKS.register(bus);

        MinecraftForge.EVENT_BUS.register(this);


    }

    private void setup(final FMLCommonSetupEvent event)
    {
        // some preinit code
        //LOGGER.info("oakores preinit");
    }

    public static class MainGroup extends ItemGroup {

        public MainGroup(String label) {
            super(label);
        }

        @Override
        public ItemStack makeIcon() {
            return RegisterItem.PURPI.get().getDefaultInstance();
        }
    }

}
