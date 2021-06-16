package org.oakbricks.oakores.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import org.oakbricks.oakores.OakOres;

public class RegisterItem {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, OakOres.MOD_ID);

    public static final RegistryObject<Item> PURPI = ITEMS.register("purpi", () -> new Item(new Item.Properties().tab(ItemGroup.TAB_MISC)));
}
