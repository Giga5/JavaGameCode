package ItemHandler;

import java.util.Random;

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

  public String useItem() {
      Random r = new Random();
      if(this.type != null) {
          return "D" + r.nextInt(3);
      } else {
        return "H" + r.nextInt(5);
      }
  }
}