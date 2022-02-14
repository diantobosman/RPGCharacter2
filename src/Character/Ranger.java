package Character;

public class Ranger extends Character{
    public Ranger(String name, int level, int TotalPrimaryAttributes) {
        super(name, level, TotalPrimaryAttributes);
    }

    @Override
    public void levelUp() {
        super.levelUp();
        PrimaryAttributes[0] = PrimaryAttributes[0] + 1;
        PrimaryAttributes[1] = PrimaryAttributes[1] + 5;
        PrimaryAttributes[2] = PrimaryAttributes[2] + 1;
        TotalPrimaryAttributes = TotalPrimaryAttributes + 7;
    }
}
