import java.util.*;

public class Fight {
  Random random = new Random();
  Scanner scan = new Scanner(System.in);
  public boolean isFightOver = false;
  Enemy enemy = new Enemy();


//sets up fight with new enemy object
  public void setup() {
    System.out.println("\nA " + enemy.classType + " Approaches You!\n");
    String description = "The " + enemy.classType + " seems: \n";
    if(enemy.maxhp >= 5 && enemy.maxhp <= 9) {
     description += "\tBuff\n";
    }
    
    if(enemy.maxhp <= 3) {
      description += "\tWeak\n";
    }

    if(enemy.maxhp >= 10) {
      description += "\tExtremely Buff\n";
    }
    
    if(enemy.damage <= 5 && enemy.damage >= 3) {
     description += "\tCarrying What Seems Like A Few Weapons\n";
    }
    
    if(enemy.damage <= 2) {
      description += "\tDoesn't Appear To Be Very Armed\n";
    }

    if(enemy.damage >= 6) {
      description += "\tPacking Large Weaponry\n";
    }

    System.out.println(description + "\n\n");
  }

//called for a player to take a turn
public void playerTakeTurn(Character character) {
  System.out.println("Enter \'act\' to act, enter \'check\' to check your status");
  String enter = scan.nextLine();
  if (enter.equals("act")) {
    act(character);
  } else if (enter.equals("check")) {
    check(character);
    System.out.println();
    playerTakeTurn(character);
  } else {
    System.out.println("Please enter a valid option");
    playerTakeTurn(character);
  }
}

//one of the choices for a turn, outputs detais
  public void check(Character character) {
    System.out.println("Your health is " + character.hp);
    System.out.println("\nYour Items are: \n");
    character.inventory.forEach((indx) -> {System.out.println(indx.key);});
  }
  //one of the choices for a turn, allows attacking
  public void act(Character character) {
      char choice = promptAct();
      if (choice == 'A') {
        use(character, enemy);
      } else if (choice == 'D') {
        System.out.println("disengage");
      } else {
        System.out.println("Not a valid choice!");
        act(character);
      }
  }
  

  
  //helper method for act
  public static char promptAct() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("What would you like to do?\nType A for \tAction\nType D for \tDisengage");
    char input = scanner.next().charAt(0);
    return input;
    }
  
  public static void use(Character character, Enemy enemy) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Select an item number to use");
    System.out.println("\nYour Items are: ");
    for(int index = 0; index < character.inventory.size(); index++) {
      System.out.print(index + " ");
      System.out.print(character.inventory.get(index).key);
      System.out.print("\n");
    }
    /*
    String select = scanner.nextLine();

    } else {
      use(character, enemy)
    }
*/
  }

  public class Enemy {
    public int damage = random.nextInt(5)+2;
    public int maxhp = random.nextInt(10)+2;
    public int hp = maxhp;
    public String classType = "Guard";
  }
}
