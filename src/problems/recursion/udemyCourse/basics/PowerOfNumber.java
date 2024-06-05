package problems.recursion.udemyCourse.basics;

public class PowerOfNumber {

    //Problem : Calculate the positive power of a positive integer number using recursion

    public static void main(String[] args) {
        int n = 2;
        int exp = 5;
        int powerOfNum = powerOfNum(n, exp);
        System.out.format("The power of %d^%d is %d", n, exp, powerOfNum);
    }

    public static int powerOfNum(int base, int exp){
        if(exp==0) return 1;
        return base * powerOfNum(base, exp-1);
    }

}
