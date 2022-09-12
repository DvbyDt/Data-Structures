class Solution {
    public int maxFrequency(int[] nums, int k) {
        int l = 0, r = 0, res = 0;
        long total = 0;
        Arrays.sort(nums);
        while(r<nums.length){
            total+=nums[r];
            //Applying sliding window here.. checking for invalid inputs
            //nums[r]*len > k+sum of the array
            while((long)nums[r]*(r-l+1)>k+total){
                total = total-nums[l];
                l++;
            }
            res = Math.max(res,r-l+1);
            r++;
        }
        return res;
    }
}