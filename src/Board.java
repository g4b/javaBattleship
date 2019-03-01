import java.util.Arrays;
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
        for (int i = 0; i < 4; i++){
            int row = rand.nextInt(8);
            int col = rand.nextInt(8);
            this.board[row][col] = i;
        }
    }

    public String toString() {
        String boardStr = "";
        for (int i = 0; i < 9; i++){
            for (int j = 0; j < 8; j++){
                if (i < 7){
                    boardStr += this.board[i][j];
                } else {
                    boardStr += "\n";
                }
            }
        }
        return boardStr;
    }
}
