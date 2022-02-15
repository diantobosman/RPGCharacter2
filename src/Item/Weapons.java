package Item;


public class Weapons extends Item {
    public Weapons(String itemName, int requiredLevel, int slot) {
        super(itemName, requiredLevel, slot);
    }

    public enum weaponType {Axes, Bows, Daggers, Hammers, Staffs, Swords, Wands}

}

