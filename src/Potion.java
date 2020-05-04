public class Potion extends Item implements HealingPotion {

    private int heal;

    public Potion(String itemName, String itemDescription, int heal){
        super(itemName, itemDescription);
        this.heal = heal;
    }

    /**
     * SETTERS & GETTERS
     * **/
    public int getHeal() {
        return heal;
    }

    public void setHeal(int heal) {
        this.heal = heal;
    }

}
