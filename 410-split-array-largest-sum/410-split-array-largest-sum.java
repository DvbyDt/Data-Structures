class Solution {
    public int splitArray(int[] nums, int m) {
        //base case
        if(m>nums.length){return 0;}
        int max = 0 ,sum=0;
        for(int i=0;i<nums.length;i++){
            max = Math.max(max,nums[i]);
            sum+=nums[i];
        }
        int ans=0;
        int start = max , end = sum;
        while(start<=end){
            int mid = start+(end-start)/2;
            //Checking if it is possible to split it
            if(isPossibleDistribute(nums,m,mid)){
                ans = mid;
                end = mid-1;
            }else{
                start = mid+1;
            }
        }        
        return ans;
    }
    
    public static boolean isPossibleDistribute(int[] nums, int m, int mid){
        int st = 1;//Number of students
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(sum>mid){
                sum = nums[i];
                st++;
            }
        }
        return st<=m;
    }
}