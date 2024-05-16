package DSImplementation.stack.linkedListBasedStack;

public class Main {

    public static void main(String[] args) {

        //LinkedList Based Stack
        Stack stack = new Stack();
        stack.push(5);
        stack.push(10);
        stack.push(5);
        stack.push(8);
        stack.push(10);

        int result = stack.pop();
        System.out.println(result);
        stack.push(25);
        System.out.println(stack.peek());

    }

}
