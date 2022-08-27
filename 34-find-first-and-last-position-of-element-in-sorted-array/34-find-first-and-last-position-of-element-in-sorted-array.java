class Solution {
    public int[] searchRange(int[] nums, int target) {
        //Base case
        if(nums.length==0){int[] arr = {-1,-1}; return arr;}
        
        //Searching in the first Part
        int[] ans = {-1,-1};
        ans[0] = searchingPosition(nums,target,true);
        //Only search the next part if ans[0] is not -1
        if(ans[0]!=-1){
            ans[1] = searchingPosition(nums,target,false);
        }
        return ans;
    }
    
    public static int searchingPosition(int[] nums,int target, boolean isFirstOccurence){
        int start = 0,end=nums.length-1, ans=-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(target>nums[mid]){
                start = mid+1;
            }else if(target<nums[mid]){
                end =  mid-1;
            }else{
                //potential answer found
                ans = mid;
                if(isFirstOccurence){
                    end = mid-1;
                }else{
                    start=mid+1;
                }
            }
        }
        return ans;
    }
    
    
}