import java.util.Random;

public class Board {

    public int[][] board;

    public Board(){
        this.board = new int[8][8];
        for (int i = 0; i < 8; i++){
            for (int j = 0; j < 8; j++){
                this.board[i][j] = 0;
            }
        }
    }

    public void placeShips(){
        Random rand = new Random();
        for (int i = 1; i < 5; i++){
            int row = rand.nextInt(8);
            int col = rand.nextInt(8);
            this.board[row][col] = i;
        }
    }

    public void printBoard() {
        for (int i = 0; i < 8; i++){
            for (int j = 0; j < 8; j++){
                if (j == 7){
                    System.out.println(this.board[i][j]);
                } else {
                    System.out.print(this.board[i][j]);
                }
            }
        }
        System.out.println();
    }
}
