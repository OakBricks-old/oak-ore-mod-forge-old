package org.oakbricks.oakores.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Blocks;
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


    public static final RegistryObject<Block> PURPI_BLOCK = BLOCKS
            .register("purpi_block",
                    () -> new Block(AbstractBlock.Properties.of(Material.METAL, MaterialColor.COLOR_PURPLE)
                            .strength(6.5f, 20.5f).harvestTool(ToolType.PICKAXE).harvestLevel(3)
                            .sound(SoundType.METAL).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> LEAD_BLOCK = BLOCKS
            .register("lead_block",
                    () -> new Block(AbstractBlock.Properties.of(Material.METAL, MaterialColor.COLOR_LIGHT_GRAY)
                            .strength(8.5f, 17.5f).harvestTool(ToolType.PICKAXE).harvestLevel(3)
                            .sound(SoundType.METAL).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> PURPI_ORE = BLOCKS.register("purpi_ore",
            () -> new Block(AbstractBlock.Properties.of(Material.STONE, MaterialColor.STONE).harvestLevel(3).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops().strength/*forge mappings are shit*/(3.5f, 10.25f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> LEAD_ORE = BLOCKS.register("lead_ore",
            () -> new Block(AbstractBlock.Properties.of(Material.STONE, MaterialColor.STONE).harvestLevel(2).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops().strength/*forge mappings are shit*/(4.2f, 8.3f).sound(SoundType.STONE)));

    //public static final RegistryObject<Block> PURPI_ORE = BLOCKS.register("purpi_ore",
    //        () -> new Block(AbstractBlock.Properties.of(Material.STONE, MaterialColor.STONE).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops().harvestLevel(3).strength(13f, 25f).sound(SoundType.STONE)));
}
