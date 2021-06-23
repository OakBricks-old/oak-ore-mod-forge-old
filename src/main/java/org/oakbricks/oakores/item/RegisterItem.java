package org.oakbricks.oakores.item;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import org.oakbricks.oakores.OakOres;
import org.oakbricks.oakores.block.RegisterBlock;
import org.oakbricks.oakores.item.tools.purpi.PurpiToolMaterial;

public class RegisterItem {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, OakOres.MOD_ID);

    public static final RegistryObject<Item> PURPI = ITEMS.register("purpi", () -> new Item(new Item.Properties().tab(OakOres.MAIN_GROUP)));

    public static final RegistryObject<BlockItem> PURPI_BLOCK = ITEMS.register("purpi_block",
            () -> new BlockItem(RegisterBlock.PURPI_BLOCK.get(),
                    new Item.Properties().tab(OakOres.MAIN_GROUP)));

    public static final RegistryObject<BlockItem> PURPI_ORE = ITEMS.register("purpi_ore",
            () -> new BlockItem(RegisterBlock.PURPI_ORE.get(),
                    new Item.Properties().tab(OakOres.MAIN_GROUP)));

    public static final RegistryObject<BlockItem> LEAD_ORE = ITEMS.register("lead_ore",
            () -> new BlockItem(RegisterBlock.LEAD_ORE.get(),
                    new Item.Properties().tab(OakOres.MAIN_GROUP)));

    public static final RegistryObject<Item> PURPI_SWORD = ITEMS.register("purpi_sword",
            () -> new SwordItem(PurpiToolMaterial.PURPI_TOOL, 5, -1f,
                    new Item.Properties().tab(OakOres.MAIN_GROUP)));

    public static final RegistryObject<Item> PURPI_AXE = ITEMS.register("purpi_axe",
            () -> new SwordItem(PurpiToolMaterial.PURPI_TOOL, 5, -1f,
                    new Item.Properties().tab(OakOres.MAIN_GROUP)));

    public static final RegistryObject<Item> PURPI_PICKAXE = ITEMS.register("purpi_pickaxe",
            () -> new SwordItem(PurpiToolMaterial.PURPI_TOOL, 5, -1f,
                    new Item.Properties().tab(OakOres.MAIN_GROUP)));

    public static final RegistryObject<Item> PURPI_SHOVEL = ITEMS.register("purpi_shovel",
            () -> new SwordItem(PurpiToolMaterial.PURPI_TOOL, 5, -1f,
                    new Item.Properties().tab(OakOres.MAIN_GROUP)));

    public static final RegistryObject<Item> PURPI_HOE = ITEMS.register("purpi_hoe",
            () -> new SwordItem(PurpiToolMaterial.PURPI_TOOL, 5, -1f,
                    new Item.Properties().tab(OakOres.MAIN_GROUP)));

    public static final RegistryObject<Item> PURPI_HELMET = ITEMS.register("purpi_helmet",
            () -> new ArmorItem(ArmorClass.PURPI_ARMOR, EquipmentSlotType.HEAD,
                    new Item.Properties().tab(OakOres.MAIN_GROUP)));

    public static final RegistryObject<Item> PURPI_CHESTPLATE = ITEMS.register("purpi_chestplate",
            () -> new ArmorItem(ArmorClass.PURPI_ARMOR, EquipmentSlotType.CHEST,
                    new Item.Properties().tab(OakOres.MAIN_GROUP)));

    public static final RegistryObject<Item> PURPI_LEGGINGS = ITEMS.register("purpi_leggings",
            () -> new ArmorItem(ArmorClass.PURPI_ARMOR, EquipmentSlotType.LEGS,
                    new Item.Properties().tab(OakOres.MAIN_GROUP)));

    public static final RegistryObject<Item> purpi_BOOTS = ITEMS.register("purpi_boots",
            () -> new ArmorItem(ArmorClass.PURPI_ARMOR, EquipmentSlotType.FEET,
                    new Item.Properties().tab(OakOres.MAIN_GROUP)));

    //block items
    //public static final RegistryObject<BlockItem> PURPI_ORE = ITEMS.register("purpi_ore", () -> new BlockItem(RegisterBlock.PURPI_ORE.get(), new Item.Properties().tab(ItemGroup.TAB_MISC)));
}
