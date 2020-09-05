public class Item {

  String key;
  String details;
  boolean isConsumable;

  public Item(String inKey, String inDetails, boolean inConsumable) {
      key = inKey;
      details = inDetails;
      isConsumable = inConsumable;
  }

  public void displayDetails() {
    System.out.println("Description: " + this.details);
    System.out.println();
    System.out.println("Consumable: " + this.isConsumable)
  }
}