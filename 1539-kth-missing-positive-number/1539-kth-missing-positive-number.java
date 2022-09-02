class Solution {
    public int findKthPositive(int[] arr, int k) {
        //Approach-1: Taking a num and increasing it's value till it becomes >k
        if(arr[0]>k){return k;}
        // int num = k;
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]<=num){
        //         num++;
        //     }else{
        //         break;
        //     }
        // }
        // return num;
        
        //Appraoch-2: Since, Array is sorted and let's suppose array contains [1,2,3,4] and 
        // to find any missing element we do arr[idx] - (idx+1) i.e let's suppose idx = 1,
        //So, it becomes arr[1] - (1+1) = 2-2 =0. Hence, no element is missing
        int idx = 0;
        for(int i=0;i<arr.length && (arr[idx]-(idx+1))<k;){
            idx = i+1;
            i++;
        }
        return k+idx;
    }
}