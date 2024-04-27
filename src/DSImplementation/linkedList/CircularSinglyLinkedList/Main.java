package DSImplementation.linkedList.CircularSinglyLinkedList;

public class Main {

    public static void main(String[] args) {

        CircularSinglyLinkedList csLL = new CircularSinglyLinkedList();

        csLL.createCSLL(10);

        csLL.insertCSLL(30, 1);
        csLL.insertCSLL(20, 0);
        csLL.insertCSLL(40, 3);
        csLL.insertCSLL(50, 13);

        csLL.traverseCSLL();

        csLL.searchCSLL(39);
        csLL.searchCSLL(30);

        csLL.traverseCSLL();

        csLL.deleteNode(2);
        csLL.traverseCSLL();

        csLL.deleteCSLL();

        csLL.traverseCSLL();

    }

}

