package problems.neetcode150.arrays_and_hashing.validAnagram;

import java.util.Scanner;

public class Main {

    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s="";
        String t="";

        while(n-->0)
        {
            s = sc.nextLine();
            t = sc.nextLine();
            n--;
        }
        System.out.println(Solution.isAnagram(s, t));
    }
}