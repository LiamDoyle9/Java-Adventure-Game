public class _TestCases {

    public _TestCases(){
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


    /**
     * Testing LivingCreature objects
     * **/
    public void test_getNumMoves(){
        player.moveNorth();
        player.moveSouth();
        player.moveEast();
        player.moveWest();
        System.out.println(player.getNumMoves());
    }

    public void test_pickupItem(){
        player.printInventory();
        player.pickUpItem(key);
        player.printInventory();
    }

    public void test_drinkPotion(){
        player.setHp(10);
        System.out.println(player.getHp());
        player.pickUpItem(potion);
        player.drinkPotion(potion);
        System.out.println(player.getHp());
    }

    public void test_q_and_a(){
        puzzleMaster.q_and_a();
    }

    public void test_mob_attack(){
        player.setHp(100);
        player.setAp(100);
        mob.attack(player);
        mob.attack(player);
    }


    /**
     * Testing Items
     */
    public void test_printItemDetails(){
        Item key = new Item("Key", "A key");
        key.printItemDetails();
    }


    /**
     * Testing GameBoard and Areas
     */

    public void test_printBoard(){
        board.printBoard();
    }





}
