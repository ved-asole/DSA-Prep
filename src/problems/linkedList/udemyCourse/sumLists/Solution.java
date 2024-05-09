package problems.linkedList.udemyCourse.sumLists;

public class Solution {

    public static LinkedList sumLists(LinkedList llA, LinkedList llB) {
        Node value1 = llA.head;
        Node value2 = llB.head;
        LinkedList finalSum = new LinkedList();
        int carry = 0;

        for (int i = 0; i < llA.size; i++) {
            int sum = value1.value + value2.value + carry;
            carry = sum/10;
            finalSum.insertNode(sum%10);
            value1 = value1.next;
            value2 = value2.next;
        }
        return finalSum;
    }

}
