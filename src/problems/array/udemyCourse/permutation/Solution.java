package problems.array.udemyCourse.permutation;

public class Solution {

    public static boolean permutation(int[] array1, int[] array2){

        //Time complexity: O(n^2) and Space complexity: O(1)
//        boolean isPermutation = true;
//
//        for(int i: array1) {
//
//            boolean found = false;
//
//            for(int j:array1) {
//                if(i == j) {
//                    found=true;
//                }
//            }
//
//            if(found==true) {
//                isPermutation=true;
//                break;
//            }
//
//        }
//
//        return isPermutation;

        //Time complexity: O(n) and Space complexity: O(1)
        int sum1=0;
        int sum2=0;
        int product1=1;
        int product2=1;

        for(int i=0; i<array1.length; i++) {
            sum1+=array1[i];
            sum2+=array2[i];
            product1*=array1[i];
            product2*=array2[i];
        }

        return sum1==sum2 && product1==product2;

    }
}
