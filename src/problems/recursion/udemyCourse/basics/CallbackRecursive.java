package problems.recursion.udemyCourse.basics;

import java.util.Arrays;

public class CallbackRecursive {

    // Problem : Write a recursive function called someRecursive which accepts an array and a callback.
    // The function returns true if a single value in the array returns true when passed to the callback. Otherwise it returns false.

    public static void main(String[] args) {
        OddFunction isOdd = new OddFunction();
        boolean b1 = someRecursive(new int[]{1, 2, 3, 4}, isOdd);// true
        System.out.println(b1);
        boolean b2 = someRecursive(new int[]{4, 6, 8, 9}, isOdd);// true
        System.out.println(b2);
        boolean b3 = someRecursive(new int[]{4, 6, 8}, isOdd);// false
        System.out.println(b3);
    }

    public static boolean someRecursive(int[] arr, OddFunction odd) {
        if (arr.length == 0 ) return false;
        else if (odd.run(arr[0]) == false) {
            return someRecursive(Arrays.copyOfRange(arr, 1, arr.length), odd);
        } else {
            return true;
        }
    }

    static class OddFunction {
        boolean run(int num) {
            if (num % 2 == 0) {
                return false; }
            else {
                return true;
            }
        }
    }

}
