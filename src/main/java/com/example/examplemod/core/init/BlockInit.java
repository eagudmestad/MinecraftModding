package com.example.examplemod.core.init;

import com.example.examplemod.ExampleMod;
import com.example.examplemod.common.blocks.CustomBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ExampleMod.MOD_ID);

    public static final RegistryObject<Block> EXAMPLE_BLOCK = BLOCKS.register("example_block",
            () -> new Block(AbstractBlock.Properties.create(Material.IRON, MaterialColor.BLUE).hardnessAndResistance(15f,30f)
            .harvestTool(ToolType.PICKAXE)
            .harvestLevel(2)
            .sound(SoundType.METAL)
            .setRequiresTool()));

    public static final RegistryObject<CustomBlock> CUSTOM_BLOCK = BLOCKS.register("custom_block",
            () -> new CustomBlock(AbstractBlock.Properties.create(Material.WOOD).harvestTool(ToolType.AXE)
                    .harvestLevel(1).sound(SoundType.WOOD).setRequiresTool()));
}
