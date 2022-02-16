package Character;

import Item.Armor;
import Item.Weapons;

public class Ranger extends Character{

    public Ranger() {
        super.name = "Ranger";
        int[] rangerInitial = new int[]{1,7,1};
        initialize(rangerInitial);
        super.totalPrimaryAttributes = 9;
        EquipWeapon();
        EquipArmor();

    }

    // Methods
    public boolean EquipWeapon() {
        if (Weapons.getwType() == Weapons.WeaponType.Bows){
            equipment.put(Slot.WEAPON, Weapons.getwType());
            return true;
        }
        else{
            System.out.println("InvalidWeaponException");
        }
        return false;
    }

    public boolean EquipArmor() {
        if (Armor.getArmorType() == Armor.ArmorType.Leather || Armor.getArmorType() == Armor.ArmorType.Mail) {
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
        super.primaryAttribute[1] = super.primaryAttribute[1] + 5;
        super.primaryAttribute[2] = super.primaryAttribute[2] + 1;
        super.totalPrimaryAttributes = super.totalPrimaryAttributes + 7;
    }
}
