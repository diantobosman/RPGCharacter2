package Item;

public class Weapons extends Item{
    enum WeaponType{Axes, Bows, Daggers, Hammers, Staffs, Swords, Wands}

    public Weapons(String ItemName, int RequiredLevel, int slot) {
        super(ItemName, RequiredLevel, slot);
    }

}