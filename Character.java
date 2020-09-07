  import java.util.*;
  import java.lang.*;
  import ItemHandler.*;
  import ItemHandler.Items.*;

  public class Character {

    public static int hp;
    public static int maxhp;
    public static int xp;
    public static int energy;
    public static int maxenergy;
    public static int level;
    public static char key;
    public static String description;
    public static String name;
    public static List<Item> inventory = new ArrayList<Item>();
    
    public static void build() throws InterruptedException  {
      String option;
      String selection;
      do {
            Main.clearScreen();
            option = TitleScreen.getName();
        } while(option.equals(""));
      do {
      option = option.substring(0, 1).toUpperCase() + option.substring(1);
      selection = TitleScreen.runTitle();
      if (selection.toLowerCase().equals("mechanic")) {
        buildingHandler.buildMechanic(option);
        break;
      } else if(selection.toLowerCase().equals("marine")) {
        buildingHandler.buildMarine(option);
        break;
        }
      else if(selection.toLowerCase().equals("spacepirate")) {
        buildingHandler.buildSpacepirate(option);
        break;
        } else {
          System.out.println("Not a valid class!");
          Thread.sleep(2000);
        }
      } while(true);
      Main.clearScreen();
      System.out.println("Welcome, " + selection.substring(0, 1).toUpperCase() + selection.substring(1) + " " + option);
      Thread.sleep(4000);
      
  }
  
  protected static class buildingHandler {
    public static void buildSpacepirate(String option) {
      name = option;
      maxhp = 25;
      hp = maxhp;
      xp = 0;
      level = 1;
      key = 'P';
      maxenergy = 20;
      energy = maxenergy;
      description = "A hardened space criminal that always has their trusty blaster.";
      inventory.add(new Blaster());
    }
    
    public static void buildMechanic(String option) {
     name = option;
     maxhp = 20;
     hp = maxhp;
     xp = 0;
     level = 1;
     key = 'M';
     maxenergy = 10;
     energy = maxenergy;
     description = "Worked at an intergalactic ship yard for the majority of their life.";
     inventory.add(new Wrench());
    }

    public static void buildMarine(String option) {
     name = option;
     maxhp = 35;
     hp = maxhp;
     xp = 0;
     level = 1;
     key = 'S';
     maxenergy = 10;
     energy = maxenergy;
     description = "A rugged individual that served in the Elite Space Force, E.S.P. , and had recently left for a simpler life.";
     inventory.add(new Sidearm());
    }
  }
}
