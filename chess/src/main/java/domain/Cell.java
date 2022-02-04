package domain;

import domain.piece.Piece;

import java.util.Optional;

public class Cell {
    private String cellNumber;
    private Optional<Piece> piece;
    private Position position;

    public Cell() {
    }

    public Cell(Position position) {
        this.position = position;
    }

    public Cell(Optional<Piece> piece, Position position) {
        this.piece = piece;
    }

    public Optional<Piece> getPiece() {
        return piece;
    }

    public void setPiece(Optional<Piece> piece) {
        this.piece = piece;
    }

    public String getCellNumber() {
        return cellNumber;
    }

    public void setCellNumber(String cellNumber) {
        this.cellNumber = cellNumber;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
}
