package Item;

public abstract class Item {
    // Fields
    protected String itemName;
    protected int requiredLevel;
    protected int slot; //maybe int[] here?

    // Constructor
    public Item(String itemName, int requiredLevel, int slot) {
        this.itemName = itemName;
        this.requiredLevel = requiredLevel;
        this.slot = slot;
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

    public int getSlot() {
        return slot;
    }

    public void setSlot(int slot) {
        this.slot = slot;
    }
}
