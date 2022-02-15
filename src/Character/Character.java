package Character;


import PrimaryAttributes.PrimaryAttributes;
import java.util.HashMap;
import Item.Weapons;
import Item.Item;

public abstract class Character {
    protected String name;
    protected int level = 1;
    protected int totalPrimaryAttributes;
    protected int[] primaryAttribute;
    protected HashMap<bodySlot, Item> equipment;


    public Character() {

        ;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTotalPrimaryAttributes() {
        return totalPrimaryAttributes;
    }

    public void setTotalPrimaryAttributes(int totalPrimaryAttributes) {
        totalPrimaryAttributes = totalPrimaryAttributes;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }


    // Functions
    public void levelUp() {
        this.level = level + 1;
    }


    // initialize the Primaryattributes
    public void initialize(int[] initial) {
        PrimaryAttributes obj = new PrimaryAttributes(initial);
        this.primaryAttribute = PrimaryAttributes.getPrimaryAttribute();
    }

    public int[] getAttributes() {
        return primaryAttribute;
    }


    enum bodySlot {Head, Body, Legs, Weapon}


}
