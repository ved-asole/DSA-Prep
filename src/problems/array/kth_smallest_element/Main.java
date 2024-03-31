package problems.array.kth_smallest_element;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int t=sc.nextInt();

        while(t-->0)
        {
            int n=sc.nextInt();

            int arr[]=new int[n];

            for(int i=0;i<n;i++)
                arr[i]=sc.nextInt();

            int k=sc.nextInt();
            Solution ob = new Solution();
            out.println(ob.kthSmallest(arr, 0, n-1, k));
        }
        out.flush();
    }
}
