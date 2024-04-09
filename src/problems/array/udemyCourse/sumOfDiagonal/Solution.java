package problems.array.udemyCourse.sumOfDiagonal;

public class Solution {

    public static int sumDiagonalElements(int[][] array) {
        // Time complexity: O(n) and Space complexity: O(1)
        // where n is the length of each row in the array
        if(array.length<2) return 0;

        int sum = 0;

        for(int i = 0; i<array.length; i++) {
            sum += array[i][i];
        }

        return sum;
    }
}
