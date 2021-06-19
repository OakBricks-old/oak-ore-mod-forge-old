package org.oakbricks.oakores.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.ToolItem;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import org.oakbricks.oakores.OakOres;

import net.minecraft.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegisterBlock {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, OakOres.MOD_ID);

    public static final RegistryObject<Block> EXAMPLE_BLOCK = BLOCKS
            .register("example_block",
                    () -> new Block(AbstractBlock.Properties.of(Material.METAL, MaterialColor.COLOR_BLUE)
                            .strength(15f, 30f).harvestTool(ToolType.PICKAXE).harvestLevel(2)
                            .sound(SoundType.METAL).requiresCorrectToolForDrops()));


    //public static final RegistryObject<Block> PURPI_ORE = BLOCKS.register("purpi_ore",
    //        () -> new Block(AbstractBlock.Properties.of(Material.STONE, MaterialColor.STONE).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops().harvestLevel(3).strength(13f, 25f).sound(SoundType.STONE)));
}
