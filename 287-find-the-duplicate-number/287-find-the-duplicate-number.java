class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        //Approach-1: Compare first element with second and then return common
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]==nums[i]){
                return nums[i];
            }
        }
        return -1;
    }
}