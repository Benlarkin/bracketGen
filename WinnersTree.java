// package bracketGen;
import java.util.*;

public class WinnersTree{
    private Node root;

    public WinnersTree() {
    }

    public WinnersTree(Node root) {
        this.root = root;
    }

    public Node getRoot() {
        return this.root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public WinnersTree root(Node root) {
        this.root = root;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof WinnersTree)) {
            return false;
        }
        WinnersTree winnersTree = (WinnersTree) o;
        return Objects.equals(root, winnersTree.root);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(root);
    }

    @Override
    public String toString() {
        return "{" +
            " root='" + getRoot() + "'" +
            "}";
    }
}