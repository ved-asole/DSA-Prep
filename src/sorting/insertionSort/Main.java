package sorting.insertionSort;

public class Main {

    public static void main(String[] args) {

        InsertionSort insertionSort = new InsertionSort();

        int[] arr = {30, 15, 5, 10, 50, 6};

        insertionSort.insertionSort(arr);

        insertionSort.printArray(arr);

    }

}
