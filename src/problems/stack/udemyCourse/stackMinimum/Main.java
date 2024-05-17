package problems.stack.udemyCourse.stackMinimum;

public class Main {

    public static void main(String[] args) {
        StackMin stackMin = new StackMin();

        stackMin.push(16);
        stackMin.push(5);
        stackMin.push(10);
        stackMin.push(3);
        stackMin.push(1);
        stackMin.push(24);

        System.out.println("Top : " + stackMin.top.value);
        System.out.println("Min : " + stackMin.min());

        stackMin.pop();
        stackMin.pop();

        System.out.println("Top : " + stackMin.top.value);
        System.out.println("Min : " + stackMin.min());

        stackMin.pop();

        System.out.println("Top : " + stackMin.top.value);
        System.out.println("Min : " + stackMin.min());


    }

}
