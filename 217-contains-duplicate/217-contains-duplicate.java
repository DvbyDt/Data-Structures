class Solution {
    public boolean containsDuplicate(int[] nums) {
        // for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         if(nums[i]==nums[j]){
        //             return true;
        //         }
        //     }
        // }
        // return false;
        // Arrays.sort(nums);
        // for(int i=0;i<nums.length;i++){
        //     if(i+1<nums.length){
        //         if((nums[i]^nums[i+1])==0){
        //             return true;
        //         }
        //     }
        // }
        // return false;
        
        //Method-3: Using Hashsets
        HashSet<Integer> hashmap = new HashSet<Integer>();
        for(int i=0;i<nums.length;i++){
            if(hashmap.contains(nums[i])){
                return true;
            }else{
                hashmap.add(nums[i]);
            }
        }
        
        return false;
    }
}