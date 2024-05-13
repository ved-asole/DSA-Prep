package problems.linkedList.udemyCourse.partition;

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
        int x=sc.nextInt();

        linkedList = Solution.partition(linkedList, x);
        linkedList.traversalLL();
    }
}
