package problems.array.udemyCourse.maxProduct;

public class Solution {

    public static String maxProduct(int[] intArray) {

        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;

        for(int i:intArray) {
            if (i>max1 && i!=max2) {
                max2=max1;
                max1=i;
            } else if (i>max2 && i!=max1) {
                max2=i;
            }
        }

        return new String(max1 + "," + max2);
    }
}
