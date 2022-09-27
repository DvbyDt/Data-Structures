class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        //Basic approach - if every elment you wnat is present.
        // int[] arr = new int[arr1.length];
        // int k=0;
        // for(int i=0;i<arr2.length;i++){
        //     for(int j=0;j<arr1.length;j++){
        //         if(arr2[i]==arr1[j]){
        //             arr[k] = arr2[i];
        //             k++;
        //         }
        //     }
        // }
        // return arr;
        
        //Approach-2: Better one
        //1. Find a max
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr1.length;i++){
            max = Math.max(max,arr1[i]);
        }
        //2. Creating a frequency array
        int[] freq = new int[max+1];
        int index = 0;
        //3. Assigning values to it
        for(int i=0;i<arr1.length;i++){
            freq[arr1[i]]++;
        }
        //4. Now decrementing and assigning values back to arr1
        for(int i=0;i<arr2.length;i++){
            while((freq[arr2[i]]--)>0){
                arr1[index++] = arr2[i];
            }
        }
        //Now just put the remaining ones
        for(int i=0;i<freq.length;i++){
            while((freq[i]--)>0){
                arr1[index++] = i;
            }
        }
        return arr1;
    }
}