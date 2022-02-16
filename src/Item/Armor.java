package Item;

import PrimaryAttributes.PrimaryAttributes;

public class Armor extends Item{
    // Fields
    public int[] primaryAttributesArmor;
    private static ArmorType armorType;
    public int totalArmorAttributes;


    // Constructor
    public Armor(String itemName, int requiredLevel, int level, ArmorType armorType) {
        super(itemName, requiredLevel, level);
        Armor.armorType = armorType;
        int[] armorInitial = new int[]{0,0,0};
        initialize(armorInitial);
        putArmorOn();
        checkArmorSlot();
    }



    // Methods
    public void putArmorOn() {
        // Assumed that the armor increases the attributes with 5.
        this.totalArmorAttributes = 5;
    }

    // initialize the PrimaryattributesArmor
    public void initialize(int[] initial) {
        PrimaryAttributes obj = new PrimaryAttributes(initial);
        this.primaryAttributesArmor = getPrimaryAttributesArmor();
    }

    // Check if the name is available and also check if the level of the character is high enough
    public void checkArmorSlot() {
        if (armorType == ArmorType.Cloth && this.requiredLevel >= super.level) {
            InvalidArmorException();
        }

        else if (armorType == ArmorType.Leather && this.requiredLevel >= super.level) {
            InvalidArmorException();
        }

        else if (armorType == ArmorType.Mail && this.requiredLevel >= super.level) {
            InvalidArmorException();
        }

        else if (armorType == ArmorType.Plate && this.requiredLevel >= super.level) {
            InvalidArmorException();
        }

        else {
            System.out.println("The weapon that you picked is allowed");
        }
    }

    public void InvalidArmorException(){
        System.out.println("InvalidArmorException");
    }


    //Create enum class with the types of armo
    public enum ArmorType{Cloth, Leather, Mail, Plate}

    // Getters and Setters
    public int[] getPrimaryAttributesArmor() {
        return primaryAttributesArmor;
    }

    public void setPrimaryAttributesArmor(int[] primaryAttributesArmor) {
        this.primaryAttributesArmor = primaryAttributesArmor;
    }

    public int getTotalArmorAttributes() {
        return totalArmorAttributes;
    }

    public void setTotalArmorAttributes(int totalArmorAttributes) {
        this.totalArmorAttributes = totalArmorAttributes;
    }

    public static ArmorType getArmorType() {
        return armorType;
    }

    public void setArmorType(ArmorType armorType) {
        Armor.armorType = armorType;
    }
}
