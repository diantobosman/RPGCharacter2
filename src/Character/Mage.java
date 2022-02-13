package Character;

public class Mage extends Character {
    public Mage(String name, int level, int TotalPrimaryAttributes) {
        super(name, level, TotalPrimaryAttributes);
    }

    @Override
    public void levelUp() {
        super.levelUp();
        PrimaryAttributes[0] = PrimaryAttributes[0] + 1;
        PrimaryAttributes[1] = PrimaryAttributes[1] + 1;
        PrimaryAttributes[2] = PrimaryAttributes[2] + 5;
        TotalPrimaryAttributes = TotalPrimaryAttributes + 7;
    }
}
