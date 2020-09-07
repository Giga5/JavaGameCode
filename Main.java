import java.util.*;

class Main {

  public static boolean isGameOver = false;

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    Random rand = new Random();

    TitleScreen.runMenu();
    Character character = new Character();
    character.build();

    character.inventory.get(0).displayDetails();
    System.out.println("Character Name: " + character.name);
    Fight fight = new Fight();
    fight.setup();
    while (true) {
      fight.playerTakeTurn(character);
      
    }
  }
}