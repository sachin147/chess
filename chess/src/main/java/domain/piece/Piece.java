package domain.piece;

import domain.Cell;

import java.util.List;

public abstract class Piece implements Movable {

    private Cell cell;

    public Piece() {
    }

    public Piece(Cell cell) {
        this.cell = cell;
    }

    public Cell getCell() {
        return cell;
    }

    public void setCell(Cell cell) {
        this.cell = cell;
    }

    public abstract List<List<Cell>> moves();
}
