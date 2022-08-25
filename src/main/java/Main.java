public class Main {
    public static void main(String[] args) {
        System.out.println(" Tic Tac Toe");

        // Initiiert 2 Spieler,holt sich vom Nutzer Namen und setzt Score auf 0
        Player player1 = new Player();
        Player player2 = new Player();
        player1.getName();
        player2.getName();
        int player = 0;


        // Initiiert Spielbrett, zeigt Spielbrett an und zeigt den Score an
        Board board = new Board();
        board.initiateBoard();
        board.showBoard();




        while (player == 0 ){
            board.setBoard(player1.move());
        }

        /*
        // Spiel startet Schleife solange checkBoard == false ist
        int turn = 0; // Variable welcher Spieler dran ist
        //if checkBoard = false
            board.setBoard(player1.move()); //Spieler 1 macht Zug und verändert das Board Array
            board.showBoard(); // Zeigt Board an
            board.checkBoard();// Board wird überprüft ( Auslagern in Game) gibt bool zurück
            // check win muss hier hin
        // else
            board.setBoard(player2.move()); //Spieler 2 macht Zug und verändert das Board Array
            board.showBoard(); // Zeigt Board an
            board.checkBoard();// Board wird überprüft ( Auslagern in Game) gibt bool zurück
            // check win muss hier hin

        board.setBoard(player1.move());
        board.showBoard();
        board.checkBoard();
        // Überprüfung ob win
        if(board.checkBoard() == true) {
            System.out.println("win");
            System.out.println("Noch mal oder Beenden? y/n");
        } else  {
            System.out.println("lose");
        }
     */

    }





}
