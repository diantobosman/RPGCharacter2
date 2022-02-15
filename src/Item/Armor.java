package Item;

public class Armor extends Item{
    // Fields
    private String primaryAttributes;
    private ArmorType armorType;

    // Constructor
    public Armor(String itemName, int requiredLevel, int level, ArmorType armorType) {
        super(itemName, requiredLevel, level);
        this.armorType = armorType;

        checkArmorSlot();
    }


    public void checkArmorSlot() {
        if (this.armorType == ArmorType.Cloth || this.armorType == ArmorType.Leather || this.armorType == ArmorType.Mail || this.armorType != ArmorType.Plate) {
            if (this.armorType == ArmorType.Cloth && this.requiredLevel > super.level) {
                InvalidArmorException();
            }

            else if (this.armorType == ArmorType.Leather && this.requiredLevel > super.level) {
                InvalidArmorException();
            }

            else if (this.armorType == ArmorType.Mail && this.requiredLevel > super.level) {
                InvalidArmorException();
            }

            else if (this.armorType == ArmorType.Plate && this.requiredLevel > super.level) {
                InvalidArmorException();
            }
            else {
                System.out.println("The weapon that you picked is allowed");
            }
        }
    }

    public void InvalidArmorException(){
        System.out.println("InvalidWeaponException");
    }





    //Create enum class with the types of armo
    public enum ArmorType{Cloth, Leather, Mail, Plate}

    // Getters and Setters
    public String getPrimaryAttributes() {
        return primaryAttributes;
    }

    public void setPrimaryAttributes(String attributes) {
        this.primaryAttributes = attributes;
    }


    public ArmorType getArmorType() {
        return armorType;
    }

    public void setArmorType(ArmorType armorType) {
        this.armorType = armorType;
    }
}
