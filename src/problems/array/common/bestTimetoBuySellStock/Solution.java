package problems.array.common.bestTimetoBuySellStock;

public class Solution {

    public static int maxProfit(int[] prices) {

        //Time complexity: O(n) and Space complexity: O(1)
        int n = prices.length;
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else if (prices[i] - minPrice > maxProfit) {
                maxProfit = prices[i] - minPrice;
            }
        }

        return maxProfit;

    }
}
