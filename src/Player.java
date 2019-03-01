public class Player {

    Board playerBoard;

    public Player(){
        this.playerBoard = new Board();
        playerBoard.placeShips();
    }
}
