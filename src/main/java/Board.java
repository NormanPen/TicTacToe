public class Board {

    public String[] board;

    public String[] initiateBoard(){
        board  = new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9"};
        return board;
    }

    String setBoard(int wert) {
        // Wenn Spieler 1 dann Wert O
        // Wenn Spieler 2 dann Wert X
       return board[wert] = "A";
    }
    void showBoard() {
        System.out.println(board[0] + " " + board[1] + " " + board[2] );
        System.out.println(board[3] + " " + board[4] + " " + board[5] );
        System.out.println(board[6] + " " + board[7] + " " + board[8] );
        System.out.println("=======");

    }
    boolean checkBoard() {
        if (board[0] == board[1] && board[0] == board[2]) {
            return true;
        } return false;
    }



}
