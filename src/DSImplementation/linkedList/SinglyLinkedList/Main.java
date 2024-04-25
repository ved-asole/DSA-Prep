package DSImplementation.linkedList.SinglyLinkedList;

public class Main {

    public static void main(String[] args) {

        SinglyLinkedList sLL = new SinglyLinkedList();

        sLL.createSinglyLinkedList(10);

        sLL.traverseSinglyLinkedList();

        sLL.insertInSinglyLinkedList(20, 0);
        sLL.insertInSinglyLinkedList(30, 2);
        sLL.insertInSinglyLinkedList(40, 3);

        sLL.traverseSinglyLinkedList();

        sLL.searchElement(30);

        sLL.deletionOfNode(1);

        sLL.traverseSinglyLinkedList();

        System.out.println(sLL.rotate(2));

        sLL.traverseSinglyLinkedList();

        sLL.deleteSinglyLinkedList();

        sLL.traverseSinglyLinkedList();

    }

}
