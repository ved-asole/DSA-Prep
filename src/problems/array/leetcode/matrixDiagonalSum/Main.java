package problems.array.leetcode.matrixDiagonalSum;

import java.util.Scanner;

public class Main {

    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int[][] arr=new int[m][n];

        for(int i=0; i<m; i++) {
            System.out.println("Enter elements of row " + (i+1));
            for(int j=0; j<n; j++) {
                arr[i][j]=sc.nextInt();
            }
        }

        System.out.println("Sum of diagonal elements: " + Solution.diagonalSum(arr));
    }
}
