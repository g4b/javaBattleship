import java.util.Scanner;

public class Game {

    Player player;
    Opponent opponent;
    Board zeroBoard;

    public Game(){
        this.player = player;
        this.opponent = opponent;
        this.zeroBoard = zeroBoard;
    }

    public void playerTurn(){
        Scanner rowScan = new Scanner(System.in);
        System.out.println("Guess a row");
        int row = rowScan.nextInt();

        Scanner colScan = new Scanner(System.in);
        System.out.println("Guess a column:");
        int col = colScan.nextInt();
        
        if (this.opponent.evilBoard.board[row][col] != 0){
            System.out.println("Hit!");
            this.opponent.evilBoard.board[row][col] = 0;
            if (opponent.evilBoard.board.equals(this.zeroBoard.board)){
                System.out.println("You win!");
            }
        } else {
            System.out.println("Miss!");
        }
        System.out.println(opponent.evilBoard.board);
    }
}
