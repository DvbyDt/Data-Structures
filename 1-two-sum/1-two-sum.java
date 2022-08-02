import java.util.ArrayList;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        //int sum=0;
        // ArrayList<Integer> arr = computeSum(nums,target);
        // int[] output = new int[arr.size()];
        // for(int i=0;i<output.length;i++){
        //     output[i] = arr.get(i);
        // }
        // return output;
    //     for(int i=0;i<nums.length;i++){
    //         for(int j=i+1;j<nums.length;j++){
    //             if(nums[j] == target-nums[i]){
    //                 return new int[]{i,j};
    //             }
    //         }
    //     }
    //     return null;
    // }
    // public ArrayList<Integer> computeSum(int[] nums,int target){
    //     ArrayList<Integer> arr = new ArrayList<Integer>();
    //     for(int i=0;i<nums.length;i++){            
    //         for(int j=i+1;j<nums.length;j++){
    //             int sum = nums[i];
    //             sum = sum+nums[j];
    //             if(sum==target){
    //                 arr.add(i);
    //                 arr.add(j);                    
    //             }
    //         }
    //     }
    //     return arr;
    // }
    
    //HashMap Solutions:
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] result = new int[2];
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                result[0] = i;
                result[1] = map.get(target-nums[i]);
            }
            map.put(nums[i],i);
        }
        
        return result;
    }
}