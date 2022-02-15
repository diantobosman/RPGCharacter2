package Item;

public class Weapons extends Item {
    // Fields
    private WeaponType wType;
    private int speed;
    private int damage;

    // Constructor
    public Weapons(String itemName, int requiredLevel, int level, WeaponType wType, int speed) {
        super(itemName, requiredLevel, level);
        this.wType = wType;
        this.speed = speed;

        checkWeaponSlot();
    }

    // Functions
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int GiveDamage(int speed, int damage) {
        int DPS = this.damage * this.speed;
        return DPS;
    }

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

            else if (this.wType == WeaponType.Hammers && this.requiredLevel > super.level) {
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

    //Setters and Getters
    public int getSpeed() {
        return this.speed;
    }


    // Enumerator to create the different weapontypes
    public enum WeaponType {Axes, Bows, Daggers, Hammers, Staffs, Swords, Wands}
}