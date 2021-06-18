package org.oakbricks.oakores.worldgen;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.placement.TopSolidRangeConfig;
import net.minecraftforge.event.world.BiomeLoadingEvent;

public class OreClass {

    public static void oreGen(final BiomeLoadingEvent event) {

        if(!(event.getCategory().equals(Biome.Category.NETHER) || event.getCategory().equals(Biome.Category.THEEND))) {
            event.getGeneration().withConfig(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.configured(new OreFeatureConfig()).withPlacement(Placement.RANGE.configured(new TopSolidRangeConfig(5, 0, 32))).square().func_242731_b());
        }

    }

}
