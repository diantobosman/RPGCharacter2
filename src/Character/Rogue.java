package Character;

public class Rogue extends Character{

    public Rogue() {
        super.name = "Rogue";
        int[] rogueInitial = new int[]{2,6,1};
        initialize(rogueInitial);
        super.totalPrimaryAttributes = 7;
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
