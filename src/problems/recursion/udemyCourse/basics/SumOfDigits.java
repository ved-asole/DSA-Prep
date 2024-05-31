package problems.recursion.udemyCourse.basics;

public class SumOfDigits {

    //Problem : Find the sum of digits of a positive integer number using recursion

    public static void main(String[] args) {
        int n = 253;
        int sumOfDigits = sumOfDigits(n);
        System.out.format("The factorial of %d is %d", n, sumOfDigits);
    }

    public static int sumOfDigits(int n){
        if( n < 0 ) return -1;
        if(n > 0 && n<10) return n;
        return n%10 + sumOfDigits(n/10);
    }
}
