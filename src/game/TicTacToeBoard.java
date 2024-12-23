package game;

public class TicTacToeBoard {
    protected char[][] board;
    protected int size;

    public TicTacToeBoard(int size) {
        this.size = size;
        board = new char[size][size];

        // Mengisi papan dengan tanda kosong
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                board[i][j] = ' ';
            }
        }
    }

}