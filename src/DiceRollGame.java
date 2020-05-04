import java.util.Random;

public class DiceRollGame extends MiniGame {


    private int numberOfRolls;
    private int gameMasterTotal;
    private int playerTotal;


    public DiceRollGame(){
        numberOfRolls = 0;

    }

    /**
     * SETTERS & GETTERS
     */

    public int getNumberOfRolls() {
        return numberOfRolls;
    }

    public void setNumberOfRolls(int numberOfRolls) {
        this.numberOfRolls = numberOfRolls;
    }

    public int getGameMasterTotal() {
        return gameMasterTotal;
    }

    public void setGameMasterTotal(int gameMasterTotal) {
        this.gameMasterTotal = gameMasterTotal;
    }

    public int getPlayerTotal() {
        return playerTotal;
    }

    public void setPlayerTotal(int playerTotal) {
        this.playerTotal = playerTotal;
    }


    /**
     * CLASS METHODS
     */
    public void startDiceRollGame(){
        /** Method that runs through all relevant methods that collectively make up the Dice Roll Game **/
        diceRollGameIntro();
        setUpDiceRollGame();
        playerRoll();
        gameMasterRoll();
        calculateWinner();
    }

    public void replayDiceRollGame(){
        /** Method that runs through all relevant methods that collectively make up the Dice Roll Game - Skipping the intro and setup **/
        playerRoll();
        gameMasterRoll();
        calculateWinner();
    }


    public void diceRollGameIntro(){
        /** Method that prints out details about the DiceRollGame **/
        System.out.println("\"Well what do we have here!?\"\n");
        System.out.println("\"You look a little lost ... tell you what, i'll tell you how to get off this beach if you play a little game ...\"\n");

        System.out.println("********************************************************************************************************************* \n");
        System.out.println("\"The rules are simple! \n 1: Roll your dice \n 2: Match OR beat my total score.\"\n");

        System.out.println("\"Beat me, and I will let you in on a little secret. \n Fail to beat me, and the secret will remain mine but I will tell you how to get off this beach.\"\n");
        System.out.println("\"I will give you two chances to beat me! Good luck!\"\n");

    }

    public void setUpDiceRollGame(){
        /** Method that sets up the DiceRollGame **/
        setAttempt(0);
        System.out.println("\"How many times would you like to roll the dice?\"");
        System.out.println("-> You reply with 5");
        setNumberOfRolls(5);
        System.out.println("\"As you wish. We will both roll the dice " +getNumberOfRolls() + " times. \n Good luck!\"\n");

    }

    public int playerRoll(){
        /** Method that simulates a player rolling the dice - RIGGED TO GUARANTEE A WIN SCENARIO**/
        int playerTotal = 0;
        System.out.println("\"Your turn!\"");
        for(int i = 1; i < numberOfRolls+1; i++) {
            int playerTemp = (6);
            System.out.println("Roll " + i + ": " + playerTemp);
            playerTotal = playerTotal + playerTemp;
        }
        System.out.println("\"Your total is: " + playerTotal + ".\"\n");
        setPlayerTotal(playerTotal);
        return playerTotal;
    }

    public int gameMasterRoll(){
        /** Method that simulates the GameMaster rolling the dice **/
        Random r = new Random();
        int gameMasterTotal = 0;
        System.out.println("\"My turn!\"");
        for(int i = 1; i < numberOfRolls+1; i++) {
            int temp = (r.nextInt(6)+1);
            System.out.println("Roll " + i + ": " + temp);
            gameMasterTotal = gameMasterTotal + temp;
        }
        System.out.println("\"My total is: " + gameMasterTotal + ".\"\n");
        setGameMasterTotal(gameMasterTotal);
        return gameMasterTotal;
    }

    public void calculateWinner(){
        /** Method that calculates the winner **/
        if(this.getPlayerTotal() >= this.gameMasterTotal){
            playerWin();
        } else {
            playerLose();
        }
    }


    public void playerLose(){
        /** Method that simulates a player lose scenario **/
        setAttempt(getAttempt() + 1);
        if(getAttempt() > 1){
            gameOver();
            System.out.println("\"You lose! \n Game over. That was fun!\"\n");
            loseMessage();
        }else{
            System.out.println("\"Unlucky! One more attempt left. Good luck!\"\n");
            replayDiceRollGame();
        }

    }

    public void playerWin(){
        /** A method that simulates a player win scenario **/
        System.out.println("\"Congratulations. You win!\"\n");
        winMessage();

    }

    public void winMessage(){
        /** A Method that is called after a player win scenario **/
        System.out.println("\"This place has a secret!\"\n");
        System.out.println("\"Go EAST!\"\n");
        System.out.println("\"As soon as you get off the beach have a look around and you should find an old key! Take this key to the centre of the island.\"\n");
        System.out.println("\"Take this with you, you'll need it!\"");
        System.out.println("\"That is all I can tell you now traveller. Good luck!\"\n");
        System.out.println("********************************************************************************************************************* \n");
    }

    public void loseMessage(){
        /** A Method that is called after a player lose scenario **/
        System.out.println("\"You're on your own traveller!\"\n");
        System.out.println("\"Head SOUTH to get off the beach!\"\n");
        System.out.println("\"Take this sword with you, you'll need it!\"");
        System.out.println("\"Good luck!\"\n");
        System.out.println("********************************************************************************************************************* \n");
    }

}
