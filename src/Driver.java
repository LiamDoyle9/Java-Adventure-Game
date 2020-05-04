public class Driver {

    public Driver(){
    }

    private GameBoard board = new GameBoard();

    private Coast coast = new Coast("Coast", "A jagged coastline littered with the remnants of old ship-wrecks");
    private Marsh marsh = new Marsh("Marsh", "A humid and putrid marsh covered in tall grass");
    private Cave cave = new Cave ("Cave", "A mysterious cave with a subtle glow coming from deep within", true);
    private DarkForest forest = new DarkForest("Dark Forest", "A vast forest, so dense entering without a torch be futile");

    private Sword sword = new Sword("Sword", "A small one-handed sword", 25);
    private Shield shield = new Shield("Shield", "An old battle-worn Pict style shield", 50);
    private Potion potion = new Potion("Healing Potion", "A small vial of Healing Potion", 50);
    private Key key  = new Key ("Key", "An ancient key made of thick heavy metal");
    private Torch torch = new Torch("Torch", "An old oil lantern");
    private SpecialItem specialItem = new SpecialItem("Special item", "A ball with explosive potential");

    private Player player = new Player ("Patrick", "The lone survivor of a ship wreck that washed up on the jagged coastline", 100, 15);
    private Mob mob = new Mob("Flesh Eater", "A four legged carnivore that scavenges around the marshes looking for food", 100, 15);
    private GameMaster gameMaster = new GameMaster("Game Master", "A decrepit looking old man with one eye, even less teeth and a funny hat");
    private PuzzleMaster puzzleMaster = new PuzzleMaster("Puzzle Master", "A bony old women draped in black robes and covered in cats");

    private DiceRollGame diceRollGame = new DiceRollGame();

    public void gameIntro(){
        /** A method that prints an introduction to the game **/
        System.out.println("**************************************************************************************************************************************************************************************************************\n");
        System.out.println("Your eyes slowly begin to open as you regain consciousness... \n");
        System.out.println("You sit up slowly and find yourself stranded on a jagged coastline. You Look around to try get your bearings and figured out what happened. \n");
        System.out.println("You see debris all around you and suddenly, you start to remember events from the night before ...  \n ");
        System.out.println("You were on a cruise ship sailing through a storm. People were shouting and screaming. Then all of a sudden there was darkness and the next thing you know, you're stranded on a jagged coastline. \n");
        System.out.println(" ... \n");
        System.out.println("Some time passes. You begin to forage around to see what you can find. \n");
        System.out.println("You find what appears to be a map with coordinates written on it. \n");
        System.out.println(" ... \n");
        System.out.println("You hear a quiet voice behind you. You turn around quickly and see a decrepit looking old man with one eye ... \n");

        System.out.println("**************************************************************************************************************************************************************************************************************\n");
    }

    public void runGame(){
        /** A method that runs class other methods to simulate the running of the game **/
        diceRollGame.startDiceRollGame();
        player.pickUpItem(sword);
        player.equipWeapon(sword);

        board.printBoard();

        player.printPlayerPosition();
        player.moveNorth();
        player.moveEast();
        player.moveEast();
        player.pickUpItem(key);
        player.printInventory();
        player.moveSouth();
        //now at [1,2]
        puzzleMaster.startQuiz();
        player.pickUpItem(shield);
        player.equipItem(shield);

        player.moveWest();
        player.pickUpItem(potion);
        player.moveSouth();
        player.moveSouth();
        player.moveEast();
        //now at [3,2]
        player.getAmbushed();
        player.attack(mob);
        mob.attack(player);
        player.attack(mob);
        mob.attack(player);
        player.attack(mob);

        player.moveNorth();
        player.unlockDoor(key);

    }
}
