import ItemHandler.Items.Wrench;

import java.util.*;

public class Fight {
  Random random = new Random();
  Scanner scan = new Scanner(System.in);
  public boolean isFightOver = false;
  Enemy enemy = new Enemy();


//sets up fight with new enemy object
  public void setup() {
    Main.clearScreen();
    System.out.println("A " + enemy.classType + " Approaches You!\n");
    String description = "The " + enemy.classType + " seems: \n";
    if(enemy.maxhp >= 4 && enemy.maxhp <= 9) {
     description += "\tBuff\n";
    }
    
    if(enemy.maxhp <= 3) {
      description += "\tWeak\n";
    }

    if(enemy.maxhp >= 10) {
      description += "\tExtremely Buff\n";
    }
    
    if(enemy.damage <= 5 && enemy.damage >= 3) {
     description += "\tCarrying A Few Weapons\n";
    }
    
    if(enemy.damage <= 2) {
      description += "\tCarrying Little To No Weapons\n";
    }

    if(enemy.damage >= 6) {
      description += "\tPacking Large Weaponry\n";
    }
    System.out.println(description + "\n\n");
  }

//called for a player to take a turn
public void playerTakeTurn(Character character) throws InterruptedException {
  System.out.println("Enter \'act\' to act, enter \'check\' to check your status");
  String enter = scan.nextLine();
  if (enter.equals("act")) {
    Main.clearScreen();
    act(character);
  } else if (enter.equals("check")) {
    Main.clearScreen();
    check(character);
    System.out.println();
    playerTakeTurn(character);
  } else {
    Main.clearScreen();
    System.out.println("Please enter a valid option");
    playerTakeTurn(character);
  }
}

//one of the choices for a turn, outputs detais
  public void check(Character character) throws InterruptedException {
    System.out.println("Your health is " + character.hp);
    System.out.println("\nYour Items are: \n");
    character.inventory.forEach((indx) -> {System.out.println(indx.key);});
  }
  //one of the choices for a turn, allows attacking
  public void act(Character character) {
      char choice = promptAct();
      if (choice == 'A' || choice == 'a') {
        try {
          use(character, enemy);
        }
        catch(InterruptedException e) {
          act(character);
        }
        
      } else if (choice == 'D' || choice == 'd') {
        System.out.println("disengage");
      } else {
        System.out.println("\nNot a valid choice!\n\n");
        act(character);
      }
  }
  

  
  //helper method for act
  public static char promptAct() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("What would you like to do?\nType A for\tAction\nType D for\tDisengage");
    char input = scanner.next().charAt(0);
    return input;
    }
  
  public static void use(Character character, Enemy enemy) throws InterruptedException {
    Scanner scanner = new Scanner(System.in);
    Main.clearScreen();
    System.out.println("Select an item number to use");
    System.out.println("\nYour Items are: ");
    for(int index = 0; index < character.inventory.size(); index++) {
      System.out.print(index + " ");
      System.out.print(character.inventory.get(index).key);
      System.out.print("\n");
    }
    int select = scanner.nextInt();
    if(select < character.inventory.size() && select > -1) {
       String set = character.inventory.get(select).useItem();

        if(character.inventory.get(select).isConsumable) {
          character.inventory.remove(select);
        }

       if(set.charAt(0) == 'D') {
         Main.clearScreen();
         if (set.charAt(1) == '0') {
           System.out.println("Your " + character.inventory.get(select).key + " attack missed!");
           Thread.sleep(2000);
           Main.clearScreen();
         } else {
           System.out.println("The " + enemy.classType + " has been hit for " + set.charAt(1) + " damage!");
           enemy.hp = enemy.hp - set.charAt(1);
           Thread.sleep(2000);
           Main.clearScreen();
         }
       }
       else if(set.charAt(0) == 'H') {
        heal(character, set);


    } else {
      System.out.println("Not valid item!");
      use(character, enemy);
    }

  }
}

public static void heal(Character character, String set)  {
    Scanner scan = new Scanner(System.in);
    int num = Integer.parseInt(String.valueOf(set.charAt(1)));
    int maxhp_set = character.maxhp - num;
    if(character.hp > maxhp_set) {
      do {
        Main.clearScreen();
        System.out.println("Are you sure you want to use a healing item at this high health? It will be " + ((character.hp + num) - character.maxhp) + "hp less effective\t y/n?");
        char y_n = scan.next().charAt(0);
        if(y_n == 'y') {
          character.hp = character.maxhp;
          Main.clearScreen();
          System.out.println("You are now at max health!\t" + character.hp + "hp");
          break;
          }
        else if(y_n == 'n') {
          Main.clearScreen();
          break;
        } 
    } while(true);
    } else {
      Main.clearScreen();
      character.hp += num;
      System.out.println("You Healed for " + set.charAt(1) + " hp.\t Your total health is now " + character.hp);
    }
}

  public class Enemy {
    public int damage = random.nextInt(5)+2;
    public int maxhp = random.nextInt(10)+2;
    public int hp = maxhp;
    public String classType = "Guard";
  }
}
