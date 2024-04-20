package problems.array.common.isUnique;

public class Solution {

    public static boolean isUnique(int[] intArray) {

        //Time complexity: O(n^2) and Space complexity: O(1)
        int n = intArray.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++)
                if (intArray[i] == intArray[j])
                    return false;
        }

        return true;

        //Time complexity: O(n) and Space complexity: O(n)
//        int n = intArray.length;
//        Map<Integer, Integer> visited = new HashMap<>();
//
//        for(int i=0; i<n; i++){
//            if(visited.get(intArray[i]) !=null) return true;
//            else visited.put(intArray[i], 1);
//        }
//        return false;

    }
}
