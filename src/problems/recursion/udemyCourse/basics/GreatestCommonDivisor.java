package problems.recursion.udemyCourse.basics;

public class GreatestCommonDivisor {

    //Problem : Find GCD(Greatest Common Divisor) of two numbers using recursion
    // GDC is the largest positive integer that divide the numbers without a remainder
    public static void main(String[] args) {
        int a = 48;
        int b = 18;
        int gdc = gdc(a, b);
        System.out.format("Greatest Common Divisor of %d and %d is %d", a, b, gdc);
    }

    // Using Euclidean Algorithm
    private static int gdc(int a, int b) {
        if( a<0 || b < 0 ) return -1;
        if(b == 0) return a;
        return gdc(b, a%b);
    }

}
