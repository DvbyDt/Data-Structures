class Solution {
    public int[] buildArray(int[] nums) {
        int[] temp = new int[nums.length];
        //Copying the elements to the array
        for(int i=0;i<temp.length;i++){
            temp[i] = nums[i];
        }
        //Now main operation
        for(int i=0;i<nums.length;i++){
            temp[i] = nums[nums[i]];
        }
//      
        System.gc();
		return temp;       
        
    }
}