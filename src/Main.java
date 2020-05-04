public class Main {
    public static void main (String [] args){

        Driver driver = new Driver();
        _TestCases test = new _TestCases();

        /** Two methods that run game**/
        driver.gameIntro();
        driver.runGame();

        /** Testing LivingCreature Objects**/
        //test.test_getNumMoves();
        //test.test_pickupItem();
        //test.test_drinkPotion();
        //test.test_q_and_a();
        //test.test_mob_attack();

        /** Testing Items**/
        //test.test_printItemDetails();

        /** Testing GameBoard **/
        //test.test_printBoard();

    }
}
