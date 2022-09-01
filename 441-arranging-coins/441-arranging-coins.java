class Solution {
    public int arrangeCoins(int n) {
        //Approach-1: Brute force
        if(n==0 || n==1) {return n;}
        // int res=1;
        // for(;res<=n;){
        //     n = n-res;
        //     res++;
        // }
        // return res-1;
        
        //Appraoch-2:Binary Search
        long start =1,end = n;
        while(start<=end){
            long mid = start+(end-start)/2;
            long k = mid;
            if((k*(k+1))/2 == n){
                return (int)mid;
            }else if((k*(k+1))/2 > n){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return (int)end;
    }
}