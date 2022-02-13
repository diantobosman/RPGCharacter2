package Character;

public class Ranger extends Character{
    public Ranger(String name, int level) {
        super(name, level);
    }


    @Override
    public void levelUp() {
        super.levelUp();
        PrimaryAttributes[0] = PrimaryAttributes[0] + 1;
        PrimaryAttributes[1] = PrimaryAttributes[1] + 5;
        PrimaryAttributes[2] = PrimaryAttributes[2] + 1;
    }
}
