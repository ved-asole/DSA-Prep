package sorting.selectionSort;

public class Main {

    public static void main(String[] args) {

        SelectionSort selectionSort = new SelectionSort();

        int[] arr = {30, 15, 5, 10, 50, 6};

        selectionSort.selectionSort(arr);

        selectionSort.printArray(arr);

    }

}
