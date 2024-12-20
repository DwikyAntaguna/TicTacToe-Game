package game;

public class ExtendedTicTacToeBoard extends TicTacToeBoard {

    public ExtendedTicTacToeBoard(int size) {
        super(size);
    }

    @Override
    public boolean checkWin(char symbol) {
        // Dalam versi ini, kita dapat menambahkan logika tambahan untuk kemenangan jika diperlukan.
        return super.checkWin(symbol);
    }
}