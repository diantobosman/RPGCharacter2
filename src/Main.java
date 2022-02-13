import Character.*;

public class Main {
    public static void main(String[] args) {
        Mage mage = new Mage("Mage", 1);


        int[] test = new int[]{1, 1, 1};
        mage.setPrimaryAttributes(test);
        System.out.println(mage.getPrimaryAttributes());



    }



}