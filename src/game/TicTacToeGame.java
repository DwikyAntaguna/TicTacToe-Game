package game;

import java.util.Scanner;

public class TicTacToeGame {
    public void startGame() {
        Scanner scanner = new Scanner(System.in);

        // Pilih ukuran papan
        System.out.println("Choose board size (3 for 3x3, 4 for 4x4):");
        int size = scanner.nextInt();
        scanner.nextLine();
    }
}
