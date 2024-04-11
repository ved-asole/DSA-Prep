package problems.array.udemyCourse.removeDuplicateUnsortedArray;

import java.util.Arrays;

public class Solution {

    public static int[] removeDuplicates(int[] arr) {

        //Time complexity: O(n^2) and Space complexity: O(1)
        int n = arr.length;
        int[] uniqueArray = new int[n];
        int index = 0;

        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                uniqueArray[index++] = arr[i];
            }
        }

        return Arrays.copyOf(uniqueArray, index);

        /**
         Time complexity: O(n) and Space complexity: O(n)
            int n = arr.length;
            int[] uniqueArray = new int[n];
            int visited = Integer.MIN_VALUE;
            int index = 0;

            for (int i = 1; i < n; i++) {
                if (visited != arr[i]) {
                    uniqueArray[index] = arr[i];
                    visited = arr[i];
                    index++;
                }
            }

            return Arrays.copyOf(uniqueArray, index);
        */

    }
}
