/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        //base cases
        int len = mountainArr.length();
        if(len<3){return -1;}
        else{
            //1.Find peak first.
            int peak = findPeak(mountainArr,len);
            System.out.println(peak);
            //2. Apply Binary Search on first part
            //int ans = agnosticBinarySearch(target,mountainArr,0,peak);
            //System.out.println(ans);
            //if(ans!=-1){
            //    return ans;
            //}
            //3. Apply Binary Search on the second part
            //int abc =  agnosticBinarySearch(target,mountainArr,peak+1,len-1);
            //System.out.println(abc);
            //return abc;
            int x = bsAscending(mountainArr, target, 0, peak - 1);
            int y = bsDescending(mountainArr, target, peak, len-1);
            if(x == -1 || y == -1)
                return Math.max(x,y);
            else
                return Math.min(x,y);
        }
    }
    
    public static int findPeak(MountainArray mArr,int len){   
        // int n = mountainArr.length();
        // int left = 0;
        // int right = n - 1;
        // int mid;
        // int res = -1;
        // while(left < right) {
        //     mid = left + (right-left)/2;
        //     if(mountainArr.get(mid) > mountainArr.get(mid+1)) {
        //         res = mid;
        //         right = mid - 1;
        //     }
        //     if(mountainArr.get(mid) < mountainArr.get(mid+1))
        //         left = mid + 1;
        // }
        //Checking if first element is the peak or not
        //int len = mArr.length();
        // if(mArr.get(0)>mArr.get(1)){return 0;}
        //Checking last
        // if(mArr.get(len-1)>mArr.get(len-2)){return mArr.get(len-1);}
        //Starting from 1 to n-2
        int start=0,end=len-1;
        int peak=0;
        while(start < end){
            int mid = start+(end-start)/2;
            //If mid is peak
            //if(mArr.get(mid) > mArr.get(mid-1) && mArr.get(mid) > mArr.get(mid+1)){return mid;}
            if(mArr.get(mid) > mArr.get(mid+1)){end = mid-1; peak=mid;}
            if(mArr.get(mid+1) > mArr.get(mid)){start = mid+1;}
        }
        return peak;
    }
    
//     public static int agnosticBinarySearch(int target,MountainArray mArr,int start,int end){
//         boolean isAsc = true;
//         if(mArr.get(start)<mArr.get(end)){isAsc = true;}
//         else{isAsc = false;}
        
//         while(start<=end){
//                 int mid = start+(end-start)/2;
//                 if(mArr.get(mid)==target){
//                     return mid;
//                 }
//                 if(isAsc){
//                     if(target>mArr.get(mid)){
//                         start=mid+1;
//                     }
//                     else{
//                         end=mid-1;
//                     }
//                 }else{
//                     if(target>mArr.get(mid)){
//                         end=mid-1;
//                     }else{
//                         start=mid+1;
//                     }
//                 }                
//             }
//             return -1;
//     }
    
    public int bsAscending(MountainArray mountainArr, int target, int left, int right) {
        int mid;
        while(left <= right) {
        mid = left + (right - left)/2;
        if(mountainArr.get(mid) == target)
            return mid;
        else if(target < mountainArr.get(mid))
            right = mid - 1;
        else
            left = mid+1;
        }
        return -1;
    }
    
    public int bsDescending(MountainArray mountainArr, int target, int left,int right) {
        int mid;
        while(left <= right) {
        mid = left + (right - left)/2;
        if(mountainArr.get(mid) == target)
            return mid;
        else if(target < mountainArr.get(mid))
            left = mid+1;
        else
            right = mid-1;
        }
        return -1;
    }
}