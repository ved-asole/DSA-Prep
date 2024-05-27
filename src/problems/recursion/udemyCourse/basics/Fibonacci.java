package problems.recursion.udemyCourse.basics;

public class Fibonacci {

    //Problem : Find the nth fibonacci number

    public static void main(String[] args) {
        int n = 5;
        int fibonacci = fibonacci(n);
        System.out.format("The fibonacci of %d! is %d", n, fibonacci);
    }

    public static int fibonacci(int n){
        if(n < 0) return -1;
        if( n == 0 || n == 1) return n;
        return fibonacci(n-1) + fibonacci(n-2);
    }
}
