class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        //Approach-1: SOrting the array and then checking
        if(arr.length<=2){return true;}
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(i+1<arr.length && j+1<arr.length && arr[i+1]-arr[i]!=arr[j+1]-arr[j]){
                    return false;
                }
            }
        }
        return true;
    }
}