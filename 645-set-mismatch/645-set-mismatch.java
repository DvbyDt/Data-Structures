class Solution {
    public int[] findErrorNums(int[] nums) {
        //base case
        if(nums.length==0||nums.length==1){return nums;}
        int i=0;
        while(i<nums.length){
            int correct = nums[i]-1;
            if(nums[i]!=nums[correct]){
                //Swap
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            }
            else{
                i++;
            }
        }
        //Now putting the duplicate and missed values in an array
        int[] output = new int[2];//Since, repeatition of one and loss of another is mentioned hence, size is 2.
        for(int index=0;index<nums.length;index++){
            if(index+1!=nums[index]){
                output[0] = nums[index];
                output[1] = index+1;
            }
        }
        return output;
    }
}