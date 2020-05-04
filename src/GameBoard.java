public class GameBoard {

    private Areas[][] board = new Areas[5][5];



    /**
     * CONSTRUCTOR
     */
    public GameBoard(){
        board[0][0] = new Coast("Coast", "A jagged coastline");
        board[0][1] = new Coast("Coast", "A jagged coastline");
        board[0][2] = new Marsh("Marsh", "A humid and putrid marsh");
        board[0][3] = new Marsh("Marsh", "A humid and putrid marsh");
        board[0][4] = new Marsh("Marsh", "A humid and putrid marsh");

        board[1][0] = new Coast("Coast", "A jagged coastline");
        board[1][1] = new Marsh("Marsh", "A humid and putrid marsh");
        board[1][2] = new Marsh("Marsh", "A humid and putrid marsh");
        board[1][3] = new Marsh("Marsh", "A humid and putrid marsh");
        board[1][4] = new Marsh("Marsh", "A humid and putrid marsh");

        board[2][0] = new Marsh("Marsh", "A humid and putrid marsh");
        board[2][1] = new Marsh("Marsh", "A humid and putrid marsh");

        board[2][2] = new Cave("Cave", "A mysterious looking cave with a strange glow inside", true);

        board[2][3] = new Marsh("Marsh", "A humid and putrid marsh");
        board[2][4] = new Marsh("Marsh", "A humid and putrid marsh");

        board[3][0] = new Marsh("Marsh", "A humid and putrid marsh");
        board[3][1] = new Marsh("Marsh", "A humid and putrid marsh");
        board[3][2] = new Marsh("Marsh", "A humid and putrid marsh");
        board[3][3] = new Marsh("Marsh", "A humid and putrid marsh");
        board[3][4] = new DarkForest("Dark Forest", "A humid and putrid marsh");

        board[4][0] = new Marsh("Marsh", "A humid and putrid marsh");
        board[4][1] = new Marsh("Marsh", "A humid and putrid marsh");
        board[4][2] = new Marsh("Marsh", "A humid and putrid marsh");
        board[4][3] = new DarkForest("Dark Forest", "A humid and putrid marsh");
        board[4][4] = new DarkForest("Dark Forest", "A humid and putrid marsh");
    }

    /**
     * SETTERS & GETTERS
     */

    public Areas[][] getBoard() {
        return board;
    }

    public void setBoard(Areas[][] board) {
        this.board = board;
    }

    /**
     * CLASS METHODS
     */

    public void printBoard() {
        /** Method that prints the layout of the board **/
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print("          " + board[i][j].getName()  + "       ");
            }
            System.out.println();
        }
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------");
    }
}
