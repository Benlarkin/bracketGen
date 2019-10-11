/*
 * The storage of the bracket is based off of a "winner's tree" which is a complete binary tree. 
 * Every external node represents a player and every internal node represents a winner.
 * The root of the tree is the winner of the tournament.
 * 
 * Author: Benjamin Larkin
 * Purpose: represent single elimination 1-player-per-team Ping Pong tournaments.
 * Inspired by challonge.com
 * 
 * example. 8 wins tournament after defeating 2 and 3 (single elim)
 *               8
 *             /   \
              8     3
             / \   / \
            2  8   3  5

*/
package bracketGen;
import java.util.*;

public class Bracket{
    private static ArrayList<Player> players = new ArrayList<Player>();

    public static void addPlayer(String player){
        players.add(new Player(player));
    }
}
