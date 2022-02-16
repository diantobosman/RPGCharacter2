import Character.*;
import Item.Armor;
import Item.Weapons;
import Item.Weapons.*;
import java.util.Scanner;


public class ItemEquipmentTest {
    public static void main(String[] args) {
        System.out.println("Welcome to the first test. Click Y to do the first test: ");
        Continue();
        test1();

        System.out.println("Welcome to the second test. Click Y to do the first test: ");
        Continue();
        test2();

        System.out.println("Welcome to the third test. Click Y to do the first test: ");
        Continue();
        test3();

        System.out.println("Welcome to the fourth test. Click Y to do the first test: ");
        Continue();
        test4();

        System.out.println("Welcome to the fifth and second test. Click Y to do the first test: ");
        Continue();
        test56();

        System.out.println("Welcome to the test. Click Y to do the first test: ");
        Continue();
        test7();

        System.out.println("Welcome to the test. Click Y to do the first test: ");
        Continue();
        test8();

        System.out.println("Welcome to the test. Click Y to do the first test: ");
        Continue();
        test9();
    }


    public static void test1() {
        Weapons testWeapon = new Weapons("Common Axe", 3, 2, WeaponType.Axes, 1, 7);
        Warrior warrior = new Warrior();
    }

    public static void test2() {
        Armor testPlateBody = new Armor("Rare Plate Body Armor", 3, 2, Armor.ArmorType.Plate);
        Warrior warrior = new Warrior();
    }

    public static void test3() {
        Weapons testWeapon = new Weapons("Common Bow", 1, 2, WeaponType.Bows, 1, 7);
        Warrior warrior = new Warrior();

    }

    public static void test4() {
        Armor testPlateBody = new Armor("Common Cloth Armor", 1, 2, Armor.ArmorType.Cloth);
        Warrior warrior = new Warrior();
    }

    public static void test56() {
        Armor testPlateBody = new Armor("Common Cloth Armor", 3, 4, Armor.ArmorType.Plate);
        Weapons testWeapon = new Weapons("Common Axe", 1, 1, WeaponType.Axes, 1, 7);
        Warrior warrior = new Warrior();
    }

    public static void test7() {
        Warrior warrior = new Warrior();
        double DPS = GiveTotalDamage(3, 6, warrior.getTotalPrimaryAttributes());
        System.out.println("The total DPS is: " + DPS);
    }

    public static void test8() {
        Weapons testWeapon = new Weapons("Common Axe", 1, 1, WeaponType.Axes,3, 6);
        Warrior warrior = new Warrior();
        double DPS = testWeapon.GiveTotalDamage(testWeapon.getSpeed(), testWeapon.getDamage(), warrior.getTotalPrimaryAttributes());
        System.out.println("The total DPS is: " + DPS);
    }

    public static void test9() {
        Weapons testWeapon = new Weapons("Common Axe", 1, 1, WeaponType.Axes,3, 6);
        Armor testPlateBody = new Armor("Common Cloth Armor", 3, 4, Armor.ArmorType.Plate);
        testPlateBody.setPrimaryAttributesArmor(new int[]{2,2,4});
        Warrior warrior = new Warrior();
        System.out.println("TEST" + (warrior.getTotalPrimaryAttributes() + testPlateBody.getTotalArmorAttributes()));
        double DPS = testWeapon.GiveTotalDamage(testWeapon.getSpeed(), testWeapon.getDamage(), (warrior.getTotalPrimaryAttributes() + testPlateBody.getTotalArmorAttributes()));
        System.out.println("The total DPS is: " + DPS);
    }



    // Methods
    public static void Continue() {
        while (true) {
            System.out.println("Would you like to continue? Please press Y.");
            Scanner input = new Scanner(System.in);
            String c = input.nextLine();
            if (c.equalsIgnoreCase("Y")) {
                break;
            }
        }
    }

    public static double GiveTotalDamage(double speed, double damage, double totalAttributes) {
        double DPS = GiveDamage(speed, damage);
        return (DPS * (1.0 + totalAttributes/100.0));
    }

    public static double GiveDamage(double speed, double damage) {
        return damage * speed;
    }


}
