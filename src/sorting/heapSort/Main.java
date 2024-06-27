package sorting.heapSort;

public class Main {

    public static void main(String[] args) {

        int[] arr = {10, 3, 2, 5, 8, 4, 3, 1, 2, 9, 7, 8};

        HeapSort heapSort = new HeapSort(arr);
        System.out.println();
        heapSort.printArray();
        heapSort.heapSort();
        System.out.println();
        heapSort.printArray();

    }

}
