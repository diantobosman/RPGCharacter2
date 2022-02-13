package Character;

public abstract class Character {
    protected String name;
    protected int level;
    protected int[] PrimaryAttributes;
    protected int TotalPrimaryAttributes;

    public Character(String name, int level, int TotalPrimaryAttributes) {
        this.name = name;
        this.level = level;
    }

    public int[] getPrimaryAttributes() {
        return PrimaryAttributes;
    }

    public void setPrimaryAttributes(int[] primaryAttributes) {
        PrimaryAttributes = primaryAttributes;
    }

    public int getTotalPrimaryAttributes() {
        return TotalPrimaryAttributes;
    }

    public void setTotalPrimaryAttributes(int totalPrimaryAttributes) {
        TotalPrimaryAttributes = totalPrimaryAttributes;
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


}
