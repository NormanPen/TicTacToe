import java.util.Scanner;


public class Player {
    public String name;


    Scanner scanner = new Scanner(System.in);

    String getName() {
        System.out.println("Wie ist dein Name?");
        return name = scanner.next();
    }

    // Spieler gibt Zahl 1-9 an
    // Zahl wird für das Array um 1 reduziert
    // 0-8 wird zurückgegeben
    int move() {
        System.out.println(name +" du bist am Zug:");
        String playerMove = scanner.next();
        return Integer.valueOf(playerMove )-1;
    }



}
