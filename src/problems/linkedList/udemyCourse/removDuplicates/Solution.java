package problems.linkedList.udemyCourse.removDuplicates;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public static void deleteDups(LinkedList ll) {
        Node current = ll.head;
        Node prev = null;
        Set<Integer> intSet = new HashSet<>();

        while (current != null) {
            int currentVal = current.value;
            if(intSet.contains(currentVal)) {
                prev.next = current.next;
                ll.size--;
            } else {
                intSet.add(currentVal);
                prev = current;
            }
            current = current.next;
        }
        
    }

}
