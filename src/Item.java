public class Item {

    public String name;
    public String description;

    /**
     * Constructors
     */
    public Item(String name, String description){
        this.name = name;
        this.description = description;
    }

    public Item(){
    }

    /**
     * SETTERS & GETTERS
     * **/
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    /**
     * CLASS METHODS
     * **/
    public void printItemDetails(){
        /** A method that prints all item details **/
        System.out.println(getName());
        System.out.println(getDescription());
    }

}
