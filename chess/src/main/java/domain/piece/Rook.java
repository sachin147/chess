package domain.piece;

import domain.Cell;

import java.util.List;

public class Rook extends Piece {
    public Rook() {
    }

    public Rook(Cell cell) {
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
