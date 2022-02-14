package Character;

public class Warrior extends Character{
    public Warrior(String name, int level, int TotalPrimaryAttributes) {
        super(name, level, TotalPrimaryAttributes);
    }

    @Override
    public void levelUp() {
        super.levelUp();
        super.primaryAttribute[0] = super.primaryAttribute[0] + 3;
        super.primaryAttribute[1] = super.primaryAttribute[1] + 2;
        super.primaryAttribute[2] = super.primaryAttribute[2] + 1;
        super.totalPrimaryAttributes = super.totalPrimaryAttributes + 6;
    }
}