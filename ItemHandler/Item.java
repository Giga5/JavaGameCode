package ItemHandler;

public class Item {

  public String key;
  public String details;
  public boolean isConsumable;
  public DamageType type;
  public int mapKey;

  public Item(String inKey, String inDetails, boolean inConsumable, DamageType damageType) {
      key = inKey;
      details = inDetails;
      isConsumable = inConsumable;
      type = damageType;
  }

  public void displayDetails() {
      System.out.println("Name: " + this.key);
    System.out.println("Description: " + this.details);
    System.out.println("Consumable: " + this.isConsumable);
  }
  public DamageType getType() {
      return this.type;
  }
  public String getKey() {
      return this.key;
  }

  public int useItem() {
      if(this.type != null) {
          return 2;
      } else {
          return -1;
      }
  }
}