package sorting.mergeSort;

public class MergeSort {

    // Time complexity = O(1) and Space Complexity = O(1)
    public static void merge(int[] arr, int left, int middle, int right) {
        int[] leftTempArray = new int[middle-left+2];
        int[] rightTempArray = new int[right-middle+1];

        for (int i = 0; i <= middle-left; i++) {
            leftTempArray[i] = arr[left+i];
        }
        for (int i = 0; i < right-middle; i++) {
            rightTempArray[i] = arr[middle+1+i];
        }

        leftTempArray[middle-left+1] = Integer.MAX_VALUE;
        rightTempArray[right-middle] = Integer.MAX_VALUE;

        int i = 0, j = 0;
        for (int k = left; k <= right; k++) {
            if (leftTempArray[i] < rightTempArray[j]) {
                arr[k] = leftTempArray[i];
                i++;
            } else {
                arr[k] = rightTempArray[j];
                j++;
            }
        }
    }

    // Time complexity = O(NlogN) and Space Complexity = O(N)
    public void mergeSort(int[] arr, int left, int right) {
        if (right > left) {
            int m = (left+right)/2;
            mergeSort(arr, left, m);
            mergeSort(arr, m+1, right);
            merge(arr, left, m, right);
        }
    }

    public void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
