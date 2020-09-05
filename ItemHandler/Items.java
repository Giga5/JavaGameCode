package ItemHandler;

import ItemHandler.Item;

public class Items {
  public static Item BLASTER = new Item("Blaster", "Trusty space shooter", false, true, DamageType.RANGED);
  public static Item WRENCH = new Item("Wrench", "Sturdy pipe wrench", false, true, DamageType.MELEE);
  public static Item SIDEARM = new Item("Sidearm", "Old, but still works like a charm", false, true, DamageType.RANGED);
  public static Item GRENADE = new Item("Grenade", "Standard plasma grenade", true, true, DamageType.EXPLOSIVE);
  public static Item MEDKIT = new Item("First Aid Kit", "Box of bandages and ointment", true, false, null);
}