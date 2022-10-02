class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        //Approach-1: Sorting the array and then checking
        // if(arr.length<=2){return true;}
        // Arrays.sort(arr);
        // for(int i=0;i<arr.length;i++){
        //     for(int j=i+1;j<arr.length;j++){
        //         if(i+1<arr.length && j+1<arr.length && arr[i+1]-arr[i]!=arr[j+1]-arr[j]){
        //             return false;
        //         }
        //     }
        // }
        // return true;
        
        //Approach-2: Sort and just check 0 and 1 difference with other instead of  checking 
        // whole thing
        if(arr.length<=2){return true;}
        Arrays.sort(arr);
        int diff = arr[1] - arr[0];
        for(int i=2;i<arr.length;i++){
            if(arr[i]-arr[i-1]!=diff){
                return false;
            }
        }
        return true;
    }
}