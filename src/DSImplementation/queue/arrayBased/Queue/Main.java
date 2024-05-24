package DSImplementation.queue.arrayBased.Queue;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Queue arrayQueue = new Queue(5);
        System.out.println("Queue is full : " + arrayQueue.isFull());
        System.out.println("Queue : " + Arrays.toString(arrayQueue.arr));

        arrayQueue.enQueue(5);
        arrayQueue.enQueue(10);
        arrayQueue.enQueue(15);
        arrayQueue.enQueue(20);
        arrayQueue.enQueue(95);
        arrayQueue.enQueue(100);

        System.out.println("Queue is full : " + arrayQueue.isFull());
        System.out.println("Queue : " + Arrays.toString(arrayQueue.arr));

        int value = arrayQueue.deQueue();
        System.out.println("Dequeued value: " + value);

        int topValue = arrayQueue.peek();
        System.out.println("Peek value: " + topValue);

        arrayQueue.deleteQueue();

    }

}
