class Solution {
    public boolean checkIfExist(int[] arr) {
        //base case
        if(arr.length==0){return true;}        
        //Approach-1:Basic
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(i!=j && arr[i]==2*arr[j]){
                    return true;
                }
            }
        }
        return false;
    }
}