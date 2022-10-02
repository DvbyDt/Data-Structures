class Solution {
    public int maxProduct(int[] nums) {
    //     //Brute force
    //     int max = Integer.MIN_VALUE;
    //     for(int i=0;i<nums.length;i++){
    //         for(int j=i+1;j<nums.length;j++){
    //             if(max<(nums[i]-1)*(nums[j]-1)){
    //                 max = (nums[i]-1)*(nums[j]-1);
    //         }
    //     }        
    // }
    // return max;
        
        //Approach-2:Sort and multiply last two
        // Arrays.sort(nums);
        // return (nums[nums.length-1]-1)*(nums[nums.length-2]-1);
        
        //Approach-3:Find two largest
        int second =Integer.MIN_VALUE;
        int first = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(first<nums[i]){
                second = first;
                first = nums[i];
            }else if(second<nums[i]){
                second = nums[i];
            }
        }
        return (second-1)*(first-1);
  }
}