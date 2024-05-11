package problems.linkedList.udemyCourse.nthToLast;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        LinkedList linkedList = new LinkedList();
        linkedList.createLL(sc.nextInt());
        n--;

        while(n-->0)
        {
            linkedList.insertNode(sc.nextInt());
        }
        int location=sc.nextInt();

        System.out.println(Solution.nthToLast(linkedList, location).value);
    }
}
