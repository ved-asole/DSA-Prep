package DSImplementation.linkedList.SinglyLinkedList;

public class SinglyLinkedList {

    public Node head;
    public Node tail;
    public int size;

    // Create a singly linked list
    // Time Complexity: O(1) and Space Complexity: O(1)
    public Node createSinglyLinkedList(int nodeValue) {
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
    public void insertInSinglyLinkedList(int nodeValue, int location) {
        Node node = new Node();
        node.value = nodeValue;
        if(head == null) {
            createSinglyLinkedList(nodeValue);
            return;
        } else if(location == 0) {
            node.next = head;
            head = node;
        } else if (location >= size) {
            node.next = null;
            tail.next = node;
            tail = node;
        } else {
            Node tempNode = head;
            int index=0;

            while(index < location-1){
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
    public void traverseSinglyLinkedList() {

        if(head == null) {
            System.out.print("LinkedList does not exist!");
            return;
        }
        else {
            Node tempNode = head;

            for (int i = 0; i < size ; i++) {
                System.out.print(tempNode.value);
                if(i!=size-1) System.out.print(" -> ");
                tempNode = tempNode.next;
            }
        }
        System.out.println();
    }

    // Searching an element in Singly Linked List
    // Time Complexity = O(N) and Space Complexity = O(1)
    public boolean searchElement(int nodeValue) {
        if(head !=null) {

            Node tempNode = head;
            for (int i=0; i < size; i++) {
                if(tempNode.value == nodeValue) {
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
        if(head == null) {
            System.out.println("LinkedList does not exist!");
            return;
        }
        //If we need to delete first element
        else if(location == 0) {
            head=head.next;
            size--;
            //Check if after removing the element, list got empty and remove tail accordingly
            if(size==0) tail=null;
        }
        //If location is at last or greater than that
        else if(location >= size) {
            Node tempNode = head;
            for (int i = 0; i < size-1; i++) {
                tempNode = tempNode.next;
            }
            //Check if after removing the element, list got empty and update head and tail accordingly
            if(tempNode == head) {
                tail = head = null;
                size--;
                return;
            }
            tempNode.next=null;
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
    public void deleteSinglyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    // ---------------------------------------- Extra Methods -------------------------------------------------------------

    // Insert Method LinkedList
    public void push(int nodeValue) {
        if (head == null) {
            createSinglyLinkedList(nodeValue);
            return;
        } else {
            Node node = new Node();
            node.value = nodeValue;
            node.next = null;
            tail.next = node;
            tail = node;
            size++;
        }


    }

    public Node pop() {
        if (head == null) {
            System.out.println("The SLL does not exist");
            return null;
        }
        Node removeNode;
        Node currentNode;
        if (head == tail) {
            removeNode = head;
            head = tail = null;
        } else {
            currentNode = head;
            while (currentNode.next != tail) {
                currentNode = currentNode.next;
            }
            removeNode = currentNode.next;
            currentNode.next = null;
            tail = currentNode;
        }
        size--;

        return removeNode;

    }


    //Get
    public Node get(int index) {
        if (index<0 || index >= size) {
            return null;
        }
        Node currentNode = head;
        for (int i=0; i<index; i++) {
            currentNode = currentNode.next;
        }
        return currentNode;
    }

    //Insert
    public boolean insert(int data, int index) {
        Node newNode = new Node();
        newNode.value = data;
        if (index<0 || index >= size) {
            return false;
        }
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            if (index == 0) {
                newNode.next = head;
                head = newNode;
            } else if (index == 1) {
                newNode.next = head.next;
                head.next = newNode;
            } else if (index == size) {
                tail.next = newNode;
                newNode.next = null;
                tail = newNode;
            } else {
                Node tempNode = head;
                int inx = 0;
                while (inx < index-1) {
                    tempNode = tempNode.next;
                    inx += 1;
                }
                Node nextNode = tempNode.next;
                tempNode.next = newNode;
                newNode.next = nextNode;
            }
        }
        size +=1;
        return true;
    }

    //Remove
    public Node remove(int index) {
        if (index < 0 || index >= size) {
            return null;
        }
        Node removeNode;
        Node currentNode;
        size--;
        if (index == 0) {
            removeNode = head;
            if (head == tail) {
                head = tail = null;
            } else {
                head = head.next;
            }
            return removeNode;
        } else {
            currentNode = head;
            int indx = 0;
            while (indx < index - 1) {
                currentNode = currentNode.next;
                indx++;
            }
            removeNode = currentNode.next;
            Node nextNode = currentNode.next;
            currentNode.next = nextNode.next;
            return removeNode;


        }
    }

    // Set

    public boolean set(int index, int value) {
        if (head == null) {
            head.value = value;
            tail.value = value;
        } else {
            Node currentNode = head;
            for (int i =0; i<index; i++) {
                currentNode = currentNode.next;
                if (currentNode == null) {
                    return false;
                }
            }
            currentNode.value = value;
        }
        return true;
    }

    //Rotate

    public String rotate(int number) {
        int index = number;
        if (number < 0) {
            index = number + size;
        }
        if (index < 0 || index >= size) {
            return null;
        }
        if (index == 0) {
            return "No Rotation";
        }
        Node prevNode = head;
        for(int i=0; i<index-1; i++) {
            prevNode = prevNode.next;
        }
        if (prevNode == null) {
            return "No Rotation";
        }
        tail.next = head;
        head = prevNode.next;
        tail = prevNode;
        prevNode.next = null;
        return "Rotated Successfully";
    }

}