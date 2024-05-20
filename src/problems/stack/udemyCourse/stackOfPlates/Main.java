package problems.stack.udemyCourse.stackOfPlates;

public class Main {

    public static void main(String[] args) {
        SetOfStacks newStack = new SetOfStacks(3);
        newStack.push(1);
        newStack.push(2);
        newStack.push(3);
        newStack.push(4);
        newStack.push(5);
        newStack.push(6);
        newStack.push(7);

        newStack.pop();
        newStack.pop();

        System.out.println(newStack.popAt(0)); //3
        System.out.println(newStack.popAt(0)); //4

    }

}
