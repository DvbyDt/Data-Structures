/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        //base case
        if(n==0){return 0;}
        int start =1,end =n;
        while(start<end){
            int mid = start+(end-start)/2;
            //Because in this problem we don't need to find target we just need to find the first 
            //occurence of bad version after which every version was bad so, that's why no equating mid 
            //to a target 
            if(isBadVersion(mid)){
                end = mid;
            }else{
                start = mid+1;
            }
        }
        return start;
    }
}