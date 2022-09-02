class Solution {
    public int findKthPositive(int[] arr, int k) {
        //Approach-1: Taking a num and increasing it's value till it becomes >k
        if(arr[0]>k){return k;}
        int num = k;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=num){
                num++;
            }else{
                break;
            }
        }
        return num;
    }
}