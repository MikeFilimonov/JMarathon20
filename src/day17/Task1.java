package day17;

public class Task1 {

    public static void main(String[] args) {

        ChessPiece [] chessmen = {ChessPiece.WHITE_PAWN, ChessPiece.WHITE_PAWN, ChessPiece.WHITE_PAWN,
                ChessPiece.WHITE_PAWN, ChessPiece.BLACK_ROOK, ChessPiece.BLACK_ROOK, ChessPiece.BLACK_ROOK,
                ChessPiece.BLACK_ROOK};

        StringBuilder concatenator = new StringBuilder();
        for (ChessPiece item: chessmen) {
            concatenator.append(item.getIcon()).append(" ").toString();
          }

        System.out.println(concatenator.toString());

    }

}
