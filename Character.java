  import java.util.*;
  import java.lang.*;
  import ItemHandler.*;
  
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
    
    public static void build() {
        String option;
        do {
            option = TitleScreen.getName();
        } while(option.equals(""));

      String selection = TitleScreen.runTitle();
      if (selection.toLowerCase().equals("mechanic")) {
        buildingHandler.buildMechanic(option);
      } else if(selection.toLowerCase().equals("marine")) {
        buildingHandler.buildMarine(option);
        }
      else if(selection.toLowerCase().equals("spacepirate")) {
        buildingHandler.buildSpacepirate(option);
        }
      else {
        build();
      }
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
      inventory.add(Items.BLASTER);
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
     inventory.add(Items.WRENCH);
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
     inventory.add(Items.SIDEARM);
    }
  }
}
