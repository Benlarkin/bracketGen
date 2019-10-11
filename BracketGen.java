package bracketGen;
import java.util.*;

public class BracketGen {
    private static Bracket bracket = new Bracket();

    public static void main(String[] args) {
        getUserInput();
    }

    public static void getUserInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many players are playing in the bracket? (powers of 2 only, e.g. 2, 4, 8, 16, 32)");
        int numPlayers = sc.nextInt();
        System.out.println("Input your player names, followed by enter (e.g. Tom /enter/ Ben /enter/)");
        for (int i = 0; i < numPlayers; i++) {
            bracket.addPlayer(sc.next());
        }
        sc.close();
    }

}