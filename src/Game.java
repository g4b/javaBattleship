import java.util.Scanner;
import java.util.Random;

public class Game {

    public static void main (String[] args) {
        Player player = new Player();
        Opponent opponent = new Opponent();
        Board zeroBoard = new Board();
        Scanner rowScan = new Scanner(System.in);

        while (!opponent.evilBoard.board.equals(zeroBoard.board) || !player.playerBoard.board.equals(zeroBoard.board)) {
            System.out.println("Guess a row (between 0 and 7 inclusive)");
            int row = rowScan.nextInt();

            Scanner colScan = new Scanner(System.in);
            System.out.println("Guess a column (between 0 and 7 inclusive)");
            int col = colScan.nextInt();

            playerTurn(opponent, zeroBoard, row, col);
            oppoTurn(player, zeroBoard);
        }
        if (opponent.evilBoard.board.equals(zeroBoard.board)) {
            System.out.println("You win!");
        } else {
            System.out.println("You lose!");
        }
    }

    public static void playerTurn(Opponent opponent, Board zeroBoard, int row, int col) {
        if (opponent.evilBoard.board[row][col] != 0) {
            System.out.println("Hit!");
            opponent.evilBoard.board[row][col] = 0;
        } else {
            System.out.println("Miss!" + "\n");
        }
        opponent.evilBoard.printBoard();
    }

    public static void oppoTurn(Player player, Board zeroBoard) {
        System.out.println("Opponent's turn!");
        Random rand = new Random();
        int row = rand.nextInt(8);
        int col = rand.nextInt(8);

        if (player.playerBoard.board[row][col] != 0) {
            System.out.println("You're hit!");
            player.playerBoard.board[row][col] = 0;
        } else {
            System.out.println("Opponent missed!" + "\n");
        }
        player.playerBoard.printBoard();
    }
}
