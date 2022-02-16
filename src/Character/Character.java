package Character;
import PrimaryAttributes.PrimaryAttributes;
import java.util.HashMap;
import java.util.List;
import java.util.Arrays;


public abstract class Character {
    // Fields
    protected String name;
    protected int level;
    protected int totalPrimaryAttributes;
    protected int[] primaryAttribute;
    protected HashMap<Slot, Object> equipment;

    public Character() {
        this.level = 1;
        this.equipment = new HashMap<>();
    }


    // Methods //
    public void levelUp() {
        level = level + 1;
    }

    // initialize the Primaryattributes
    public void initialize(int[] initial) {
        PrimaryAttributes obj = new PrimaryAttributes(initial);
        this.primaryAttribute = PrimaryAttributes.getPrimaryAttribute();
    }

    public int[] getAttributes() {
        return primaryAttribute;
    }

    // Get list with properties
    public List<Object> CharacterStatsDisplay() {
        String name = this.name;
        int characterLevel = this.level;
        int strength = this.primaryAttribute[0];
        int dexterity = this.primaryAttribute[1];
        int intelligence = this.primaryAttribute[2];

        return Arrays.asList(name, characterLevel, strength, dexterity, intelligence);
    }

    // Created for the four slots
    enum bodySlot {Head, Body, Legs, Weapon}

    // Getters and Setters
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
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
        this.totalPrimaryAttributes = totalPrimaryAttributes;
    }

    public HashMap<Slot, Object> getEquipment() {
        return equipment;
    }

    public void setEquipment(HashMap<Slot, Object> equipment) {
        this.equipment = equipment;
    }

    public enum Slot {
        HEAD, BODY, ARMS, LEGS, WEAPON
    }
}
