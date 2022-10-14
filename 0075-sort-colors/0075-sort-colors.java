class Solution {
    public void sortColors(int[] nums) {
        // //Approach-1: Just sort the given nums using an technique.
        // //Approach-2: Count the number 
        // int count0=0,count1=0,count2=0;
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]==0){
        //         count0++;
        //     }else if(nums[i]==1){
        //         count1++;
        //     }else {
        //         count2++;
        //     }
        // }
        // int k=0;
        // //Now filling the arrays
        // for(int i=0;i<count0;i++){
        //     nums[k++] = 0;
        // }
        // for(int i=0;i<count1;i++){
        //     nums[k++] = 1;
        // }
        // for(int i=0;i<count2;i++){
        //     nums[k++] = 2;
        // }
        
        //Approach-3: Taking two pinters approach
        int i=0,zi=0,ti = nums.length-1;
        while(i<=ti){
            if(nums[i]==0){
                //Swap with zero Index
                swap(nums,i++,zi++);
            }else if(nums[i]==2){
                //Swap with two index
                swap(nums,i,ti--);
            }else{
                i++;
            }
        }
    }
    
    public static void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}