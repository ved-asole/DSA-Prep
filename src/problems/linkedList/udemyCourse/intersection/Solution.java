package problems.linkedList.udemyCourse.intersection;

public class Solution {

    public static void addSameNode(LinkedList llA, LinkedList llB, int nodeValue) {
        Node newNode = new Node();
        newNode.value = nodeValue;
        llA.tail.next = newNode;
        llA.tail = newNode;
        llB.tail.next = newNode;
        llB.tail = newNode;
        llA.size++;
        llB.size++;
    }

    public static Node findIntersection(LinkedList llA, LinkedList llB) {

        // Time Complexity = O(N)
        if(llA.head == null || llB.head == null) return null;
        if(llA.tail != llB.tail) return null;

        int sizeDiff = llA.size - llB.size;
        Node currentNodeA = llA.head;
        Node currentNodeB = llB.head;
        Node longer = sizeDiff > 0 ? currentNodeA : currentNodeB;
        Node shorter = longer == currentNodeA ? currentNodeB : currentNodeA;
        Node intersection = null;

        for (int i = 0; i < sizeDiff; i++) {
            longer = longer.next;
        }

        while (shorter.next != null) {
            if(longer.equals(shorter)) {
                    intersection = longer;
                    break;
            }
            longer = longer.next;
            shorter = shorter.next;
        }
        return intersection;

        // Time Complexity = O(N^2)

//        Node intersection = null;
//        Node currentNodeA = llA.head;
//        while (currentNodeA.next != null) {
//            Node currentNodeB = llB.head;
//            while (currentNodeB.next != null) {
//                if(currentNodeA.equals(currentNodeB)) {
//                    intersection = currentNodeA;
//                    break;
//                }
//                currentNodeB = currentNodeB.next;
//            }
//        if (intersection != null) break;
//        currentNodeA = currentNodeA.next;
//        }
//        return intersection;
    }

}
