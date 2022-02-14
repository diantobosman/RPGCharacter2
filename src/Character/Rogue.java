package Character;

public class Rogue extends Character{
    public Rogue(String name, int level, int TotalPrimaryAttributes) {
        super(name, level, TotalPrimaryAttributes);
    }

    @Override
    public void levelUp() {
        super.levelUp();
        super.primaryAttribute[0] = super.primaryAttribute[0] + 1;
        super.primaryAttribute[1] = super.primaryAttribute[1] + 4;
        super.primaryAttribute[2] = super.primaryAttribute[2] + 1;
        super.totalPrimaryAttributes = super.totalPrimaryAttributes + 6;
    }
}
