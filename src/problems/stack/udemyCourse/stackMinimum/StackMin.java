package problems.stack.udemyCourse.stackMinimum;

public class StackMin {

    Node top;
    Node min;

    public StackMin() {
        top = null;
        min = null;
    }

    public int min() {
        return min.value;
    }

    public void push(int value) {
        if(min == null || value < min.value) {
            min = new Node(value, min);
        }
        top = new Node(value , top);
    }

    public int pop() {
        int value = top.value;
        if(value == min.value) {
            min = min.next;
        }
        top = top.next;
        return value;
    }
}