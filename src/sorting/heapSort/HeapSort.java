package sorting.heapSort;

public class HeapSort {

    int[] arr = null;

    public HeapSort(int[] arr) {
        this.arr = arr;
    }

    // Time complexity = O(NlogN) and Space Complexity = O(N)
    public void heapSort() {
        BinaryHeap binaryHeap = new BinaryHeap(arr.length);
        for (int i = 0; i < arr.length; i++) {
            binaryHeap.insert(arr[i], "Min");
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = binaryHeap.extractHeadOfBH("Min");
        }
    }

    public void printArray() {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
