public class Board {

    public String[] board = new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9"};


    public void resetBoard(){
            for ( int i = 0; i < board.length;i++){
                // brauche funktion um int in string zu kriegen
                // board neu befüllen
                System.out.println(board[i]);
        }


    }




    String setBoard(int wert, int player) {
        // Wenn Spieler 1 dann Wert O, wenn Spieler 2 dann X
        if (player == 1  ){
            return board[wert] = "X";
        } else  {
            return board[wert] = "O";
        }


    }
    void showBoard() {

        System.out.println("=======");
        System.out.println(board[0] + " " + board[1] + " " + board[2] );
        System.out.println(board[3] + " " + board[4] + " " + board[5] );
        System.out.println(board[6] + " " + board[7] + " " + board[8] );
        System.out.println("=======");

    }
    boolean checkBoard() {
        if (board[0] == board[1] && board[0] == board[2]) {
            return true;
        } else if (board[3] == board[4] && board[3] == board[5]) {
            return true;
        }
        else if (board[6] == board[7] && board[6] == board[8]) {
            return true;
        }
        else if (board[0] == board[4] && board[4] == board[8]) {
            return true;
        }
        else if (board[2] == board[4] && board[4] == board[6]) {
            return true;
        }
        return false;
    }



}
