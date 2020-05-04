public class Weapon extends Item{

    private int itemDPS;

    /**
     * CLASS CONSTRUCTORS
     */
    public Weapon(String itemName, String itemDescription, int itemDPS){
        super(itemName, itemDescription);
        this.itemDPS = itemDPS;
    }

    public Weapon(){
    }

    /**
     * SETTERS & GETTERS
     * **/
    public int getItemDPS() {
        return itemDPS;
    }

    public void setItemDPS(int itemDPS) {
        this.itemDPS = itemDPS;
    }
}
