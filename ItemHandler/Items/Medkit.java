package ItemHandler.Items;

import ItemHandler.DamageType;
import ItemHandler.Item;

public class Medkit extends Item {
    public Medkit() {
        super("Medkit", "", false, DamageType.RANGED);
    }
}
