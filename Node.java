// package bracketGen;
import java.util.*;

public class Node{
    private Player player;
    private Node left;
    private Node right;

    public Node(Player player) {
        this.player = player;
        right = null;
        left = null;
    }

    public Node() {
    }

    public Node(Player player, Node left, Node right) {
        this.player = player;
        this.left = left;
        this.right = right;
    }

    public Player getPlayer() {
        return this.player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Node getLeft() {
        return this.left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return this.right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public Node player(Player player) {
        this.player = player;
        return this;
    }

    public Node left(Node left) {
        this.left = left;
        return this;
    }

    public Node right(Node right) {
        this.right = right;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Node)) {
            return false;
        }
        Node node = (Node) o;
        return Objects.equals(player, node.player) && Objects.equals(left, node.left) && Objects.equals(right, node.right);
    }

    @Override
    public int hashCode() {
        return Objects.hash(player, left, right);
    }

    @Override
    public String toString() {
        return "{" +
            " player='" + getPlayer() + "'" +
            ", left='" + getLeft() + "'" +
            ", right='" + getRight() + "'" +
            "}";
    }
}