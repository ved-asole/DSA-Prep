package sorting.quickSort;

public class Main {

    public static void main(String[] args) {

        QuickSort quickSort = new QuickSort();

        int[] arr = {10, 3, 2, 5, 8, 4, 3, 1, 2, 9, 7, 8};

        quickSort.printArray(arr);
        quickSort.quickSort(arr, 0, arr.length-1);
        System.out.println();
        quickSort.printArray(arr);

    }

}
