class Solution {
    public int removeDuplicates(int[] nums) {
        int prev = 0;
        if(nums.length==0 || nums.length==1){return nums.length;}
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[prev]){
                prev++;
                nums[prev] = nums[i];
                //System.out.println(nums[prev]);
            }
        }
        return prev+1;
    }
}