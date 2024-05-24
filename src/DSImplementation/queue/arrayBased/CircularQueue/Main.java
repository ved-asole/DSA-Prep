package DSImplementation.queue.arrayBased.CircularQueue;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        CircularQueue newSQ = new CircularQueue(5);
        System.out.println("CircularQueue is full : " + newSQ.isFull());
        System.out.println("CircularQueue : " + Arrays.toString(newSQ.arr));

        newSQ.enQueue(5);
        newSQ.enQueue(10);
        newSQ.enQueue(15);
        newSQ.enQueue(20);
        newSQ.enQueue(95);
        newSQ.enQueue(100);

        System.out.println("CircularQueue is full : " + newSQ.isFull());
        System.out.println("CircularQueue : " + Arrays.toString(newSQ.arr));

        int value = newSQ.deQueue();
        System.out.println("Dequeued value: " + value);
        System.out.println("CircularQueue : " + Arrays.toString(newSQ.arr));

        int topValue = newSQ.peek();
        System.out.println("Peek value: " + topValue);

        newSQ.deleteQueue();

    }

}
