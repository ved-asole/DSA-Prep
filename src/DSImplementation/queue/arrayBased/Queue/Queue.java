package DSImplementation.queue.arrayBased.Queue;

public class Queue {

    int[] arr;
    int topOfQueue;
    int beginningOfQueue;

    // Time complexity = O(1) and Space Complexity = O(N)
    public Queue(int size) {
        arr = new int[size];
        topOfQueue = -1;
        beginningOfQueue = -1;
        System.out.println("Created queue with the size of " + size);
    }

    // Time complexity = O(1) and Space Complexity = O(1)
    public boolean isEmpty(){
        return beginningOfQueue == -1 || beginningOfQueue == arr.length;
    }

    // Time complexity = O(1) and Space Complexity = O(1)
    public boolean isFull(){
        return topOfQueue == arr.length-1;
    }

    // Time complexity = O(1) and Space Complexity = O(1)
    public void enQueue(int value) {
        if(isFull()) System.out.println("The Queue is Full");
        else if(isEmpty()){
            beginningOfQueue = 0;
            topOfQueue= 0;
            arr[topOfQueue] = value;
            System.out.println("Successfully inserted " + value + " in the queue");
        } else {
            topOfQueue++;
            arr[topOfQueue] = value;
            System.out.println("Successfully inserted " + value + " in the queue");
        }
    }

    // Time complexity = O(1) and Space Complexity = O(1)
    public int deQueue() {
        if(isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        } else {
            int result = arr[beginningOfQueue];
            beginningOfQueue++;
            if (beginningOfQueue > topOfQueue) {
                beginningOfQueue = topOfQueue = -1;
            }
            return result;
        }
    }

    // Time complexity = O(1) and Space Complexity = O(1)
    public int peek(){
        if(isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        } else {
            return arr[beginningOfQueue];
        }
    }

    // Time complexity = O(1) and Space Complexity = O(1)
    public void deleteQueue(){
        arr = null;
        beginningOfQueue = -1;
        topOfQueue = -1;
        System.out.println("The queue is successfully deleted!");
    }

}