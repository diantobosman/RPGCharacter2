package Character;

public class Ranger extends Character{

    public Ranger() {
        super.name = "Ranger";
        int[] rangerInitial = new int[]{1,7,1};
        initialize(rangerInitial);
        super.totalPrimaryAttributes = 9;
    }

    @Override
    public void levelUp() {
        super.levelUp();
        super.primaryAttribute[0] = super.primaryAttribute[0] + 1;
        super.primaryAttribute[1] = super.primaryAttribute[1] + 5;
        super.primaryAttribute[2] = super.primaryAttribute[2] + 1;
        super.totalPrimaryAttributes = super.totalPrimaryAttributes + 7;
    }
}
