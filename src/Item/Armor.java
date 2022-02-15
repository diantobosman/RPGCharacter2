package Item;

public class Armor extends Item{
    // Fields
    private String primaryAttributes;
    private armorType armorType;

    // Constructor
    public Armor(String itemName, int requiredLevel, int slot) {
        super(itemName, requiredLevel, slot);
    }

    //Create enum class with the types of armor
    public enum armorType{Cloth, Leather, Mail, Plate}


    // Getters and Setters
    public String getPrimaryAttributes() {
        return primaryAttributes;
    }

    public void setPrimaryAttributes(String attributes) {
        this.primaryAttributes = attributes;
    }

    public Armor.armorType getArmorType() {
        return armorType;
    }

    public void setArmorType(Armor.armorType armorType) {
        this.armorType = armorType;
    }
}
