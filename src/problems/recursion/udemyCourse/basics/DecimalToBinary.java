package problems.recursion.udemyCourse.basics;

public class DecimalToBinary {

    //Problem : Convert a number from Decimal to Binary using recursion

    public static void main(String[] args) {
        int n = 10;
        int decimalToBinary = decimalToBinary(n);
        System.out.format("The Decimal to Binary value of %d is %d", n, decimalToBinary);
    }

    public static int decimalToBinary(int n){
        if(n == 0) return n;
        return n%2 + 10*decimalToBinary(n/2);
    }

}
