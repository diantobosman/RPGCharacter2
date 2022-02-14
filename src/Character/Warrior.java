package Character;

public class Warrior extends Character{
    public Warrior(String name, int level, int TotalPrimaryAttributes) {
        super(name, level, TotalPrimaryAttributes);
    }

    int[] warriorInitial = new int[]{1,1,8};
    PrimaryAttributes obj = new PrimaryAttributes(warriorInitial);

    @Override
    public void levelUp() {
        super.levelUp();
    }
}
