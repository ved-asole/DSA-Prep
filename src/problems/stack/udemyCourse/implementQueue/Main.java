package problems.stack.udemyCourse.implementQueue;

public class Main {

    public static void main(String[] args) {

        QueueViaStack qvs = new QueueViaStack();

        qvs.enqueue(5);
        qvs.enqueue(10);
        qvs.enqueue(15);
        qvs.enqueue(20);
        qvs.enqueue(95);
        qvs.enqueue(100);

        System.out.println("Newest Stack : " + qvs.stackNewest.toString());
        System.out.println("oldest Stack : " + qvs.stackOldest.toString());

        int value = qvs.dequeue();
        System.out.println("Dequeued value: " + value);

        int topValue = qvs.peek();
        System.out.println("Peek value: " + topValue);

        qvs.enqueue(150);

        System.out.println("Newest Stack : " + qvs.stackNewest.toString());
        System.out.println("oldest Stack : " + qvs.stackOldest.toString());

        int value2 = qvs.dequeue();
        System.out.println("Dequeued value: " + value2);

        qvs.dequeue();
        qvs.dequeue();
        qvs.dequeue();
        qvs.dequeue();

        int value3 = qvs.dequeue();
        System.out.println("Dequeued value: " + value3);

        System.out.println("Newest Stack : " + qvs.stackNewest.toString());
        System.out.println("oldest Stack : " + qvs.stackOldest.toString());

    }

}