class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        //Checking length
        if(arr.length<3){return -1;}
        int start=0,end=arr.length-1;
        while(start<=end){
            int mid = start+(end-start+1)/2;
            if(arr[mid-1]<arr[mid] && arr[mid+1]<arr[mid]){
                return mid;
            }else if(arr[mid-1]<arr[mid]){
                start=mid+1;
            }else {
                end=mid-1;
            }
        }
        return -1;
    }
}