package problems.array.kth_smallest_element;

import java.util.Arrays;

public class Solution {

    public static int kthSmallest(int[] arr, int l, int r, int k)
    {
        //Time complexity: O(N logN) and space complexity: O(1)
        Arrays.sort(arr);
        return arr[k-1];
    }

}
