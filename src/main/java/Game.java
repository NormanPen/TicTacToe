public class Game {
    public static void main(String[] args) {
        System.out.println(" Tic Tac Toe");

        // Initiiert 2 Spieler,holt sich vom Nutzer Namen und setzt Score auf 0
        Player player1 = new Player();
        Player player2 = new Player();
        player1.inputName();
        player2.inputName();
        int player = 1;


        // Initiiert Spielbrett, zeigt Spielbrett an und zeigt den Score an
        Board board = new Board();
        board.showBoard();

        // Gameloop, wiederholt sich bis Gewinner ermittelt und Spieler Spiel beendet


        String helper = "y";
        if ( helper == "y") {
            while (board.checkBoard() == false ){
                if ( player == 1) {
                    board.setBoard(player1.move(),1);
                    player = 2;
                    board.showBoard();

                } else if ( player == 2) {
                    board.setBoard(player2.move(), 2);
                    player = 1;
                    board.showBoard();
                }
            }
            System.out.println("Gewonnen");
            board.resetBoard();

        }



    }



}
