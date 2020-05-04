public class Mob extends LivingCreature {

    /**
     * CLASS CONSTRUCTOR
     */
    public Mob(String name, String description, int hp, int dps){                 //dps = damage per strike
        super(name, description, hp, dps);
    }

    /**
     * CLASS METHODS
     **/
    public int attack (Player target){
        /** Method to simulate attacking an opponent **/
        int updatedHP;
        int updatedAP;
        int temp;

        if((target.getAp() - getDps()) > 0){
            target.setAp(target.getAp() - getDps());
            System.out.println(getName() + " hit you for " + getDps());
            System.out.println("You have " + target.getHp() + " HP and " + target.getAp() + " AP remaining.");
            return target.getAp();
        } else {
            temp = (getDps() - target.getAp());
            target.setHp(target.getHp() - temp);
            System.out.println(getName() + " hit you for " + getDps());
            System.out.println("You have " +target.getHp() + " HP and " + target.getAp() + " AP remaining.");
        } return target.getHp();
    }

    public void die(){
        /** A method that simulates a Mob dying **/
        System.out.println("You have successfully slain " + this.getName());
    }
}
