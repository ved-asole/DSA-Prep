package problems.stack.udemyCourse.threeInOne;

public class Main {

    public static void main(String[] args) {
        ThreeInOne threeInOne = new ThreeInOne(3);

        System.out.println("Stack 0 isEmpty : " + threeInOne.isEmpty(0));
        System.out.println("Stack 1 isEmpty : " + threeInOne.isEmpty(1));
        System.out.println("Stack 2 isEmpty : " + threeInOne.isEmpty(2));

        threeInOne.push(0, 1);
        threeInOne.push(0, 2);
        threeInOne.push(0, 3);
        threeInOne.push(1, 4);
        threeInOne.push(1, 5);
        threeInOne.push(1, 6);
        threeInOne.push(2, 7);
        threeInOne.push(2, 8);
        threeInOne.push(2, 9);

        System.out.println("Stack 0 isFull : " + threeInOne.isFull(0));
        System.out.println("Stack 1 isFull : " + threeInOne.isFull(1));
        System.out.println("Stack 2 isFull : " + threeInOne.isFull(2));

        System.out.println("Stack 0 pop : " + threeInOne.pop(0));
        System.out.println("Stack 1 pop : " + threeInOne.pop(1));
        System.out.println("Stack 2 pop : " + threeInOne.pop(2));

        System.out.println("Stack 0 pop : " + threeInOne.peek(0));
        System.out.println("Stack 1 pop : " + threeInOne.peek(1));
        System.out.println("Stack 2 pop : " + threeInOne.peek(2));

    }

}
