package DSImplementation.linkedList.DoublyLinkedList;

public class Main {

    public static void main(String[] args) {

        DoublyLinkedList dLL = new DoublyLinkedList();

        dLL.createDLL(20);

        dLL.traverseDLL();

        dLL.insertDLL(30,0);
        dLL.insertDLL(10,1);
        dLL.insertDLL(40,3);
        dLL.insertDLL(50,2);

        dLL.traverseDLL();

        dLL.reverseTraverseDLL();

        dLL.searchDLL(40);
        dLL.searchDLL(29);

        dLL.traverseDLL();

        dLL.deleteNodeDLL(2);

        dLL.traverseDLL();

        dLL.deleteDLL();

        dLL.traverseDLL();

    }

}

