package DSImplementation.stack.arrayBasedStack;

public class Stack {

    public int[] arr;
    public int topOfStack;

    // Time Complexity = O(1) and Space Complexity = O(N)
    public Stack(int size) {
        arr = new int[size];
        topOfStack = -1;
        System.out.println("Stack created with size of " + size);
    }

    public boolean isEmpty(){
        return topOfStack == -1;
    }

    public boolean isFull() {
        return topOfStack == arr.length-1;
    }

    // Time Complexity = O(1) and Space Complexity = O(1)
    public void push(int value) {
        if(isFull()) {
            System.out.println("Stack is full!");
        } else {
            arr[topOfStack+1] = value;
            topOfStack++;
            System.out.println("The value is successfully inserted");
        }
    }

    // Time Complexity = O(1) and Space Complexity = O(1)
    public int pop() {
        if(isEmpty()) {
            System.out.println("Stack is empty!");
            return -1;
        } else {
            int value = arr[topOfStack];
            arr[topOfStack] = Integer.MIN_VALUE;
            topOfStack--;
            return value;
        }
    }

    // Time Complexity = O(1) and Space Complexity = O(1)
    public int peek() {
        if(isEmpty()) {
            System.out.println("Stack is empty!");
            return -1;
        } else return arr[topOfStack];
    }

    // Time Complexity = O(1) and Space Complexity = O(1)
    public void deleteStack() {
        arr = null;
        topOfStack = -1;
        System.out.println("The stack is successfully deleted");
    }

}
