package DSImplementation.linkedList.CircularDoublyLinkedList;

public class CircularDoublyLinkedList {

    public DoublyNode head;
    public DoublyNode tail;
    public int size;

    //Creating a Circular Doubly Linked List
    // Time complexity = O(1) and Space Complexity = O(1)
    public DoublyNode createCDLL(int nodeValue) {
        DoublyNode newNode = new DoublyNode();
        newNode.value = nodeValue;
        head = newNode;
        tail = newNode;
        newNode.next = newNode;
        newNode.prev = newNode;
        size++;
        return head;
    }

    //Inserting a value in Circular Doubly Linked List
    // Time complexity = O(N) and Space Complexity = O(1)
    public void insertCDLL(int nodeValue, int location) {
        DoublyNode newNode = new DoublyNode();
        newNode.value = nodeValue;
        if(head == null) {
            createCDLL(nodeValue);
            return;
        } else if(location == 0) {
            newNode.next = head;
            newNode.prev = tail;
            head.prev = newNode;
            tail.next = newNode;
            head = newNode;
        } else if(location >= size) {
            newNode.next = head;
            newNode.prev = tail;
            head.prev = newNode;
            tail.next = newNode;
            tail = newNode;
        } else {
            DoublyNode tempNode = head;
            for (int i = 0; i < location - 1; i++) {
                tempNode = tempNode.next;
            }
            newNode.prev = tempNode;
            newNode.next = tempNode.next;
            tempNode.next = newNode;
            newNode.next.prev = newNode;
        }
        size++;
    }

    // Traversing a Circular Doubly Linked List
    // Time complexity = O(N) and Space Complexity = O(1)
    public void traverseCDLL() {
        if(head!=null) {
            DoublyNode tempNode = head;
            for (int i = 0; i < size; i++) {
                System.out.print(tempNode.value);
                if(i!=size-1) {
                    System.out.print(" -> ");
                }
                tempNode = tempNode.next;
            }
            System.out.println();
        } else {
            System.out.println("CircularDoublyLinkedList does not exist!");
        }

    }

    // Reverse Traversing a Circular Doubly Linked List
    // Time complexity = O(N) and Space Complexity = O(1)
    public void reverseTraverseCDLL() {
        if(head!=null) {
            DoublyNode tempNode = tail;
            for (int i = 0; i < size; i++) {
                System.out.print(tempNode.value);
                if(i!=size-1){
                    System.out.print(" <- ");
                }
                tempNode = tempNode.prev;
            }
        } else {
            System.out.println("CircularDoublyLinkedList does not exist!");
        }
        System.out.println();
    }

    // Searching a value in Circular Doubly Linked List
    // Time complexity = O(N) and Space Complexity = O(1)
    public boolean searchCDLL(int nodeValue) {
        if(head!=null) {
            DoublyNode tempNode = head;
            for (int i = 0; i < size; i++) {
                if(tempNode.value == nodeValue || tempNode==tail) {
                    System.out.println("Node found at location : " + i);
                    return true;
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println("Node not found!");
        return false;
    }

    // Deleting a node in Circular Doubly Linked List
    // Time complexity = O(N) and Space Complexity = O(1)
    public void deleteNodeCDLL(int location) {
        if(head == null) {
            System.out.println("CircularLinkedList does not exist!");
            return;
        } else if(location == 0) {
            if(size == 1) {
                head.prev = null;
                head.next = null;
                head = tail = null;
            } else {
                head = head.next;
                head.prev = tail;
                tail.next = head;
            }
        } else if(location >= size) {
            if(size == 1) {
                head.prev = null;
                head.next = null;
                head = tail = null;
            } else {
                tail = tail.prev;
                tail.next = head;
                head.prev = tail;
            }
        } else {
            DoublyNode tempNode = head;
            for (int i = 0; i < location -1; i++) {
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next;
            tempNode.next.prev = tempNode;
        }
        size--;
    }

    // Delete entire Circular Doubly Linked List
    // Time complexity = O(N) and Space Complexity = O(1)
    public void deleteCDLL() {
        DoublyNode tempNode = head;
        for (int i = 0; i < size; i++) {
            tempNode.prev = null;
            tempNode = tempNode.next;
        }
        head = null;
        tail = null;
        System.out.println("The CircularDoublyLinkedList has been deleted");
    }

}