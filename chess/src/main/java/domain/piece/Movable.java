package domain.piece;

import domain.Cell;

import java.util.List;

public interface Movable {

    List<Cell> move(Integer moveNumber);
}
