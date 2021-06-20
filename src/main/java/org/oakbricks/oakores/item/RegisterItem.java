package org.oakbricks.oakores.item;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import org.oakbricks.oakores.OakOres;
import org.oakbricks.oakores.block.RegisterBlock;

public class RegisterItem {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, OakOres.MOD_ID);

    public static final RegistryObject<Item> PURPI = ITEMS.register("purpi", () -> new Item(new Item.Properties().tab(OakOres.MAIN_GROUP)));

    public static final RegistryObject<BlockItem> PURPI_BLOCK = ITEMS.register("purpi_block",
            () -> new BlockItem(RegisterBlock.PURPI_BLOCK.get(),
                    new Item.Properties().tab(OakOres.MAIN_GROUP)));

    public static final RegistryObject<BlockItem> PURPI_ORE = ITEMS.register("purpi_ore",
            () -> new BlockItem(RegisterBlock.PURPI_BLOCK.get(),
                    new Item.Properties().tab(OakOres.MAIN_GROUP)));

    //block items
    //public static final RegistryObject<BlockItem> PURPI_ORE = ITEMS.register("purpi_ore", () -> new BlockItem(RegisterBlock.PURPI_ORE.get(), new Item.Properties().tab(ItemGroup.TAB_MISC)));
}
