package PrimaryAttributes;

public class PrimaryAttributes {
    static int[] primaryAttribute;

    public PrimaryAttributes(int[] initial) {
        primaryAttribute = initial;
    }


    // Getters and setters
    public static int[] getPrimaryAttribute() {
        return primaryAttribute;
    }

    public static void setPrimaryAttribute(int[] primaryAttribute) {
        PrimaryAttributes.primaryAttribute = primaryAttribute;
    }
}
