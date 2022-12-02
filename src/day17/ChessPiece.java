/*
Пешка (белая)  ♙   PAWN_WHITE
Конь (белый)   ♘   KNIGHT_WHITE
Слон (белый)   ♗   BISHOP_WHITE
Ладья (белая)  ♖   ROOK_WHITE
Ферзь (белый)  ♕   QUEEN_WHITE
Король (белый) ♔   KING_WHITE
Пешка (черная)  ♟   PAWN_BLACK
Конь (черный)   ♞   KNIGHT_BLACK
Слон (черный)   ♝   BISHOP_BLACK
Ладья (черная)  ♜   ROOK_BLACK
Ферзь (черный)  ♛   QUEEN_BLACK
Король (черный) ♚   KING_BLACK
 */

package day17;

public enum ChessPiece {
    WHITE_PAWN(1, "♙"), WHITE_KNIGHT(3, "♘"), WHITE_BISHOP(3.5, "♗"),
    WHITE_ROOK(5, "♖"), WHITE_QUEEN(9, "♕"), WHITE_KING(100, "♔"),
    BLACK_PAWN(1, "♟"), BLACK_KNIGHT(3, "♞"), BLACK_BISHOP(3.5, "♝"),
    BLACK_ROOK(5, "♜"), BLACK_QUEEN(9, "♛"), BLACK_KING(100, "♚"),
    EMPTY(-1, "_");

    private double value;
    private String image;

    ChessPiece (double value, String representation){
        this.value = value;
        this.image = representation;
    }

    public String getIcon() {
        return image;
    }

}
