package domain.piece;

public class PieceFactory {

    public static Piece getPiece(String type) {
        Piece piece;
        switch (type) {
            case "Bishop":
                piece = new Bishop();
                break;
            case "Horse":
                piece = new Horse();
                break;
            case "King":
                piece = new King();
                break;
            case "Pawn":
                piece = new Pawn();
                break;
            case "Queen":
                piece = new Queen();
                break;
            case "Rook":
                piece = new Rook();
                break;
            default:
                throw new IllegalArgumentException("Invalid player.");
        }
        return piece;
    }
}
