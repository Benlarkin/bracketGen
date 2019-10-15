// package bracketGen;
import java.util.*;

public class Player{
    private String name;
    private int seed;

    public Player() {
    }

    public Player(String name, int seed) {
        this.name = name;
        this.seed = seed;
    }

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSeed() {
        return this.seed;
    }

    public void setSeed(int seed) {
        this.seed = seed;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Player)) {
            return false;
        }
        Player player = (Player) o;
        return Objects.equals(name, player.name) && seed == player.seed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, seed);
    }

    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", seed='" + getSeed() + "'" +
            "}";
    }
}