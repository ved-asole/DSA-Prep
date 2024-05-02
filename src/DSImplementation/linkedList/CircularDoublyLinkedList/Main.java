package DSImplementation.linkedList.CircularDoublyLinkedList;

public class Main {

    public static void main(String[] args) {

        CircularDoublyLinkedList cdLL = new CircularDoublyLinkedList();

        cdLL.createCDLL(20);
        cdLL.traverseCDLL();

        cdLL.insertCDLL(30,0);
        cdLL.insertCDLL(40,1);
        cdLL.insertCDLL(50,2);
        cdLL.traverseCDLL();

        cdLL.reverseTraverseCDLL();

        cdLL.searchCDLL(50);
        cdLL.searchCDLL(20);

        cdLL.deleteNodeCDLL(2);
        cdLL.traverseCDLL();

        cdLL.deleteCDLL();
        cdLL.traverseCDLL();

    }

}

