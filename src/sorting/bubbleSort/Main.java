package sorting.bubbleSort;

public class Main {

    public static void main(String[] args) {

        BubbleSort bubbleSort = new BubbleSort();

        int[] arr = {30, 15, 5, 10, 50, 6};

        bubbleSort.bubbleSort(arr);

        bubbleSort.printArray(arr);

    }

}
