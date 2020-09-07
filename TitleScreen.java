import java.util.*;
public class TitleScreen {

  // Choose a character class
  public static String runTitle() {
    System.out.println("Enter the class of the character\nyou'd like to play as.\n\nEnter \"list\" for a list of characters.");
    Scanner scan = new Scanner(System.in);
    String choice = scan.nextLine();
    choice = choice.toLowerCase();
      while (choice.equals("list")) {
        printList();
        choice = scan.nextLine();
      }
    return choice;
  }

  // Main Menu Method
  public static void runMenu() {
    System.out.println("\nWelcome to Space Game!\n\n");
    System.out.println("Main Menu\n New \n Load \n Exit");
    Scanner scan = new Scanner(System.in);
    String choice = scan.nextLine();
    choice = choice.toLowerCase();
    if(choice.equals("new")) {
      ;
    }
    else if(choice.equals("load")) {
      System.out.println("Not implemented yet.");
      System.out.flush();
      runMenu();
    }
    else if(choice.equals("exit")) {
     System.exit(1);
    } else {
      runMenu();
    }
  }

  // Asks the user for their character name
  public static String getName() {
    System.out.println("\nWhat would you like the name of your character to be?");
    Scanner scan = new Scanner(System.in);
    String choice = scan.nextLine();

    if (choice.length() > 10) {
      System.out.println("\nYour Name Must Be Under 10 Characters!");
      choice = "";
    } else if (choice.equals("")) {
      System.out.println("\nYour Name Must Be greater than 0 Characters!");
      choice = "";

    } else {
      choice = choice.toLowerCase();
      choice = choice.substring(0, 1).toUpperCase() + choice.substring(1);
    }
    return choice;
  }
   public static void printList() {
      System.out.println("\nMarine\nSpacepirate\nMechanic\n");
    }
}