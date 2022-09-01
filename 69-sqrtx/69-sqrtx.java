class Solution {
    public int mySqrt(int x) {
        // //Appraoch-1: O(n) solution brute force
        // if(x<2){return x;}
        // long ans=1,i=1;
        // for(;ans<=x;){
        //     i++;
        //     ans = i*i;
        // }
        // return (int)i-1;
        
        //Approach-2: Binary search
        if(x<2){return x;}
        long start =1,end = x;
        long ans = 0;
        while(start<=end){
            long mid = start+(end-start)/2;
            if(mid*mid==x){
                return (int)mid;                
            }else if(mid*mid>x){
                end = mid-1;
            }else{
                start = mid+1;
                ans = mid;
            }
        }
        return (int)ans;   
    }
    
}