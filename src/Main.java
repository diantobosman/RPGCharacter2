import Character.*;
import Item.*;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Mage mage = new Mage("Mage", 1, 7);

        mage.levelUp();
        System.out.println("The new level of the mage is: " + mage.getLevel());

        int[] mageInitial = new int[]{1,1,8};
        mage.initialize(mageInitial);

        System.out.println(mage.getAttributes()[0]);


    }
}