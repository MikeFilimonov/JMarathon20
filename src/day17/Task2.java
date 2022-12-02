package day17;

import java.util.Arrays;

public class Task2 {

    public final static int chessboardSize = 8;

    public static void main(String[] args) {

        ChessPiece[][] chessmen = new ChessPiece[chessboardSize][chessboardSize];
        Chessboard board = new Chessboard(chessmen);

        for (ChessPiece[] row : board.getPieces()) {
            Arrays.fill(row, ChessPiece.EMPTY);
          }

        chessmen[0][0] = ChessPiece.BLACK_ROOK;
        chessmen[0][5] = ChessPiece.BLACK_ROOK;
        chessmen[0][6] = ChessPiece.BLACK_KING;
        chessmen[1][1] = ChessPiece.WHITE_ROOK;
        chessmen[1][4] = ChessPiece.BLACK_PAWN;
        chessmen[1][5] = ChessPiece.BLACK_PAWN;
        chessmen[1][7] = ChessPiece.BLACK_PAWN;
        chessmen[2][0] = ChessPiece.BLACK_PAWN;
        chessmen[2][2] = ChessPiece.BLACK_KNIGHT;
        chessmen[2][6] = ChessPiece.BLACK_PAWN;
        chessmen[3][0] = ChessPiece.BLACK_QUEEN;
        chessmen[3][2] = ChessPiece.WHITE_BISHOP;
        chessmen[4][2] = ChessPiece.BLACK_BISHOP;
        chessmen[4][3] = ChessPiece.WHITE_PAWN;
        chessmen[5][3] = ChessPiece.WHITE_BISHOP;
        chessmen[5][4] = ChessPiece.WHITE_PAWN;
        chessmen[6][0] = ChessPiece.WHITE_PAWN;
        chessmen[6][2] = ChessPiece.WHITE_QUEEN;
        chessmen[6][5] = ChessPiece.WHITE_PAWN;
        chessmen[6][7] = ChessPiece.WHITE_PAWN;
        chessmen[7][5] = ChessPiece.WHITE_ROOK;
        chessmen[7][6] = ChessPiece.WHITE_KING;

        board.print();




    }

}
