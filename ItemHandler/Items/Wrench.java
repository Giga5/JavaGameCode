package ItemHandler.Items;

import ItemHandler.DamageType;
import ItemHandler.Item;

public class Wrench extends Item {

    public Wrench() {
        super("Wrench", "A heavy pipe wrench", false, DamageType.MELEE);
    }
}
