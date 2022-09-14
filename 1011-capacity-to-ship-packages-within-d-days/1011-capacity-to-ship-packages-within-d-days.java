class Solution {
    public int shipWithinDays(int[] weights, int days) {
        //base case
        if(days>weights.length){return 0;}
        //Finding max for start
        int max = Integer.MIN_VALUE,sum = 0;
        for(int i=0;i<weights.length;i++){
            sum = sum+weights[i];
            if(weights[i]>max){
                max = weights[i];
            }
        }
        int start = max,end = sum,ans = 0;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(isPossible(weights,mid,days)){
                ans = mid;
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return ans;
    }
    
    public static boolean isPossible(int[] weights,int mid,int days){
        int d = 1,sum = 0;
        for(int i=0;i<weights.length;i++){
            sum=sum+weights[i];
            if(sum>mid){
                sum = weights[i];
                d++;
            }
        }
        return d<=days;
    }
}