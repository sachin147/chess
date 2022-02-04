package domain.piece;

import domain.Cell;

import java.util.List;

public class Queen extends Piece {
    public Queen() {
    }

    public Queen(Cell cell) {
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
