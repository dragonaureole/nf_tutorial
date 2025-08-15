package net.dragon.neofmod.item;

import net.dragon.neofmod.NfMod;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(NfMod.MOD_ID);

    public static final DeferredItem<Item> BLACK_HOLE = ITEMS.register("black_hole", ()-> new Item(new Item.Properties()));

    public static final DeferredItem<Item> BLACK_HOLE_HOT = ITEMS.register("black_hole_hot", ()-> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
