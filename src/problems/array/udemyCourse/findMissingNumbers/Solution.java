package problems.array.udemyCourse.findMissingNumbers;

public class Solution {
    public static int findMissingNumberInArray(int[] array) {

        // Time complexity: O(n) and Space complexity: O(1)
        int n = array.length + 1;
        int expectedSum = (n * (n + 1)) / 2;
        int actualSum = 0;

        for (int number : array) {
            actualSum += number;
        }

        return expectedSum - actualSum;
    }
}
