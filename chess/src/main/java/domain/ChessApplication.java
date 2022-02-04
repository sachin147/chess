package domain;

import domain.piece.Piece;
import domain.piece.PieceFactory;
import domain.utils.BoardUtil;

import java.util.List;
import java.util.Optional;

public class ChessApplication {

    public static void main(String []args) {
        Board.initialize();
        String input = "King D5";
        String []pieceTypeAndPosition = input.split(" ");
        String pieceType = pieceTypeAndPosition[0];
        String position = pieceTypeAndPosition[1];

        Piece piece = PieceFactory.getPiece(pieceType);
        Cell cell = BoardUtil.getCell(position);
        cell.setPiece(Optional.of(piece));
        piece.setCell(cell);

        List<List<Cell>> moves = piece.moves();
    }
}
