import Character.*;
import Item.Weapons;
import Item.Weapons.*;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Mage mage = new Mage();

        System.out.println("The new level of the mage is: " + mage.getLevel());
        System.out.println("The Name is : " + mage.getName());
        System.out.println(mage.getAttributes()[0]);

        Weapons axes = new Weapons("Axe", 1, 2, WeaponType.Axes,1);




    }
}

