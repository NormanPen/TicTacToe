public class Game {
    public static void main(String[] args) {
        System.out.println("Start Tic Tac Toe");

        // Initiiert 2 Spieler,holt sich vom Nutzer Namen und setzt Score auf 0
        Player player1 = new Player();
        Player player2 = new Player();
        player1.getName();
        player2.getName();
        player1.setScore(0);
        player2.setScore(0);

        // Initiiert Spielbrett, zeigt Spielbrett an und zeigt den Score an
        Board board = new Board();
        board.initiateBoard();
        board.showBoard();
        player1.showScore();
        player1.showScore();

        // Spiel startet Schleife
        int turn = 0; // Variable welcher Spieler dran ist
        board.setBoard(player1.move()); //Spieler 1 macht Zug und verändert das Board Array
        board.showBoard(); // Zeigt Board an
        board.checkBoard();// Board wird überprüft ( Auslagern in Game) gibt bool zurück
        // check win muss hier hin
        board.setBoard(player2.move()); //Spieler 2 macht Zug und verändert das Board Array
        board.showBoard(); // Zeigt Board an
        board.checkBoard();// Board wird überprüft ( Auslagern in Game) gibt bool zurück
        // check win muss hier hin
        // Schleife mit frage ob neustart oder beenden





    }
}
