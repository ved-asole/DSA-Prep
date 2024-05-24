package DSImplementation.queue.arrayBased.CircularQueue;

public class CircularQueue {

    int[] arr;
    int topOfQueue;
    int beginningOfQueue;
    int size;

    // Time complexity = O(1) and Space Complexity = O(N)
    public CircularQueue(int size) {
        this.arr = new int [size];
        this.size = size;
        this.beginningOfQueue = -1;
        this.topOfQueue = -1;
        System.out.println("The CircularQueue has been successfully created with size of " + size);
    }

    // Time complexity = O(1) and Space Complexity = O(1)
    public boolean isEmpty(){
        return topOfQueue == -1;
    }

    // Time complexity = O(1) and Space Complexity = O(1)
    public boolean isFull(){
        if (topOfQueue+1 == beginningOfQueue) return true;
        else if (beginningOfQueue == 0 && topOfQueue+1 == size) return true;
        else return false;
    }

    // Time complexity = O(1) and Space Complexity = O(1)
    public void enQueue(int value) {
        if (isFull()) {
            System.out.println("The CircularQueue is full!");
        } else if (isEmpty()){
            beginningOfQueue = 0;
            topOfQueue++;
            arr[beginningOfQueue] = value;
            System.out.println("Successfully inserted " + value + " in the queue");
        } else {
            if (topOfQueue+1 == size) {
                topOfQueue = 0;
            } else topOfQueue++;
            arr[topOfQueue] = value;
            System.out.println("Successfully inserted " + value + " in the queue");
        }
    }

    // Time complexity = O(1) and Space Complexity = O(1)
    public int deQueue() {
        if (isEmpty()) {
            System.out.println("CircularQueue is empty!");
            return -1;
        } else {
            int result  = arr[beginningOfQueue];
            arr[beginningOfQueue] = 0;
            if (beginningOfQueue == topOfQueue) beginningOfQueue = topOfQueue = -1;
            else if (beginningOfQueue+1 == size) {
                beginningOfQueue=0;
            } else beginningOfQueue++;
            return result;
        }
    }

    // Time complexity = O(1) and Space Complexity = O(1)
    public int peek(){
        if (isEmpty()) {
            System.out.println("The CircularQueue is empty!");
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
        size = 0;
        System.out.println("The queue is successfully deleted!");
    }

}