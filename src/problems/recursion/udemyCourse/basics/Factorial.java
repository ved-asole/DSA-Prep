package problems.recursion.udemyCourse.basics;

public class Factorial {

    //Problem : Find the factorial of a positive integer number

    public static void main(String[] args) {
        int n = 5;
        int factorial = factorial(n);
        System.out.format("The factorial of %d is %d", n, factorial);
    }

    public static int factorial(int n){
        if (n<=1) return 1;
        return n * factorial(n-1);
    }

}
