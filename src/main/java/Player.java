import java.util.Scanner;


public class Player {
    public String name;

    public int score;

    Scanner scanner = new Scanner(System.in);

    void getName() {
        System.out.println("Wie ist dein Name?");
        name = scanner.next();
    }

    int move() {
        System.out.println(name +" du bist am Zug:");
        String playerMove = scanner.next();
        return Integer.valueOf(playerMove )-1;
    }
    void setScore (int score) {
        score = score ++;
    }
    void showScore() {

        System.out.println(name + " dein Score: " + score);
    }


}
