package domain.piece;

import domain.Cell;
import domain.Position;

import java.util.ArrayList;
import java.util.List;

public class King extends Piece {

    public King() {
    }

    public King(Cell cell) {
        super(cell);
    }

    @Override
    public List<Cell> move(Integer moveNumber) {
        Integer currentHorizontalIndex = this.getCell().getPosition().getHorizontalIndex();
        Integer currentVerticalIndex = this.getCell().getPosition().getVerticalIndex();
        List<Cell> move = new ArrayList<>();
        switch(moveNumber) {
            case 1:
                move.add(new Cell(new Position(currentHorizontalIndex, currentVerticalIndex)));
                break;
            case 2:
                move.add(new Cell(new Position(currentHorizontalIndex, currentVerticalIndex)));
                break;
            case 3:
                move.add(new Cell(new Position(currentHorizontalIndex, currentVerticalIndex)));
                break;
            case 4:
                move.add(new Cell(new Position(currentHorizontalIndex, currentVerticalIndex)));
                break;
            case 5:
                move.add(new Cell(new Position(currentHorizontalIndex, currentVerticalIndex)));
                break;
            case 6:
                move.add(new Cell(new Position(currentHorizontalIndex, currentVerticalIndex)));
                break;
            case 7:
                move.add(new Cell(new Position(currentHorizontalIndex, currentVerticalIndex)));
                break;
            case 8:
                move.add(new Cell(new Position(currentHorizontalIndex, currentVerticalIndex)));
                break;
            default:
                break;

        }
        return move;
    }

    @Override
    public List<List<Cell>> moves() {
        List<List<Cell>> moves = new ArrayList<>();
        List<Cell> move1 = move(1);
        moves.add(move1);
        return moves;
    }
}
