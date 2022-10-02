class Solution {
    public int maxProduct(int[] nums) {
        //Brute force
        int max = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(max<(nums[i]-1)*(nums[j]-1)){
                    max = (nums[i]-1)*(nums[j]-1);
            }
        }        
    }
    return max;
  }
}