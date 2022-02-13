package Character;

public abstract class Character {
    protected int level;

    public Character(int level) {
        this.level = level;
    }


    // Getters
    public int getLevel() {
        return level;
    }

    //Setters
    public void setLevel(int level) {
        this.level = level;
    }

    // LevelUp function
    public void mageLevelUp() {
        this.level = level + 1;
        System.out.println("The new level is:" + level);
    }

}
