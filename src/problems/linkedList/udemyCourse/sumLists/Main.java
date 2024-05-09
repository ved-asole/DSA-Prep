package problems.linkedList.udemyCourse.sumLists;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2= Integer.valueOf(n1);
        LinkedList llA = new LinkedList();
        llA.createLL(sc.nextInt());
        n1--;

        while(n1-->0)
        {
            llA.insertNode(sc.nextInt());
        }

        LinkedList llB = new LinkedList();
        llB.createLL(sc.nextInt());
        n2--;

        while(n2-->0)
        {
            llB.insertNode(sc.nextInt());
        }

        LinkedList finalLinkedList = Solution.sumLists(llA, llB);
        finalLinkedList.traversalLL();
    }
}
