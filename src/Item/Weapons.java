package Item;

public class Weapons extends Item {
    // Fields
    private WeaponType wType;
    private int speed;

    // Constructor
    public Weapons(String itemName, int requiredLevel, int slot, WeaponType wType, int speed) {
        super(itemName, requiredLevel, slot);
        this.wType = wType;
        this.speed = speed;
    }

    // Functions
    public int GiveDamage(int damage) {
        int DPS = damage * this.speed;
        return DPS;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    //Setters and Getters
    public int getSpeed() {
        return speed;
    }

    // Enumerator to create the different weapontypes
    public enum WeaponType {Axes, Bows, Daggers, Hammers, Staffs, Swords, Wands}
}

