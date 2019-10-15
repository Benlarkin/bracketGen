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
// package bracketGen;

import java.util.*;

public class Bracket {
    private static ArrayList<Player> players = new ArrayList<Player>();
    private static WinnersTree bracket = new WinnersTree();

    public Bracket() {
    }

    public void addPlayer(Player p){
        players.add(p);
    }
    // @Override
    // public boolean equals(Object o) {
    //     if (o == this)
    //         return true;
    //     if (!(o instanceof Bracket)) {
    //         return false;
    //     }
    //     Bracket bracket = (Bracket) o;
    //     return Object.equals(players, bracket.players) && Objects.equals(bracket, bracket.bracket);
    // }

    @Override
    public int hashCode() {
        return Objects.hash(players, bracket);
    }

    @Override
    public String toString() {
        return "{" + "}";
    }
}