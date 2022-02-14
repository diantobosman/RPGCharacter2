import Character.*;
import Item.*;

public class Main {
    public static void main(String[] args) {
        Mage mage = new Mage("Mage", 1, 7);
        Warrior warrior = new Warrior("Warrior", 1, 8);


        int[] MageInitial = new int[]{1,1,8};
        int[] RogueInitial = new int[]{2,6,1};
        int[] WarriorInitial = new int[]{5,2,1};
        int[] RangeInitial = new int[]{1,7,1};

        mage.setPrimaryAttributes(MageInitial);
        warrior.setPrimaryAttributes(WarriorInitial);

        mage.levelUp();
        System.out.println("The new level of the mage is: " + mage.getLevel());
        System.out.println("The strength of the mage is now: " + mage.getPrimaryAttributes()[0]);
        System.out.println("The strength of the warrior is now: " + warrior.getPrimaryAttributes()[0]);

        Item itemnew = new Item("axe",1,1);



    }
}