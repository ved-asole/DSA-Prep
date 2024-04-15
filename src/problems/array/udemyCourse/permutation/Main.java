package problems.array.udemyCourse.permutation;

import java.util.Scanner;

public class Main {

    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] array1=new int[n];
        int[] array2=new int[n];

        for(int i=0; i<2; i++) {
            if(i==0) {
                for(int j=0; j<n; j++) {
                    array1[j]=sc.nextInt();
                }
            } else {
                for(int j=0; j<n; j++) {
                    array2[j]=sc.nextInt();
                }
            }
        }
        System.out.println( "Is permutation: " + Solution.permutation(array1, array2));
    }
}
