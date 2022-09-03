class Solution {
    public int countNegatives(int[][] grid) {
        if(grid.length==0){return 0;}
        int sum = 0;
        int m = grid.length;
        int n = grid[0].length;
        for(int[] nums:grid){//Using foreach loop to pass the entire loop in the below method.
          int firstIndex = firstNegativeIndex(nums);
          sum+=n-firstIndex;            
        }        
        return sum;
    }
    
    public static int firstNegativeIndex(int[] nums){
        int si= 0,ei = nums.length-1;
        while(si<=ei){
            int mid = si+(ei-si)/2;
            if(nums[mid]<0){
                ei = mid-1;
            }else{
                si = mid+1;
            }
        }
        return si;
    }
}