import Character.*;

public class Main {
    public static void main(String[] args) {
        Mage mage = new Mage("Mage", 1, 7);

        int[] MageInitial = new int[]{1,1,8};
        int[] RogueInitial = new int[]{2,6,1};
        int[] WarriorInitial = new int[]{5,2,1};
        int[] RangeInitial = new int[]{1,7,1};

        mage.setPrimaryAttributes(MageInitial);
        System.out.println(mage.getPrimaryAttributes()[0]);

        mage.levelUp();
        System.out.println(mage.getLevel());
        System.out.println(mage.getPrimaryAttributes()[0]);
    }



}