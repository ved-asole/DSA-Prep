package problems.linkedList.udemyCourse.removDuplicates;

import java.util.Scanner;

import problems.linkedList.udemyCourse.removDuplicates.Solution;

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
        Solution.deleteDups(linkedList);
        linkedList.traversalLL();
    }
}
