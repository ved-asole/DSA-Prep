package Problems.arrays.twoSum;

class TwoSum {
    public int[] twoSum(int[] nums, int target) {

        for(int i=0;i<nums.length;i++){
            int num1=nums[i];
            for(int j=0;j<nums.length;j++){
                if(j!=i){
                    int num2=nums[j];
                    if((num1+num2)==target){
                        return new int[]{i,j};
                    }
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int [] nums={2,7,11,15};
        int target=9;
        System.out.println("target : " + target);

        TwoSum twoSum=new TwoSum();
        int [] index=twoSum.twoSum(nums,target);
        for (int j : index) {
            System.out.println(j + " : " + nums[j]);
        }
    }
}
