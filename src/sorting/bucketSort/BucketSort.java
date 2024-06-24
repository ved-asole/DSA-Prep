package sorting.bucketSort;

import java.util.ArrayList;
import java.util.Collections;

public class BucketSort {

    // Time complexity = O(1) and Space Complexity = O(1)
    public void printBuckets(ArrayList<Integer>[] buckets) {
        for (int i = 0; i < buckets.length; i++) {
            System.out.println("Bucket " + i + ":");
            for (int j = 0; j < buckets[i].size(); j++) {
                System.out.print(buckets[i].get(j) + " ");
            }
            System.out.println();
        }
    }

    // Time complexity = O(NlogN) and Space Complexity = O(N)
    public void bucketSort(int[] arr) {
        int noOfBuckets = (int) Math.ceil(Math.sqrt(arr.length));
        int maxValue = Integer.MIN_VALUE;
        for(int value : arr) {
            if (value > maxValue) maxValue = value;
        }

        ArrayList<Integer>[] buckets = new ArrayList[noOfBuckets];
        for (int i = 0; i < noOfBuckets; i++) {
            buckets[i] = new ArrayList<>();
        }

        for (int value: arr) {
            int bucket = (int) Math.ceil( (float)value*noOfBuckets / maxValue );
            buckets[bucket-1].add(value);
        }

        System.out.println("\n\nPrinting buckets before sorting:");
        printBuckets(buckets);

        for (ArrayList<Integer> bucket : buckets) {
            Collections.sort(bucket);
        }

        int index = 0;
        for (ArrayList<Integer> bucket : buckets) {
            for (Integer value : bucket) {
                arr[index] = value;
                index++;
            }
        }

        System.out.println("\n\nPrinting buckets after sorting:");
        printBuckets(buckets);
    }

    public void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
