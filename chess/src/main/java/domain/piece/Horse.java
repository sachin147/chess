package domain.piece;

import domain.Cell;

import java.util.List;

public class Horse extends Piece {


    public Horse() {
    }

    public Horse(Cell cell) {
        super(cell);
    }

    @Override
    public List<List<Cell>> moves() {
        return null;
    }

    @Override
    public List<Cell> move(Integer moveNumber) {
        return null;
    }
}
