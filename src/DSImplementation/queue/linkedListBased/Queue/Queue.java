package DSImplementation.queue.linkedListBased.Queue;

public class Queue {

    LinkedList list;

    // Time complexity = O(1) and Space Complexity = O(1)
    public Queue() {
        list = new LinkedList();
        System.out.println("The Queue is successfully created");
    }

    // Time complexity = O(1) and Space Complexity = O(1)
    public boolean isEmpty(){
        return list.head == null;
    }

    // Time complexity = O(1) and Space Complexity = O(1)
    public void enQueue(int value) {
        list.insertInSinglyLinkedList(value, list.size);
    }

    // Time complexity = O(1) and Space Complexity = O(1)
    public int deQueue() {
       int value = -1;
       if(isEmpty()) System.out.println("Queue is empty!");
       else {
           value = list.head.value;
           list.deletionOfNode(0);
       }
       return value;
    }

    // Time complexity = O(1) and Space Complexity = O(1)
    public int peek(){
        if(isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        else return list.head.value;
    }

    // Time complexity = O(1) and Space Complexity = O(1)
    public void deleteQueue(){
        list.head = null;
        list.tail = null;
        list.size = 0;
        System.out.println("The Queue is successfully deleted!");
    }

}