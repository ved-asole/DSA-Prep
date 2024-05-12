package problems.linkedList.udemyCourse.intersection;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int n1=sc.nextInt();
        LinkedList llA = new LinkedList();
        llA.createLL(sc.nextInt());
        n1--;
        while(n1-->0)
        {
            llA.insertNode(sc.nextInt());
        }
        

        int n2=sc.nextInt();
        LinkedList llB = new LinkedList();
        llB.createLL(sc.nextInt());
        n2--;
        while(n2-->0)
        {
            llB.insertNode(sc.nextInt());
        }
        

        int n3=sc.nextInt();
        while(n3-->0)
        {
            Solution.addSameNode(llA, llB, sc.nextInt());
        }
        

        System.out.println(Solution.findIntersection(llA, llB));

    }
}
