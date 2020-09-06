import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    Random rand = new Random();

    TitleScreen.runMenu();
    CharacterBuilder character = new CharacterBuilder();
    character.build();

    character.inventory.get(0).displayDetails();
    System.out.println("Character Name: " + character.name);
  }
}