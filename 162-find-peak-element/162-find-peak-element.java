class Solution {
    public int findPeakElement(int[] arr) {
        //Checking length
//         if(arr.length==0){
//             return -1;
//         }
//         else if(arr.length == 1){return 0;}
//        // check if 0th/n-1th index is the peak element
//         if(arr[0] > arr[1]) return 0;
//         if(arr[arr.length-1] > arr[arr.length-2]) return arr.length-1;
//         else{
//             int start=1,end=arr.length-2;
//             while(start<=end){
//                 int mid = start+(end-start)/2;
//                 if(arr[mid-1]<arr[mid] && arr[mid]>arr[mid+1]){
//                     return mid;
//                 }
//                 else if(arr[mid-1]>arr[mid]){
//                     end=mid-1;
//                 }else if(arr[mid+1]>arr[mid]){
//                     start=mid+1;
//                 }
                
//     }
//             return -1;
        
        //Approach-2
        int start = 0,end=arr.length-1;
        while(start<end){
            int mid = start+(end-start)/2;
            if(arr[mid]>arr[mid+1])//You are in the decreasing part
            {
                end=mid;
            }else{
                start=mid+1;
            }
        }
        return start;        
  }
}