package net.astralsight.influx.item;

import net.astralsight.influx.Influx;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Influx.MOD_ID);

public static final RegistryObject<Item> CRYSTALLIZED_INFLUX = ITEMS.register("crystallized_influx",
        () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> INFLUX_SHARD = ITEMS.register("influx_shard",
            () -> new Item(new Item.Properties()));

    public static  void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
