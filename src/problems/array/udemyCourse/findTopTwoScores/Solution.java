package problems.array.udemyCourse.findTopTwoScores;

public class Solution {

    public static int[] findTopTwoScores(int[] arr)
    {
        // Time complexity: O(nlogn) and Space complexity: O(1)
//        Arrays.sort(arr);
//        return new int[]{
//                arr[arr.length-1],
//                arr[arr.length-2]
//        };

        // Time complexity: O(n) and Space complexity: O(1)
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > first) {
                second = first;
                first = arr[i];
            } else if (arr[i] > second && arr[i] != first) {
                second = arr[i];
            }
        }

        return new int[]{first, second};

    }
}
