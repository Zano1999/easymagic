package fuzs.easymagic.init;

import fuzs.easymagic.EasyMagic;
import fuzs.easymagic.core.CommonAbstractions;
import fuzs.easymagic.world.inventory.ModEnchantmentMenu;
import fuzs.easymagic.world.level.block.entity.ModEnchantmentTableBlockEntity;
import fuzs.puzzleslib.api.init.v2.RegistryManager;
import fuzs.puzzleslib.api.init.v2.RegistryReference;
import net.minecraft.tags.TagKey;
import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.entity.BlockEntityType;

public class ModRegistry {
    private static final RegistryManager REGISTRY = RegistryManager.instant(EasyMagic.MOD_ID);
    public static final RegistryReference<BlockEntityType<ModEnchantmentTableBlockEntity>> ENCHANTING_TABLE_BLOCK_ENTITY_TYPE = REGISTRY.registerBlockEntityType("enchanting_table", () -> BlockEntityType.Builder.of(CommonAbstractions.INSTANCE::createModEnchantmentTableBlockEntity, Blocks.ENCHANTING_TABLE));
    public static final RegistryReference<MenuType<ModEnchantmentMenu>> ENCHANTMENT_MENU_TYPE = REGISTRY.registerMenuType("enchanting", () -> ModEnchantmentMenu::new);
    public static final TagKey<Item> ENCHANTING_CATALYSTS_ITEM_TAG = REGISTRY.createItemTag("enchanting_catalysts");
    public static final TagKey<Item> REROLL_CATALYSTS_ITEM_TAG = REGISTRY.createItemTag("reroll_catalysts");

    public static void touch() {

    }
}
