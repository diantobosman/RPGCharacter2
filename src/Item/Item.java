package Item;

public abstract class Item {
    protected String ItemName;
    protected int RequiredLevel;
    protected int slot; //maybe int[] here?

    public Item(String ItemName, int RequiredLevel, int slot){
        this.ItemName = ItemName;
        this.RequiredLevel = RequiredLevel;
        this.slot = slot;
    }
}
