package problems.stack.udemyCourse.threeInOne;

public class ThreeInOne {
    private int numberOfStacks = 3;
    private int stackCapacity;
    private int[] values;
    private int[] sizes;

    public ThreeInOne(int stackSize) {
        this.stackCapacity = stackSize;
        values = new int[stackSize*numberOfStacks];
        this.sizes = new int[numberOfStacks];
    }

    // isFull
    public boolean isFull(int stackNum) {
        return sizes[stackNum] == stackCapacity;
    }

    // isEmpty
    public boolean isEmpty(int stackNum) {
        return this.sizes[stackNum] == 0;
    }

    // indexOfTop - this is helper method for push, pop and peek methods

    private int indexOfTop(int stackNum) {
        int offset = stackNum * stackCapacity;
        int size = sizes[stackNum];
        return offset + size - 1 ;
    }

    // push
    public void push(int stackNum, int value) {
        if(isFull(stackNum)) System.out.println("Stack is Full!");
        else {
            sizes[stackNum]++;
            values[indexOfTop(stackNum)] = value;
            System.out.println("Inserted the value " + value + " in stack no." + stackNum);
        }
    }

    // pop
    public int pop(int stackNum) {
        if(isEmpty(stackNum)) {
            System.out.println("Stack is empty!");
            return -1;
        } else {
            int topIndex = indexOfTop(stackNum);
            int value = values[topIndex];
            values[topIndex] = 0;
            sizes[stackNum]--;
            return value;
        }
    }

    // peek

    public int peek(int stackNum) {
        if(isEmpty(stackNum)) {
            System.out.println("Stack is Empty!");
            return -1;
        } else {
            return values[indexOfTop(stackNum)];
        }
    }

}

