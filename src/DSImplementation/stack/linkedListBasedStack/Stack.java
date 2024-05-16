package DSImplementation.stack.linkedListBasedStack;

public class Stack {

    public LinkedList linkedList;

    // Time Complexity = O(1) and Space Complexity = O(1)
    public Stack() {
        this.linkedList = new LinkedList();
    }

    public boolean isEmpty() {
        return linkedList.head == null;
    }

    // Time Complexity = O(1) and Space Complexity = O(1)
    public void push(int value){
        linkedList.insertInLinkedList(value, 0);
    }

    // Time Complexity = O(1) and Space Complexity = O(1)
    public int pop() {
        int result = -1;
        if (isEmpty()) System.out.println("Stack is empty!");
        else {
            result = linkedList.head.value;
            linkedList.deletionOfNode(0);
        }
        return result;
    }

    // Time Complexity = O(1) and Space Complexity = O(1)
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return -1;
        } else {
            return linkedList.head.value;
        }
    }

    // Time Complexity = O(1) and Space Complexity = O(1)
    public void deleteStack() {
        linkedList.deleteLinkedList();
        System.out.println("The Stack is deleted!");
    }

}
