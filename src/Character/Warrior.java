package Character;

import Item.Armor;
import Item.Weapons;

public class Warrior extends Character{

    public Warrior() {
        super.name = "Warrior";
        int[] warriorInitial = new int[]{5,2,1};
        initialize(warriorInitial);
        super.totalPrimaryAttributes = 8;
        EquipWeapon();
        EquipArmor();

    }

    // Methods
    public boolean EquipWeapon() {
        if (Weapons.getwType() == Weapons.WeaponType.Axes || Weapons.getwType() == Weapons.WeaponType.Hammers || Weapons.getwType() == Weapons.WeaponType.Swords){
            equipment.put(Slot.WEAPON, Weapons.getwType());
            return true;
        }
        else{
            System.out.println("InvalidWeaponException");
        }
        return false;
    }

    public boolean EquipArmor() {
        if (Armor.getArmorType() == Armor.ArmorType.Mail || Armor.getArmorType() == Armor.ArmorType.Plate) {
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
        super.primaryAttribute[0] = super.primaryAttribute[0] + 3;
        super.primaryAttribute[1] = super.primaryAttribute[1] + 2;
        super.primaryAttribute[2] = super.primaryAttribute[2] + 1;
        super.totalPrimaryAttributes = super.totalPrimaryAttributes + 6;
    }
}