package training.softwire;

public class Main {

    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add("One");
        myLinkedList.add("Two");
        myLinkedList.add("Three");
        myLinkedList.add("Four");
        myLinkedList.add("Five");

        printList(myLinkedList);
        myLinkedList.remove(0);
        printList(myLinkedList);
        myLinkedList.remove(2);
        printList(myLinkedList);
    }

    private static void printList(MyLinkedList myLinkedList) {
        System.out.println(" ");
        for (String value : myLinkedList.getContent()) {
            System.out.println(value);
        }
    }
}
