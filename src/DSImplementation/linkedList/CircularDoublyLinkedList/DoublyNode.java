package DSImplementation.linkedList.CircularDoublyLinkedList;

public class DoublyNode {
    public int value;
    public DoublyNode prev;
    public DoublyNode next;

    @Override
    public String toString() {
        return "DoublyNode{" +
                "value=" + value +
                ", prev=" + prev +
                ", next=" + next +
                '}';
    }
}