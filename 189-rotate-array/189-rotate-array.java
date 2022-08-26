class Solution {
    public void rotate(int[] nums, int k) {
        if(nums.length==0 || nums.length==1) {return;}
        //Approach-1: Take a duplicate array and copy all the values back to it
        int temp[] = new int[nums.length];
        int n = nums.length;
        //Copying values to it
        if(k>n){
            k=k%n;
        }
        int j=0;//Index of temp
        for(int i=Math.abs(n-k);i<n;i++){
            temp[j] = nums[i];
            j++;
        }
        //Copying rest values
        for(int i=0;i<Math.abs(n-k);i++){
            temp[j] = nums[i];
            j++;
        }
        //Copying back
        for(int i=0;i<n;i++){
            nums[i] = temp[i];
        }
    }
}