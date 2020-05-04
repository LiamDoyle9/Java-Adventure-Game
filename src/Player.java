import java.util.ArrayList;

public class Player extends LivingCreature {

    private ArrayList<Item> inventory;
    private int x;
    private int y;
    private int ap;
    private int numMoves;


    /**
     *CLASS CONSTRUCTOR
     */
    public Player (String name, String description, int hp, int dps){
        super(name, description, hp, dps);
        inventory = new ArrayList<Item>();
        this.x = 0;
        this.y = 0;
        ap = 0;
        numMoves = 0;
    }


    /**
     * SETTERS & GETTERS
     */
    public ArrayList<Item> getInventory() {
        return inventory;
    }

    public void setInventory(ArrayList<Item> inventory) {
        this.inventory = inventory;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getAp() {
        return ap;
    }

    public void setAp(int ap) {
        this.ap = ap;
    }

    public int getNumMoves() {
        return numMoves;
    }

    public void setNumMoves(int numMoves) {
        this.numMoves = numMoves;
    }


    /**
     * CLASS METHODS
     */

    public int moveNorth(){
        /** A method that simulates moving a player NORTH **/
        if(this.getX() <= 0){
            System.out.println("-> You try to move North, but that is not possible from this position. \n");
        } else {
            this.setX(getX()-1);
            System.out.println("-> You move North.");
            printPlayerPosition();
        } if (this.getX()==2 && this.getY()==2){
        }
        setNumMoves(getNumMoves()+1);
        return this.x;
    }

    public int moveSouth(){
        /** A method that simulates moving a player SOUTH **/
        int tempX = this.getX() + 1;
        if(this.getX() >= 4 || (tempX == 2 && this.getY() == 2)){
            System.out.println("-> You try to move South, but that is not possible from this position. \n");
        } else {
            this.setX(getX()+1);
            System.out.println("-> You move South.");
            printPlayerPosition();
        }
        setNumMoves(getNumMoves()+1);
        return this.x;
    }


    public int moveEast(){
        /** A method that simulates moving a player EAST **/
        int tempY = this.getY()+1;
        if(this.getY() >= 4 || (tempY == 2 && this.getX() == 2)) {
            System.out.println("-> You try to move East, but that is not possible from this position. \n");
        } else {
            this.setY(getY()+1);
            System.out.println("-> You move East");
            printPlayerPosition();
        }
        setNumMoves(getNumMoves()+1);
        return this.y;
    }

    public int moveWest(){
        /** A method that simulates moving a player WEST **/
        if(this.getY() <= 0){
            System.out.println("-> You try to move West, but that is not possible from this position. \n");
        } else {
            this.setY(getY()-1);
            System.out.println("-> You move West.");
            printPlayerPosition();
        }
        setNumMoves(getNumMoves()+1);
        return this.y;
    }


    public void printPlayerPosition(){
        /** A method that prints the current position of the player **/
        System.out.println("-> Your current position is: ");
        System.out.println("["+ this.getX() + "," + this.getY() + "]\n");

    }

    public void pickUpItem(Item item){
        /** A method that simulates picking up an item **/
        inventory.add(item);
        System.out.println("You found a " + item.getName());
        System.out.println(item.getName() + " added to your inventory. \n");
    }

    public void pickUpWeapon(Weapon Weapon){
        /** A method that simulates picking up a weapon **/
        inventory.add(Weapon);
        System.out.println("You found a " + Weapon.getName());
        System.out.println(Weapon.getName() + " added to your inventory. \n");
    }

    public void unlockDoor(Key key) {
        /** A method that simulates unlocking a door and reaching an end-game point**/
        if (this.getInventory().contains(key)){
            System.out.println("Door unlocked");
            winGame();
        } else {
            System.out.println("You need a key to unlock this door!");
        }
    }

    public int drinkPotion(Potion potion) {
        /** Method to simulate drinking a health potion **/
        int updatedHP;
        if (this.getInventory().contains(potion)) {
            if ((this.getHp() + potion.getHeal()) <= 100) {
                updatedHP = (this.getHp() + potion.getHeal());
                this.setHp(updatedHP);
            } else {
                this.setHp(100);
            }
            inventory.remove(potion);
            System.out.println("You consumed a " + potion.getName() + ". Your health is now " + this.getHp());
        } else {
            System.out.println(potion.getName() + " could not be found in your inventory.");
        }
        return this.getHp();
    }

    public void printInventory() {
        /** Method to print out contents of players inventory **/
        System.out.println("You inventory contains: ");
        for (Item element : inventory) {
            System.out.println(element.getName());

        }
        System.out.println("\n");
    }

    public void getAmbushed(){
        /** Method that introduces combat with a mob (ambush)**/
        System.out.println("****************************************************************************** \n");
        System.out.println("You hear a rustling from behind. You turn quickly and find a 4-legged beast staring right at you! \n");
        System.out.println("The creature charges at you ... prepare to fight! \n");
    }

    public void equipWeapon(Weapon weapon){
        /** Method to simulate equipping a weapon **/
        if(!inventory.contains(weapon)){
            System.out.println(weapon.getName() + " is not in your inventory.");
        } else {
            setDps(getDps() + weapon.getItemDPS());
        }
    }

    public void equipItem(Shield item){
        /** Method to simulate equipping an item **/
        if(!inventory.contains(item)){
            System.out.println(getName() + " is not in your inventory.");
        } else {
            setAp(getAp() + item.getAp());
        }
    }

    public void checkSpecialItem(SpecialItem item){
        /** Method to check special item conditions / activate special item**/
        if (inventory.contains(item)) {
            if(getX() % 2 == 0 || getY() % 2 == 0){
                item.detonate();
                loseGame();
            }
        }
    }

    public void winGame(){
        /** Method that simulates a game over (Win) scenario **/
        System.out.println("************************************************************************************ \n");
        System.out.println("CONGRATULATIONS!\n");
        System.out.println("You have successfully reached the end of the game! Thank you for playing!\n");
        System.out.println("************************************************************************************ \n");
    }

    public void loseGame(){
        /** Method that simulates a game over (Lose) scenario **/
        System.out.println("************************************************************************************ \n");
        System.out.println("GAME OVER! YOU LOSE!\n");
        System.out.println("************************************************************************************ \n");
    }


}