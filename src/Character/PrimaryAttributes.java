package Character;

public class PrimaryAttributes {
    static int[] primaryAttribute;

    public PrimaryAttributes(int[] mageInitial) {
        primaryAttribute = mageInitial;
    }

    public static int[] getPrimaryAttribute() {
        return primaryAttribute;
    }

    public static void setPrimaryAttribute(int[] primaryAttribute) {
        PrimaryAttributes.primaryAttribute = primaryAttribute;
    }
}
