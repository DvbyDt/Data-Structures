class Solution {
    public int[] sumZero(int n) {
        //base case
        // if(n==1||n==0){
        //     return new int[n];
        // }
        // int[] arr = new int[n];
        // int sum = 0;
        // for(int i=0;i<n-1;i++){
        //     arr[i] = i-n;
        //     sum = sum+arr[i];
        // }
        // arr[arr.length-1] = Math.abs(sum);
        // return arr;
        
        //Even better solution
        //Just traverse half the array and place any number and it's -number 
        int arr[] = new int[n];
        for(int i=0;i<n/2;i++){
            arr[i] = (n-i)*-1;
            //This is from the back
            arr[n-i-1] = (n-i);
        }
        return arr;
    }
}