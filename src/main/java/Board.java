public class Board {

    public String[] board;


    void initiateBoard(){
        board  = new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9"};
    }

    void setBoard(int wert) {
       board[wert] = "A";
    }
    void showBoard() {
        System.out.println(board[0] + " " + board[1] + " " + board[2] );
        System.out.println(board[3] + " " + board[4] + " " + board[5] );
        System.out.println(board[6] + " " + board[7] + " " + board[8] );
        System.out.println("=======");

    }
    boolean checkBoard() {
        System.out.println("nicht gewonnen");
        return false;
    }





}
