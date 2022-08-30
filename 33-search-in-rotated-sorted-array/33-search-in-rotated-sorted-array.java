class Solution {
    public int search(int[] nums, int target) {
        int start=0,end=nums.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            System.out.println("MID: "+mid);
            //Check the mid
            if(target==nums[mid]){return mid;}
            //Left half sorted
            if(nums[start]<=nums[mid]){
                //Lying in the left
                if(target>=nums[start] && target<=nums[mid]){
                    end = mid-1;
                    System.out.println("LEFT: "+end);
                }else{
                    start = mid+1;
            }
        }
            else{//Right half sorted
                if(target>=nums[mid] && target<=nums[end]){
                    start = mid+1;//Move start to the right
                }else{
                    end=mid-1;
                }
            }
        }
        return -1;
    }
}