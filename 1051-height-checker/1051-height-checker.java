class Solution {
    public int heightChecker(int[] heights) {
        //Approach-1: Compare two arrays
        int[] arr = new int[heights.length];
        for(int i=0;i<heights.length;i++){
            arr[i] = heights[i];
        }
        Arrays.sort(arr);
        //Compare
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=heights[i]){
                count++;
            }
        }
        return count;
    }
}