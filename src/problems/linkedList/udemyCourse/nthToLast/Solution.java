package problems.linkedList.udemyCourse.nthToLast;

public class Solution {

    public static Node nthToLast(LinkedList ll, int location) {
        Node currentNode = ll.head;
        for (int i = 0; i < ll.size-location; i++) {
            currentNode = currentNode.next;
        }
        return currentNode;
    }

}
