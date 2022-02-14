import Character.*;
import Item.*;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Mage mage = new Mage("Mage", 1, 7);
        Rogue rogue = new Rogue("Rogue", 1, 9);



        System.out.println("The new level of the mage is: " + mage.getLevel());

        int[] mageInitial = new int[]{1,1,8};
        int[] rogueInitial = new int[]{2,2,9};

        mage.initialize(mageInitial);
        rogue.initialize(rogueInitial);

        System.out.println(mage.getAttributes()[0]);
        System.out.println(rogue.getAttributes()[0]);

    }
}