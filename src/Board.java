import java.util.Random;

public class Board {

    public int[][] board;

    public Board(){
        this.board = new int[8][8];
        for (int i = 0; i < 8; i++){
            for (int j = 0; j < 8; j++){
                board[i][j] = 0;
            }
        }
    }

    public void placeShips(){
        for (int i = 0; i < 4; i++){
            int row = new Random().nextInt(8);
            int col = new Random().nextInt(8);
            this.board[row][col] = i;
        }
    }
}
