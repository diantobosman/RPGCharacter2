package Character;

import Item.Armor;
import Item.Weapons;

public class Mage extends Character {

    public Mage() {
        super.name = "Mage";
        int[] mageInitial = new int[]{1, 1, 8};
        initialize(mageInitial);
        super.totalPrimaryAttributes = 10;
        EquipWeapon();
        EquipArmor();

    }

    // Methods
    public boolean EquipWeapon() {
        if (Weapons.getwType() == Weapons.WeaponType.Wands || Weapons.getwType() == Weapons.WeaponType.Staffs){
            equipment.put(Slot.WEAPON, Weapons.getwType());
            return true;
        }
        else{
            System.out.println("InvalidWeaponException");
        }
        return false;
    }

    public boolean EquipArmor() {
        if (Armor.getArmorType() == Armor.ArmorType.Cloth) {
            equipment.put(Slot.BODY, Armor.getArmorType());
            return true;
        }
        else{
            System.out.println("InvalidArmorException");
        }
        return false;
    }

    @Override
    public void levelUp() {
        super.levelUp();
        super.primaryAttribute[0] = super.primaryAttribute[0] + 1;
        super.primaryAttribute[1] = super.primaryAttribute[1] + 7;
        super.primaryAttribute[2] = super.primaryAttribute[2] + 1;
        super.totalPrimaryAttributes = super.totalPrimaryAttributes + 9;
    }
}