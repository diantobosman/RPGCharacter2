package Character;

public abstract class Character {
    protected String name;
    protected int level;
    protected int totalPrimaryAttributes;
    protected int[] primaryAttribute;

    public Character(String name, int level, int TotalPrimaryAttributes) {
        this.name = name;
        this.level = level;
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
}