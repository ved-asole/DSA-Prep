package DSImplementation.linkedList.CircularSinglyLinkedList;

public class CircularSinglyLinkedList {

    public Node head;
    public Node tail;
    public int size;

    // Create a Circular Singly Linked List
    // Time complexity = O(1) and Space Complexity = O(1)
    public Node createCSLL(int nodeValue) {
        Node node = new Node();
        node.value = nodeValue;
        node.next = node;
        head = node;
        tail = node;
        size=1;
        return head;
    }

    // Insert an element to a Circular Singly Linked List
    // Time complexity = O(N) and Space Complexity = O(1)
    public void insertCSLL(int nodeValue, int location){
        Node node = new Node();
        node.value = nodeValue;

        if(head == null) {
            createCSLL(nodeValue);
            return;
        } else if(location == 0){
            node.next = head;
            head = node;
            tail.next = head;
        } else if(location >= size) {
            tail.next = node;
            tail = node;
            node.next = head;
        } else {
            Node tempNode = head;
            int index = 0;
            while (index < location - 1) {
                tempNode = tempNode.next;
            }
            node.next = tempNode.next;
            tempNode.next = node;
        }
        size++;
    }

    // Traverse a Circular Singly Linked List
    // Time complexity = O(N) and Space Complexity = O(1)
    public void traverseCSLL() {
        if(head == null) {
            System.out.print("CircularSinglyLinkedList does not exist!");
            return;
        } else {
            Node tempNode = head;
            for (int i = 0; i < size; i++) {
                System.out.print(tempNode.value);
                if(i != size-1) {
                    System.out.print(" -> ");
                }
                tempNode = tempNode.next;
            }
            System.out.println();
        }
    }

    // Searching a value in Circular Singly Linked List
    // Time complexity = O(N) and Space Complexity = O(1)
    public boolean searchCSLL(int nodeValue) {
        if (head != null) {
            Node tempNode =  head;
            for (int i = 0; i < size; i++) {
                if(tempNode.value == nodeValue) {
                    System.out.println("Found node at location : " + i);
                    return true;
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println("Node not found!");
        return false;
    }

    // Delete a node in Circular Singly Linked List
    // Time complexity = O(N) and Space Complexity = O(1)
    public void deleteNode(int location) {
        if (head == null) {
            System.out.println("CircularSinglyLinkedList does not exist!");
            return;
        } else if(location == 0){
            head = head.next;
            tail.next = head;
            if (size == 0) {
                tail = head = null;
            }
        } else if(location >= size){
            Node tempNode = head;
            for(int i = 0; i < size-1; i++) {
               tempNode = tempNode.next;
            }
            if (tempNode == head) {
                tail = head = null;
            }
            tempNode.next = head;
            tail = tempNode;
        } else {
            Node tempNode = head;
            for(int i = 0; i < location-1; i++) {
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next;
        }
        size--;
    }

    // Delete entire Circular Singly Linked List
    // Time complexity = O(1) and Space Complexity = O(1)
    public void deleteCSLL() {
        if (head == null) {
            System.out.println("The CSLL does not exist!");
        } else {
            head = null;
            tail.next = null;
            tail = null;
            System.out.println("The CSLL has been deleted!");
        }
    }

    // ==============================================  Extra Methods ================================================>

    public void append(int value) {
        Node newNode = new Node(value);
        if (this.size == 0) {
            this.head = newNode;
            this.tail = newNode;
            newNode.next = newNode;
        } else {
            this.tail.next = newNode;
            newNode.next = this.head;
            this.tail = newNode;
        }
        this.size++;
    }

    public void prepend(int value) {
        Node newNode = new Node(value);
        if (this.size == 0) {
            this.head = newNode;
            this.tail = newNode;
            newNode.next = newNode;
        } else {
            newNode.next = this.head;
            this.head = newNode;
            this.tail.next = newNode;
        }
        this.size++;
    }

    @Override
    public String toString() {
        if (this.size == 0) {
            return "";
        }

        Node tempNode = this.head;
        StringBuilder result = new StringBuilder();

        do {
            result.append(tempNode.value);
            tempNode = tempNode.next;
            if (tempNode != this.head) {
                result.append(" -> ");
            }
        } while (tempNode != this.head);

        return result.toString();
    }

    public boolean deleteByValue(int value) {
        if (this.size == 0) {
            return false;
        }

        if (this.head == this.tail && this.head.value == value) {
            this.head = null;
            this.tail = null;
            this.size = 0;
            return true;
        }

        Node current = this.head;
        Node prev = null;

        do {
            if (current.value == value) {
                if (current == this.head) {
                    this.head = this.head.next;
                    this.tail.next = this.head;
                } else if (current == this.tail) {
                    prev.next = this.head;
                    this.tail = prev;
                } else {
                    prev.next = current.next;
                }

                this.size--;
                return true;
            }
            prev = current;
            current = current.next;
        } while (current != this.head);

        return false;
    }

    public int countNodes() {
        int count = 0;
        Node temp = this.head;
        if (temp == null) {
            return 0;  // Return 0 immediately if the list is empty
        }

        do {
            count++;  // Increment the count for each node
            temp = temp.next;  // Move to the next node
        } while (temp != this.head);  // Continue until the list cycles back to the head

        return count;  // Return the total count
    }

}
