package problems.array.leetcode.matrixDiagonalSum;

public class Solution {

    public static int diagonalSum(int[][] mat) {
        // Time complexity: O(n) and Space complexity: O(1)
        // where n is the length of each row in the array
        int sum = 0;
        int j = mat.length;

        for ( int i = 0; i < mat.length; i++) {
            sum += mat[i][i];
            sum += mat[i][j-1-i];
        }

        sum -= (j % 2 !=0)? mat[j/2][j/2] : 0;

        return sum;
    }
}
