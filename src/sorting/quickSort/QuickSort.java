package sorting.quickSort;

public class QuickSort {

    public int partition(int[] arr, int start, int end) {
        int pivot = end;
        int i = start-1;
        for (int j = start; j <= end ; j++) {
            if (arr[j] <= arr[pivot]) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        return i;
    }

    // Time complexity = O(NlogN) and Space Complexity = O(N)
    public void quickSort(int[] arr, int start, int end) {
        int pivot = partition(arr, start, end);
        if (start < end) {
            quickSort(arr, start, pivot-1);
            quickSort(arr, pivot+1, end);
        }
    }

    public void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
