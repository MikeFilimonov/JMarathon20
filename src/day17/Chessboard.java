package day17;

public class Chessboard {

    private ChessPiece[][] pieces;

    public Chessboard(ChessPiece[][] pieces) {
        this.pieces = pieces;
    }

    public ChessPiece[][] getPieces() {
        return pieces;
    }


    public void print(){

        for (ChessPiece[] boardLine: pieces) {

            for (ChessPiece chessman: boardLine) {
                System.out.print(chessman.getIcon());
            }
            System.out.print("\r\n");

        }

    }

}
