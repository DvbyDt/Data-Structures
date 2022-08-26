class Solution {
    public int rob(int[] nums) {
        int rob=0;//Deciding to rob a house
        int notrob=0;//Deciding not to rob a house
        for(int i=0;i<nums.length;i++){
            int curr_rob = notrob+nums[i];//checking if previous house is not robbed.
            notrob = Math.max(notrob,rob);
            rob = curr_rob;
        }
        return Math.max(rob,notrob);
    }
}