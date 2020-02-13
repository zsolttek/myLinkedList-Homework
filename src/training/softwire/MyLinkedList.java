package training.softwire;

public class MyLinkedList {

    private Node head = null;
    private int numberOfElements = 0;

    public String[] getContent() {
        determineNumberOfElements();
        String[] result = new String[numberOfElements];
        if (numberOfElements == 0) {
            return result;
        }

        int index = 0;
        Node lastNode = head;
        while (index < numberOfElements) {
            result[index] = lastNode.getValue();
            lastNode = lastNode.getNextNode();
            index++;
        }

        return result;
    }


    public void remove(Integer index) {
        determineNumberOfElements();
        if (index > numberOfElements - 1) {
            System.out.println("Index out of bound!");
        }

        Node nodeToBeRemoved = findNote(index);

        if (nodeToBeRemoved.equals(this.head)) {
            if (head.getNextNode() != null) {
                this.head = head.getNextNode();
            } else {
                this.head = null;
            }
        } else {
            Node lastNode = head;
            boolean flag = true;
            while (flag) {
                if (lastNode.getNextNode().equals(nodeToBeRemoved)) {
                    if (nodeToBeRemoved.getNextNode() != null) {
                        lastNode.setNextNode(nodeToBeRemoved.getNextNode());
                        flag = false;
                    } else { //last element
                        lastNode.setNextNode(null);
                        flag = false;
                    }
                }
                lastNode = lastNode.getNextNode();
            }
        }

    }

    private Node findNote(int i) {
        int counter = 0;
        Node lastNode = head;

        while (lastNode.getNextNode() != null) {
            if (counter == i) {
                break;
            }
            lastNode = lastNode.getNextNode();
            counter++;
        }

        return lastNode;
    }

    private void determineNumberOfElements() {

        if (head != null && head.getNextNode() == null) {
            this.numberOfElements = 1;
        } else {
            Node lastNode = head;
            numberOfElements = 1;
            while (lastNode.getNextNode() != null) {
                numberOfElements++;
                lastNode = lastNode.getNextNode();
            }
        }
    }

    public boolean contains(String text) {
        if (head == null) {
            return false;
        }

        Node lastNode = head;
        if (head.getValue().equals(text)) {
            return true;
        }

        while (lastNode.getNextNode() != null) {
            if (lastNode.getValue().equals(text)) {
                return true;
            }
            lastNode = lastNode.getNextNode();
        }

        return false;
    }

    public void add(String text) {
        Node node = new Node(text);
        if (head == null) {
            this.head = node;
        } else {
            Node lastNote = getLast();
            lastNote.setNextNode(node);
        }
    }

    private Node getLast() {
        if (head.getNextNode() == null) {
            return head;
        } else {
            Node lastNode = head.getNextNode();
            while (lastNode.getNextNode() != null) {
                lastNode = lastNode.getNextNode();
            }
            return lastNode;
        }

    }
}

