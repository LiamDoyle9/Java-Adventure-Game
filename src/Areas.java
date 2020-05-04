public class Areas {

    private String name;
    private String description;
    private Boolean locked;

    /**
     * CONSTRUCTOR
     */
    public Areas(String name, String description){
        this.name = name;
        this.description = description;

    }

    public Areas(String name, String description, Boolean locked){
        this.name = name;
        this.description = description;
        this.locked = locked;
    }


    /**
     * SETTERS & GETTERS
     */
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

    public Boolean getLocked() {
        return locked;
    }

    public void setLocked(Boolean locked) {
        this.locked = locked;
    }
}
