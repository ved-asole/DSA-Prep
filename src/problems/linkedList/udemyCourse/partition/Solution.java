package problems.linkedList.udemyCourse.partition;

public class Solution {

    public static LinkedList partition(LinkedList ll, int x) {
        Node current = ll.head;
        Node prev = ll.head;
        for (int i = 0; i < ll.size; i++) {
            if(current.value < x) {
                if(current == ll.head) {
                    current = current.next;
                    continue;
                }
                prev.next = current.next;
                current.next = ll.head;
                ll.head = current;
                if(current == ll.tail) {
                    prev.next = null;
                    ll.tail = prev;
                }
                else {
                    current = prev.next;
                }
            } else {
                prev = current;
                current = current.next;
            }
        }
        return ll;
    }

}
