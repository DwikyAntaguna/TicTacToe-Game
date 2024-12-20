// File: TicTacToeGame.java
package game;

import player.Player;
import java.util.Scanner;

public class TicTacToeGame {
    public void startGame() {
        Scanner scanner = new Scanner(System.in);

        // Pilih ukuran papan
        System.out.println("Choose board size (3 for 3x3, 4 for 4x4):");
        int size = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        // Buat papan berdasarkan ukuran
        TicTacToeBoard board = (size == 4) ? new ExtendedTicTacToeBoard(size) : new TicTacToeBoard(size);

        // Input pemain
        System.out.println("Enter name for Player 1 (X):");
        Player player1 = new Player(scanner.nextLine(), 'X');

        System.out.println("Enter name for Player 2 (O):");
        Player player2 = new Player(scanner.nextLine(), 'O');

        Player currentPlayer = player1;

        // Mulai permainan
        while (true) {
            board.displayBoard();
            System.out.println(currentPlayer.getName() + " (" + currentPlayer.getSymbol() + "), it's your turn!");

            // Input koordinat
            int row, col;
            while (true) {
                System.out.print("Enter row (1-" + size + "): ");
                row = scanner.nextInt() - 1;

                System.out.print("Enter column (1-" + size + "): ");
                col = scanner.nextInt() - 1;

                if (row >= 0 && row < size && col >= 0 && col < size && board.isCellEmpty(row, col)) {
                    break;
                }
                System.out.println("Invalid move! Try again.");
            }

            // Tempatkan simbol
            board.placeSymbol(row, col, currentPlayer.getSymbol());

            // Periksa kemenangan
            if (board.checkWin(currentPlayer.getSymbol())) {
                board.displayBoard();
                System.out.println("Congratulations, " + currentPlayer.getName() + "! You win!");
                break;
            }

            // Periksa apakah papan penuh
            if (board.isBoardFull()) {
                board.displayBoard();
                System.out.println("It's a draw!");
                break;
            }

            // Ganti pemain
            currentPlayer = (currentPlayer == player1) ? player2 : player1;
        }

        scanner.close();
    }
}