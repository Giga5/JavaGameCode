import java.util.*;

class Main {

  public static boolean isGameOver = false;

  public static void main(String[] args) throws InterruptedException {
    Scanner scan = new Scanner(System.in);
    Random rand = new Random();
    TitleScreen.runMenu();
    Character character = new Character();
    character.build();

    Fight fight = new Fight();
    fight.setup();
    while (true) {
      fight.playerTakeTurn(character);
      
    }
  }

  public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
  }
}