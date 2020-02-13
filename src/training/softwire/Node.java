package training.softwire;

import java.util.Objects;

public class Node {

    private String value;
    private Node nextNode;

    public Node(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Node node = (Node) o;
        return Objects.equals(value, node.value) &&
            Objects.equals(nextNode, node.nextNode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, nextNode);
    }

    @Override
    public String toString() {
        return "Node{" +
            "value='" + value + '\'' +
            '}';
    }
}
