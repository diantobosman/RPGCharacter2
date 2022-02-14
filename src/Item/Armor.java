package Item;

public class Armor extends Item{
    enum ArmorType{Cloth, Leather, Mail, Plate}

    public Armor(String ItemName, int RequiredLevel, int slot) {
        super(ItemName, RequiredLevel, slot);
    }
}
