class Solution {
    public int[] productExceptSelf(int[] nums) {
        //Taking into account the left and right spaces
        if(nums.length==0 || nums.length==1) {return nums;}
        
        //Left side
        int left=1;
        int res[] = new int[nums.length];
        int n = nums.length;
        for(int i=0;i<n;i++){
          if(i>0){
            left = left * nums[i-1];//That's why i>0 otherwise index out of bounds error we will get
          }
            res[i] = left;
        }
        
        //Right side
        int right = 1;
        for(int i=n-1;i>=0;i--){
            if(i<n-1){
              right = right*nums[i+1];   
            }            
            res[i] = res[i]*right; //Because we are also populating the array at the same time.
        }
        
        return res;
    }
}