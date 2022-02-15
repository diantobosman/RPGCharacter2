package Item;

public class Weapons extends Item {
    // Fields
    private final WeaponType wType;
    private int speed;
    private int damage;

    // Constructor
    public Weapons(String itemName, int requiredLevel, int level, WeaponType wType, int speed) {
        super(itemName, requiredLevel, level);
        this.wType = wType;
        this.speed = speed;

        checkWeaponSlot();
    }

    // Methods //
    // Calculate the total damage
    public int GiveTotalDamage(int speed, int damage, int totalAttributes) {
        this.speed = speed;
        this.damage = damage;
        int DPS = GiveDamage(this.speed, this.damage);
        return DPS * (1 + totalAttributes/100);
    }

    public int GiveDamage(int speed, int damage) {
        return this.damage * this.speed;
    }

    // Check if the name is available and also check if the level of the character is high enough
    public void checkWeaponSlot() {
        if (this.wType == WeaponType.Axes || this.wType == WeaponType.Bows || this.wType == WeaponType.Daggers || this.wType != WeaponType.Hammers) {
            if (this.wType == WeaponType.Axes && this.requiredLevel > super.level) {
                InvalidWeaponException();
            }

            else if (this.wType == WeaponType.Bows && this.requiredLevel > super.level) {
                InvalidWeaponException();
            }

            else if (this.wType == WeaponType.Daggers && this.requiredLevel > super.level) {
                InvalidWeaponException();
            }

            else {
                System.out.println("The weapon that you picked is allowed");
            }
        }
    }

    public void InvalidWeaponException(){
        System.out.println("InvalidWeaponException");
    }


    // Enumerator to create the different weapontypes
    public enum WeaponType {Axes, Bows, Daggers, Hammers, Staffs, Swords, Wands}
}