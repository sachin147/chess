package domain;

public class Board {

    private final static int ROW = 8;
    private final static int COLUMN = 8;
    private final static Cell[][] board = new Cell[ROW][COLUMN];

    public static void initialize() {
        for(int i=0; i<ROW; i++) {
            for(int j=0; j<COLUMN; j++) {
                Position position = new Position(i, j);
                board[i][j] = new Cell(position);
            }
        }
    }

}
