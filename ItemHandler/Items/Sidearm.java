package ItemHandler.Items;

import ItemHandler.DamageType;
import ItemHandler.Item;

public class Sidearm extends Item {
    public Sidearm() {
        super("Sidearm", "An old but reliable space sidearm", false, DamageType.RANGED);
    }
}
