class Solution {
    public int heightChecker(int[] heights) {
        //Approach-1: Compare two arrays
        // int[] arr = new int[heights.length];
        // for(int i=0;i<heights.length;i++){
        //     arr[i] = heights[i];
        // }
        // Arrays.sort(arr);
        // //Compare
        // int count=0;
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]!=heights[i]){
        //         count++;
        //     }
        // }
        // return count;
        
        //Approach-2: Using counting sort
        //Counting sort is utilized when we the numbers given in a finite range like the one 
        //in this example.
        //Taking a frequency array to store 100 elements
        int[] freq = new int[101];
        //Asigning values
        for(int i:heights){
            freq[i]++;//Incrementing values in the frequency array.
        }
        int currHeight = 0,result = 0;
        for(int i=0;i<heights.length;i++){
            //Check if freq array is not zero
            while(freq[currHeight]==0){
                currHeight++;
            }
            if(currHeight!=heights[i]){
                //Increase the result
                result++;
            }
            //Decrement all the heights in the frequency array.
            freq[currHeight]--;
        }
        return result;
    }
}