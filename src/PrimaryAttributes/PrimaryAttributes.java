package PrimaryAttributes;

public class PrimaryAttributes {
    public static int[] primaryAttribute;

    public PrimaryAttributes(int[] initial) {
        primaryAttribute = initial;
    }


    // Getters and setters
    public static int[] getPrimaryAttribute() {
        return primaryAttribute;
    }

    public void setPrimaryAttribute(int[] primaryAttribute) {
        PrimaryAttributes.primaryAttribute = primaryAttribute;
    }
}
