package problems.array.common.bestTimetoBuySellStock;

import java.util.Scanner;

public class Main {

    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int i=0;

        while(n-->0)
        {
            arr[i]=sc.nextInt();
            i++;
        }
        System.out.println( "Maximum profit: " + Solution.maxProfit(arr));
    }
}
