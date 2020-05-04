public class LivingCreature {

    private String name;
    private String description;
    private int hp;
    private int dps;

    /**
     *CLASS CONSTRUCTORS
     */

    public LivingCreature(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public LivingCreature(String name, String description, int hp, int dps) {
        this.name = name;
        this.description = description;
        this.hp = hp;
        this.dps = dps;
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

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getDps() {
        return dps;
    }

    public void setDps(int dps) {
        this.dps = dps;
    }

    /**
     * CLASS METHODS
     */

    public int attack (Mob target){
        /** Method to simulate attacking an opponent **/
        int updatedHP;
        System.out.println("You hit " + target.getName() + " for " + this.getDps() + "!");
        updatedHP = target.getHp() - this.getDps();
        target.setHp(updatedHP);
        if (updatedHP <= 0){
            target.setHp(0);
            target.die();
        }else{
            System.out.println(target.getName() + " has " + target.getHp() + " remaining. \n");
        }
        return target.getHp();
    }

    public void die(){
        /** Method that simulates a player dying **/
        System.out.println(this.getName() + " has died!");
    }

    public void printDetails(){
        /** A method that prints all details of the LivingCreature object **/
        System.out.println("Name: " + getName());
        System.out.println("Description: + " + getDescription());
        System.out.println("HP: " + getHp());
        System.out.println("DPS: " + getDps());
    }

}

