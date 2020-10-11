package day17;

public class Task1 {
    public static void main(String[] args) {
        ChessPiece[] mass = {ChessPiece.PAWN_WHITE, ChessPiece.PAWN_WHITE, ChessPiece.PAWN_WHITE, ChessPiece.PAWN_WHITE,
                ChessPiece.ROOK_BLACK, ChessPiece.ROOK_BLACK, ChessPiece.ROOK_BLACK, ChessPiece.ROOK_BLACK};

        for (int i = 0; i < mass.length; i++) {
            System.out.print(mass[i].getName() + " ");
        }

    }
}
