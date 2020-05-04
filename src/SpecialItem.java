public class SpecialItem extends Item {


    public SpecialItem(String itemName, String itemDescription){
        super(itemName, itemDescription);
    }

    /**
     * CLASS METHODS
     * **/

    public void detonate(){
        /** A Method that simulates the special item activating **/
        System.out.println("BOOM!");
    }


}
