class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        //base case
        if(nums.length==0 || nums.length==1){return nums;}
        int even=0,odd=1;
        while(even<nums.length && odd<nums.length){
            //if even 
            if((nums[even]%2)!=0){
                //swap
                int temp = nums[odd];
                nums[odd] = nums[even];
                nums[even] = temp;
                odd+=2;//Increase odd by two positions to take it to an odd position
            }else{
                even+=2;
            }
        }
        return nums;
    }
}