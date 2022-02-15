import Character.*;
import Item.Armor;
import Item.Weapons;
import Item.Weapons.*;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Mage mage = new Mage();

        System.out.println("The new level of the mage is: " + mage.getLevel());
        System.out.println("The Name is : " + mage.getName());
        System.out.println(mage.getAttributes()[0]);

        Weapons axes = new Weapons("Axe", 2, mage.getLevel(), WeaponType.Axes, 1);
        Armor Item = new Armor("Tank", 2, mage.getLevel(), Armor.ArmorType.Leather);


        int totalAttr = Item.getTotalArmorAttributes() + mage.getTotalPrimaryAttributes();
        int test = axes.GiveTotalDamage(3, 1, totalAttr);
        System.out.println("TEST: " + totalAttr);
        System.out.println("TEST: " + test);

    }
}






