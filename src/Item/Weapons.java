package Item;

public class Weapons extends Item {
    // Fields
    public static WeaponType wType;
    private double speed;
    private double damage;

    // Constructor
    public Weapons(String itemName, int requiredLevel, int level, WeaponType wType, double speed, double damage) {
        super(itemName, requiredLevel, level);
        Weapons.wType = wType;
        this.speed = speed;
        this.damage = damage;
        setWeaponSlot();
    }

    // Methods //
    // Calculate the total damage
    public double GiveTotalDamage(double speed, double damage, double totalAttributes) {
        this.speed = speed;
        this.damage = damage;
        double DPS = GiveDamage(this.speed, this.damage);
        System.out.println("TESTY" + totalAttributes);
        return (DPS * (1 + totalAttributes/100));
    }

    public double GiveDamage(double speed, double damage) {
        return this.damage * this.speed;
    }

    // Check if the name is available and also check if the level of the character is high enough
    public void setWeaponSlot() {
        if (wType == WeaponType.Axes && this.requiredLevel > super.level) {
            InvalidWeaponException();
        } else if (wType == WeaponType.Bows && this.requiredLevel > super.level) {
            InvalidWeaponException();
        } else if (wType == WeaponType.Daggers && this.requiredLevel > super.level) {
            InvalidWeaponException();
        }
        else {
            System.out.println("The Weapon that you picked is allowed");
        }
    }

    public void InvalidWeaponException(){
        System.out.println("InvalidWeaponException");
    }


    // Enumerator to create the different weapontypes
    public enum WeaponType {Axes, Bows, Daggers, Hammers, Staffs, Swords, Wands}

    // Getters and Setters
    public double getSpeed() {
        return this.speed;
    }

    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    public static WeaponType getwType() {
        return wType;
    }
}