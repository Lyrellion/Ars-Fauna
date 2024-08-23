
package net.mcreator.arsfauna.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class FaunaLogoItem extends Item {
	public FaunaLogoItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
