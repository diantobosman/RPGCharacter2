package Item;

public class Weapons extends Item {
    private WeaponType wType;
    private int speed;


    public Weapons(String itemName, int requiredLevel, int slot, WeaponType wType, int speed) {
        super(itemName, requiredLevel, slot);
        this.wType = wType;
        this.speed = speed;
    }

    // Function to give damage
    public int GiveDamage(int damage) {
        int DPS = damage * this.speed;
        return DPS;
    }

    //Setters and Getters
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public enum WeaponType {Axes, Bows, Daggers, Hammers, Staffs, Swords, Wands}
}

