import Character.*;
import Item.Armor;
import Item.Weapons;
import Item.Weapons.*;

public class ItemEquipmentTest {
    public static void main(String[] args) {
        TestWeapon();
    }




    public static void TestWeapon() {
        // Code automatically checks if the weapon is allowed.
        Weapons testWeapon = new Weapons("Common Axe", 1, 1, WeaponType.Axes,1, 7);
    }

    public static void TestArmor() {
        Armor testPlateBody = new Armor("Common Plate Body Armor", 1, 1, Armor.ArmorType.Plate);
        testPlateBody.setPrimaryAttributesArmor(new int[]{1,0,0});
    }

    public static void WrongTestWeapon() {
        // Code automatically checks if the weapon is allowed.
        Weapons wrongTestWeapon = new Weapons("Common bow", 3, 1, WeaponType.Bows,2, 12);
    }

    public static void WrongTestArmor() {
        Armor wrongTestArmor = new Armor("Common Cloth Head Armor", 3, 1, Armor.ArmorType.Plate);
        wrongTestArmor.setPrimaryAttributesArmor(new int[]{0,0,5});
    }





}
