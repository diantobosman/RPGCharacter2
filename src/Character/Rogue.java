package Character;

public class Rogue extends Character{
    public Rogue(String name, int level) {
        super(name, level);
    }


    @Override
    public void levelUp() {
        super.levelUp();
        PrimaryAttributes[0] = PrimaryAttributes[0] + 3;
        PrimaryAttributes[1] = PrimaryAttributes[1] + 2;
        PrimaryAttributes[2] = PrimaryAttributes[2] + 1;
    }
}
