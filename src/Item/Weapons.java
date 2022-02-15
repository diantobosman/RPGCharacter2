package Item;

public class Weapons extends Item {
    // Fields
    private WeaponType wType;
    private int speed;
    private int damage;

    // Constructor
    public Weapons(String itemName, int requiredLevel, int slot, WeaponType wType, int speed) {
        super(itemName, requiredLevel, slot);
        this.wType = wType;
        this.speed = speed;
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


    //Setters and Getters
    public int getSpeed() {
        return this.speed;
    }

    // Enumerator to create the different weapontypes
    public enum WeaponType {Axes, Bows, Daggers, Hammers, Staffs, Swords, Wands}
}