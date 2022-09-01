class Solution {
    public int[] twoSum(int[] numbers, int target) {
        //Appraoch-1: O(n) solution
        // int start = 0 , end = numbers.length-1;
        // while(start<=end){
        //     if(target==numbers[start]+numbers[end]){
        //         return new int[]{start+1,end+1};
        //     }else if(target<numbers[start]+numbers[end]){
        //         end--;
        //     }else{
        //         start++;
        //     }
        // }
        // return new int[]{-1,-1};
        
        //Approach-2: O(log n) binary search
        int start = 0 , end = numbers.length-1;
        while(start<=end){
            //Case 1: If start+end ==target
            if(numbers[start]+numbers[end]==target){
                return new int[]{start+1,end+1};
            }
            int mid = start + (end-start)/2;
            //Case 2: If start+end <target
            if(numbers[start]+numbers[end]<target){
                //Case 2a: target > end+mid
                if(numbers[end]+numbers[mid]<target){
                    start = mid+1;
                }
                //Case 2b: target < mid+end
                else{
                    start++;
                }
            }
            //Case 3: If start+end>target
            else{
                //Case 3a: If target < start+mid
                if(numbers[start]+numbers[mid]>target){
                    end = mid-1;
                }
                //Case 2b: target > mid+start
                else{
                    end--;
                }
            }
            
        }
        return new int[]{-1,-1};
    }
}