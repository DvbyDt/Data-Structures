class Solution {
    public void moveZeroes(int[] nums) {
        //Brute force will utilize a temporary array
        //Approach-2:
        int k=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                k=i;
                break;
            }
        }   
        int j=k+1;
        while(k>-1 && k<nums.length && j<nums.length){
            
            if(nums[j]!=0){
                int temp = nums[j];
                nums[j] = nums[k];
                nums[k] = temp;
                k++;
            }else{
               j++; 
            }            
        }
    }
}