package Character;

public class Rogue extends Character{
    public Rogue(String name, int level, int TotalPrimaryAttributes) {
        super(name, level, TotalPrimaryAttributes);
    }

    int[] rogueInitial = new int[]{1,1,8};
    PrimaryAttributes obj = new PrimaryAttributes(rogueInitial);

    @Override
    public void levelUp() {
        super.levelUp();
    }
}
