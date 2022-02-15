package Character;
import PrimaryAttributes.PrimaryAttributes;
import java.util.HashMap;
import Item.Weapons;
import Item.Item;
import Item.Armor;

import java.util.List;
import java.util.Arrays;



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

    public List<Object> CharacterStatsDisplay() {
        String name = this.name;
        int characterLevel = this.level;
        int strength = this.primaryAttribute[0];
        int dexterity = this.primaryAttribute[1];
        int intelligence = this.primaryAttribute[2];

        return Arrays.asList(name, characterLevel, strength, dexterity, intelligence);
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
