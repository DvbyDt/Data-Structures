class Solution {
    public int firstMissingPositive(int[] nums) {
        //base case
        if(nums.length==0){return -1;}
        // if(nums.length==1){return 2;}
        int i=0;
        while(i<nums.length){
            int correct = nums[i]-1;//as it's 1 to n.
            if(nums[i]>0 && nums[i]<nums.length && nums[i]!=nums[correct]){
                 int temp = nums[i];
                 nums[i] = nums[correct];
                 nums[correct] = temp;
             }else{
                i++;
            }            
        }
        //Now checking which value is missing
        for(int i1=0;i1<nums.length;i1++){
            if(nums[i1]!=i1+1){
                return i1+1;
            }
        }
        //Case 2: If everything is present then only n is missing return that
        return nums.length+1;
    }
}