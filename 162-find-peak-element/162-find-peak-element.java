class Solution {
    public int findPeakElement(int[] arr) {
        //Checking length
        if(arr.length==0){
            return -1;
        }
        else if(arr.length == 1){return 0;}
       // check if 0th/n-1th index is the peak element
        if(arr[0] > arr[1]) return 0;
        if(arr[arr.length-1] > arr[arr.length-2]) return arr.length-1;
        else{
            int start=1,end=arr.length-2;
            while(start<=end){
                int mid = start+(end-start)/2;
                if(arr[mid-1]<arr[mid] && arr[mid]>arr[mid+1]){
                    return mid;
                }
                else if(arr[mid-1]>arr[mid]){
                    end=mid-1;
                }else if(arr[mid+1]>arr[mid]){
                    start=mid+1;
                }
                
    }
            return -1;
        
  }
//         if(nums.length == 1) return 0; // single element
        
//         int n = nums.length;
        
// 		// check if 0th/n-1th index is the peak element
//         if(nums[0] > nums[1]) return 0;
//         if(nums[n-1] > nums[n-2]) return n-1;
		
// 		// search in the remaining array
//         int start = 1;
//         int end = n-2;
        
//         while(start <= end) {
//             int mid = start + (end - start)/2;
//             if(nums[mid] > nums[mid-1] && nums[mid] > nums[mid+1]) return mid;
//             else if(nums[mid] < nums[mid-1]) end = mid - 1;
//             else if(nums[mid] < nums[mid+1]) start = mid + 1;
//         }
//         return -1; // dummy return statement
}
}