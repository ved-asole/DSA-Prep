package problems.array.common.removeDuplicateSortedArray;

import java.util.Scanner;

public class Main {

    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums=new int[n];
        int i=0;

        while(n-->0)
        {
            nums[i]=sc.nextInt();
            i++;
        }
        System.out.println(Solution.removeDuplicates(nums));
    }
}
