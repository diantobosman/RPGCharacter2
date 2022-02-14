package Character;

public class Mage extends Character {

    public Mage() {
        super.name = "Mage";
        int[] mageInitial = new int[]{1,1,8};
        initialize(mageInitial);
        super.totalPrimaryAttributes = 10;
    }

    @Override
    public void levelUp() {
        super.levelUp();
        super.primaryAttribute[0] = super.primaryAttribute[0] + 1;
        super.primaryAttribute[1] = super.primaryAttribute[1] + 7;
        super.primaryAttribute[2] = super.primaryAttribute[2] + 1;
        super.totalPrimaryAttributes = super.totalPrimaryAttributes + 9;
    }
}