public class MiniGame {

    private int attempt;

    public MiniGame(){
        attempt = 0;
    }

    /**
     * SETTERS & GETTERS
     */
    public int getAttempt() {
        return attempt;
    }

    public void setAttempt(int attempt) {
        this.attempt = attempt;
    }

    /**
     * CLASS METHODS
     */
    public void gameOver(){
        /** Method that simulates a mini-game game over scenario**/
        System.out.println("Game Over!");
    }
}
