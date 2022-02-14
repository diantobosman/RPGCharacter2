package Character;

public class Ranger extends Character{
    public Ranger(String name, int level, int TotalPrimaryAttributes) {
        super(name, level, TotalPrimaryAttributes);
    }

    int[] rangerInitial = new int[]{1,1,8};
    PrimaryAttributes obj = new PrimaryAttributes(rangerInitial);

    @Override
    public void levelUp() {
        super.levelUp();
    }
}
