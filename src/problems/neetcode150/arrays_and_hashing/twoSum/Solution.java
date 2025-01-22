package problems.neetcode150.arrays_and_hashing.twoSum;

import java.util.HashMap;

public class Solution {

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> allNums = new HashMap<>();

        for(int i=0; i< nums.length; i++) {
            if(allNums.containsKey(target-nums[i]))
                return new int[] {allNums.get(target-nums[i]), i};
            allNums.put(nums[i], i);
        }
        return null;
    }

}