package Item;

public abstract class Item {
    // Fields
    protected String itemName;
    protected int requiredLevel;
    protected int level;

    // Constructor
    public Item(String itemName, int requiredLevel, int level) {
        this.itemName = itemName;
        this.requiredLevel = requiredLevel;
        this.level = level;
    }


    // Getters and setters
    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getRequiredLevel() {
        return requiredLevel;
    }

    public void setRequiredLevel(int requiredLevel) {
        this.requiredLevel = requiredLevel;
    }


}
