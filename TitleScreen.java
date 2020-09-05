import java.util.*;
public class TitleScreen {
  public static String runTitle() {
    System.out.println("Enter the name of the character\nyou'd like to play as.\n\nEnter \"list\" for a list of characters.");
    Scanner scan = new Scanner(System.in);
    String choice = scan.nextLine();
    choice = choice.toLowerCase();
      while (choice.equals("list")) {
        printList();
        choice = scan.nextLine();
      }
    return choice;
  }

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


   public static void printList() {
      System.out.println("\nMarine\nSpacepirate\nMechanic\n");
    }
}