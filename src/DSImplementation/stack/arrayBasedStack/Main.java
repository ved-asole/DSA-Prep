package DSImplementation.stack.arrayBasedStack;

public class Main {

    public static void main(String[] args) {

        //Array Based Stack
        Stack stack = new Stack(4);
        stack.push(5);
        stack.push(10);
        stack.push(5);
        stack.push(8);
        stack.push(10);

        int result = stack.pop();
        System.out.println(result);
        stack.push(10);
        System.out.println(stack.peek());

    }

}
