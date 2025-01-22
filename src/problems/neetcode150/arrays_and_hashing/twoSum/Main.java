package problems.neetcode150.arrays_and_hashing.twoSum;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Please enter the size of array: ");
        int n=sc.nextInt();

        int[] arr=new int[n];
        int i=0;
        System.out.println("Enter array elements: ");
        while(n-->0)
        {
            arr[i]=sc.nextInt();
            i++;
        }
        System.out.print("Target: ");
        int target = sc.nextInt();
        System.out.println(Arrays.toString(Solution.twoSum(arr, target)));
    }
}