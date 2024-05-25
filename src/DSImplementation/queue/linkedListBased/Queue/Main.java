package DSImplementation.queue.linkedListBased.Queue;


public class Main {

    public static void main(String[] args) {

        Queue llQueue = new Queue();
        System.out.println("Queue is empty : " + llQueue.isEmpty());

        llQueue.enQueue(5);
        llQueue.enQueue(10);
        llQueue.enQueue(15);
        llQueue.enQueue(20);
        llQueue.enQueue(95);
        llQueue.enQueue(100);

        int value = llQueue.deQueue();
        System.out.println("Dequeued value: " + value);

        int topValue = llQueue.peek();
        System.out.println("Peek value: " + topValue);

        llQueue.deleteQueue();

    }

}
