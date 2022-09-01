class Solution {
    public int mySqrt(int x) {
        //Appraoch-1: O(n) solution brute force
        if(x<2){return x;}
        long ans=1,i=1;
        for(;ans<=x;){
            i++;
            ans = i*i;
        }
        return (int)i-1;
    }
}