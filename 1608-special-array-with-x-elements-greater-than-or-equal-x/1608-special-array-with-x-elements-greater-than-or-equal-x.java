class Solution {
    public int specialArray(int[] nums) {
        Arrays.sort(nums);
        if(nums.length==0){return -1;}
        for(int i=0;i<=nums.length;i++){
            if(i==nums.length-binarysearch(nums,i)){
                return i;
            }
        }
        return -1;
    }
    
    public static int binarysearch(int[] arr,int target){
        int start = 0,end = arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]>=target){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return start;
    }
}