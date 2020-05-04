public class Shield extends Item {

    private int ap;       // Armour points

    public Shield(String itemName, String itemDescription, int ap){
        super(itemName, itemDescription);
        this.ap = ap;
    }

    /**
     * SETTERS & GETTERS
     * **/
    public int getAp() {
        return ap;
    }

    public void setAp(int ap) {
        this.ap = ap;
    }


}
