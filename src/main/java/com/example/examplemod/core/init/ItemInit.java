package com.example.examplemod.core.init;

import com.example.examplemod.ExampleMod;
import com.example.examplemod.common.items.SpecialItem;
import net.minecraft.item.*;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ExampleMod.MOD_ID);

    public static final RegistryObject<Item> EXAMPLE_ITEM = ITEMS.register("example_item",
            () -> new Item(new Item.Properties().group(ExampleMod.TUTORIAL_GROUP)));

    public static final RegistryObject<SpecialItem> SPECIAL_ITEM = ITEMS.register("special_item",
            () -> new SpecialItem(new Item.Properties().group(ExampleMod.TUTORIAL_GROUP)));


    public static final RegistryObject<Item> EXAMPLE_FOOD = ITEMS.register("example_food",
            () -> new Item(new Item.Properties().group(ExampleMod.TUTORIAL_GROUP)
                    .food(FoodInit.EXAMPLE_FOOD)));


    //Block Items
    public static final RegistryObject<BlockItem> EXAMPLE_BLOCK = ITEMS.register("example_block",
            () -> new BlockItem(BlockInit.EXAMPLE_BLOCK.get(),new Item.Properties().group(ExampleMod.TUTORIAL_GROUP)));


    public static final RegistryObject<BlockItem> CUSTOM_BLOCK = ITEMS.register("custom_block",
            () -> new BlockItem(BlockInit.CUSTOM_BLOCK.get(), new Item.Properties().group(ExampleMod.TUTORIAL_GROUP)));


}
