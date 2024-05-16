package DSImplementation.stack.linkedListBasedStack;

public class LinkedList {

    public Node head;
    public Node tail;
    public int size;

    // Create a singly linked list
    // Time Complexity: O(1) and Space Complexity: O(1)
    public Node createLinkedList(int nodeValue) {
        head = new Node();
        Node node = new Node();
        node.next = null;
        node.value = nodeValue;
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    // Adding an element to the Singly Linked List
    // Time Complexity = O(N) and Space Complexity = O(1)
    public void insertInLinkedList(int nodeValue, int location) {
        Node node = new Node();
        node.value = nodeValue;
        if (head == null) {
            createLinkedList(nodeValue);
            return;
        } else if (location == 0) {
            node.next = head;
            head = node;
        } else if (location >= size) {
            node.next = null;
            tail.next = node;
            tail = node;
        } else {
            Node tempNode = head;
            int index = 0;

            while (index < location - 1) {
                tempNode = tempNode.next;
                index++;
            }
            node.next = tempNode.next;
            tempNode.next = node;
        }
        size++;
    }

    // Traversing through Singly Linked List
    // Time Complexity = O(N) and Space Complexity = O(1)
    public void traverseLinkedList() {

        if (head == null) {
            System.out.print("LinkedList does not exist!");
            return;
        } else {
            Node tempNode = head;

            for (int i = 0; i < size; i++) {
                System.out.print(tempNode.value);
                if (i != size - 1) System.out.print(" -> ");
                tempNode = tempNode.next;
            }
        }
        System.out.println();
    }

    // Searching an element in Singly Linked List
    // Time Complexity = O(N) and Space Complexity = O(1)
    public boolean searchElement(int nodeValue) {
        if (head != null) {

            Node tempNode = head;
            for (int i = 0; i < size; i++) {
                if (tempNode.value == nodeValue) {
                    System.out.format("Element found at the location of %d %n", i);
                    return true;
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println("Node not found!");
        return false;
    }

    // Deleting an element in Singly Linked List
    // Time Complexity = O(N) and Space Complexity = O(1)
    public void deletionOfNode(int location) {

        //If list does not exist
        if (head == null) {
            System.out.println("LinkedList does not exist!");
            return;
        }
        //If we need to delete first element
        else if (location == 0) {
            head = head.next;
            size--;
            //Check if after removing the element, list got empty and remove tail accordingly
            if (size == 0) tail = null;
        }
        //If location is at last or greater than that
        else if (location >= size) {
            Node tempNode = head;
            for (int i = 0; i < size - 1; i++) {
                tempNode = tempNode.next;
            }
            //Check if after removing the element, list got empty and update head and tail accordingly
            if (tempNode == head) {
                tail = head = null;
                size--;
                return;
            }
            tempNode.next = null;
            tail = tempNode;
            size--;
        }
        //If location comes in between the head and tail of the list
        else {
            Node tempNode = head;
            for (int i = 0; i < location - 1; i++) {
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next;
            size--;
        }

    }

    // Deleting an element in Singly Linked List
    // Time Complexity = O(1) and Space Complexity = O(1)
    public void deleteLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }
}