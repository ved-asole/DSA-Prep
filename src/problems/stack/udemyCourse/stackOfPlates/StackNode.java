package problems.stack.udemyCourse.stackOfPlates;

public class StackNode {
    public StackNode above;
    public StackNode below;
    public int value;

    public StackNode(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "StackNode{value=" + value +'}';
    }
}
