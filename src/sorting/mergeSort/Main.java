package sorting.mergeSort;

public class Main {

    public static void main(String[] args) {

        MergeSort mergeSort = new MergeSort();

        int[] arr = {10, 3, 2, 5, 8, 4, 3, 1, 2, 9, 7, 8};

        mergeSort.printArray(arr);
        mergeSort.mergeSort(arr, 0, arr.length-1);
        System.out.println();
        mergeSort.printArray(arr);

    }

}
