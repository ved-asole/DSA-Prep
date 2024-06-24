package sorting.bucketSort;

public class Main {

    public static void main(String[] args) {

        BucketSort bucketSort = new BucketSort();

        int[] arr = {9, 7, 5, 4, 2, 1, 3, 6, 8};

        bucketSort.printArray(arr);
        bucketSort.bucketSort(arr);
        bucketSort.printArray(arr);

    }

}
