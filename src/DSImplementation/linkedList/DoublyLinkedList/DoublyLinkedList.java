package DSImplementation.linkedList.DoublyLinkedList;

public class DoublyLinkedList {

    public DoublyNode head;
    public DoublyNode tail;
    public int size;

    //Creating a Doubly Linked List
    // Time complexity = O(1) and Space Complexity = O(1)
    public DoublyNode createDLL(int nodeValue) {
        DoublyNode node = new DoublyNode();
        node.value = nodeValue;
        node.next = null;
        node.prev = null;
        head = node;
        tail = node;
        size=1;
        return head;
    }

    //Inserting a value in Doubly Linked List
    // Time complexity = O(N) and Space Complexity = O(1)
    public void insertDLL(int nodeValue, int location) {
        if(head == null) {
            createDLL(nodeValue);
            return;
        }
        DoublyNode newNode = new DoublyNode();
        newNode.value = nodeValue;
        if (location == 0){
            newNode.next = head;
            newNode.prev = null;
            head.prev = newNode;
            head = newNode;
        } else if (location >= size) {
            newNode.prev = tail;
            newNode.next = null;
            tail.next = newNode;
            tail = newNode;
        } else {
            DoublyNode tempNode = head;
            for (int i = 0; i < location-1; i++) {
                tempNode = tempNode.next;
            }
            newNode.next = tempNode.next;
            newNode.prev = tempNode;
            tempNode.next.prev = newNode;
            tempNode.next = newNode;
        }
        size++;
    }

    // Traversing a Doubly Linked List
    // Time complexity = O(N) and Space Complexity = O(1)
    public void traverseDLL() {
        if(head == null) {
            System.out.println("DoublyLinkedList does not exist!");
            return;
        } else {
            DoublyNode currentNode = head;
            for (int i = 0; i < size; i++) {
                System.out.print(currentNode.value);
                if (i != size - 1) {
                    System.out.print(" -> ");
                }
                currentNode = currentNode.next;
            }
            System.out.println();
        }
    }

    // Reverse Traversing a Doubly Linked List
    // Time complexity = O(N) and Space Complexity = O(1)
    public void reverseTraverseDLL() {
        if(head == null) {
            System.out.println("DoublyLinkedList does not exist!");
            return;
        } else {
            DoublyNode currentNode = tail;
            for (int i = 0; i < size; i++) {
                System.out.print(currentNode.value);
                if (i != size - 1) {
                    System.out.print(" <- ");
                }
                currentNode = currentNode.prev;
            }
            System.out.println();
        }
    }

    // Searching a value in Doubly Linked List
    // Time complexity = O(N) and Space Complexity = O(1)
    public boolean searchDLL(int nodeValue) {
        if(head != null) {
            DoublyNode tempNode = head;
            for (int i = 0; i < size; i++) {
                if(tempNode.value == nodeValue){
                    System.out.println("The Node is found at location : " + i);
                    return true;
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println("Node not found!");
        return false;
    }

    // Deleting a node in Doubly Linked List
    // Time complexity = O(N) and Space Complexity = O(1)
    public boolean deleteNodeDLL(int location) {
        if(head==null) {
            System.out.println("DoublyLinkedList does not exist!");
            return false;
        } else if(location == 0) {
            head = head.next;
            head.prev = null;
        } else if(location>=size){
            if(size == 1) {
                head = null;
                tail = null;
            }else {
                tail = tail.prev;
                tail.next = null;
            }
        } else {
            DoublyNode tempNode = head;
            for (int i = 0; i < location-1; i++) {
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next;
            tempNode.next.prev = tempNode;
        }
        size--;
        return true;
    }

    // Delete entire Doubly Linked List
    // Time complexity = O(N) and Space Complexity = O(1)
    public void deleteDLL() {
       DoublyNode tempNode = head;
        for (int i = 0; i < size; i++) {
            tempNode.prev = null;
            tempNode = tempNode.next;
        }
        head = null;
        tail = null;
        size = 0;
        System.out.println("The DLL has been deleted!");
    }

}