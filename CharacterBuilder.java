  import java.util.*;
  import java.lang.*;
  
  public class CharacterBuilder {

    public static int hp;
    public static int maxhp;
    public static int xp;
    public static int energy;
    public static int maxenergy;
    public static int level;
    public static char key;
    public static String description;
    public static List<Item> items;
    
    public static void build() {
      String selection = TitleScreen.runTitle();
      if (selection.toLowerCase().equals("mechanic")) {
        buildingHandler.buildMechanic();
      } else if(selection.toLowerCase().equals("marine")) {
        buildingHandler.buildMarine();
        }
      else if(selection.toLowerCase().equals("spacepirate")) {
        buildingHandler.buildSpacepirate();
        }
      else {
        build();
      }
  }
  
  protected static class buildingHandler {
    public static void buildSpacepirate() {
      maxhp = 25;
      hp = maxhp;
      xp = 0;
      level = 1;
      key = 'P';
      maxenergy = 20;
      energy = maxenergy;
      description = "A hardened space criminal that always has their trusty blaster.";
    }
    
    public static void buildMechanic() {
     maxhp = 20;
     hp = maxhp;
     xp = 0;
     level = 1;
     key = 'M';
     maxenergy = 10;
     energy = maxenergy;
     description = "Worked at an intergalactic ship yard for the majority of their life.";
    }

    public static void buildMarine() {
     maxhp = 35;
     hp = maxhp;
     xp = 0;
     level = 1;
     key = 'S';
     maxenergy = 10;
     energy = maxenergy;
     description = "A rugged individual that served in the Elite Space Force, E.S.P. , and had recently left for a simpler life.";
    }
  }
}
