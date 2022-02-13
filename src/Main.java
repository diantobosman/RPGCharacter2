import Character.*;

public class Main {
    public static void main(String[] args) {
        Mage mage = new Mage("Mage", 1);

        int[] MageInitial = new int[]{1, 1, 1};

        mage.setPrimaryAttributes(MageInitial);
        System.out.println(mage.getPrimaryAttributes()[1]);



    }



}