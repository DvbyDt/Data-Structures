class Solution {
    public boolean canJump(int[] nums) {
        int reachable = 0;
        int n=nums.length;
        for(int i=0;i<n && i<=reachable;i++){
            reachable = Math.max(reachable,i+nums[i]);
            if(reachable>=n-1){return true;}
        }
        return false;
    }
}