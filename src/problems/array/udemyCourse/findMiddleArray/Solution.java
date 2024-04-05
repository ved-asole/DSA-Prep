package problems.array.udemyCourse.findMiddleArray;

public class Solution {

    public static int[] getMiddleArray(int[] arr)
    {
        // Time complexity: O(n) and Space complexity: O(1)
        if (arr.length <= 2) {
            return new int[0]; // Return an empty array if the input array has 2 or fewer elements
        }

        int[] middleArray = new int[arr.length-2];

        for(int i=1; i< arr.length-1; i++){
            middleArray[i-1] = arr[i];
        }

        return middleArray;
    }
}
