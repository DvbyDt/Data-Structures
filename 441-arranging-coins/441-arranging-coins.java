class Solution {
    public int arrangeCoins(int n) {
        //Approach-1: Brute force
        if(n==0 || n==1) {return n;}
        int res=1;
        for(;res<=n;){
            n = n-res;
            res++;
        }
        return res-1;
    }
}