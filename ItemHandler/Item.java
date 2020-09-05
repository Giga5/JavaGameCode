package ItemHandler;

public class Item {

  String key;
  String details;
  boolean isConsumable;

  public Item(String inKey, String inDetails, boolean inConsumable, boolean doesDamage, DamageType damageType) {
      key = inKey;
      details = inDetails;
      isConsumable = inConsumable;
  }

  public void displayDetails() {
      System.out.println("Name: " + this.key);
    System.out.println("Description: " + this.details);
    System.out.println("Consumable: " + this.isConsumable);
  }
}