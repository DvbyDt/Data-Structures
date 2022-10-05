class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        //Best solution: Two pointer appraoch
        //Sort the array
        Arrays.sort(nums);
        List<List<Integer>> ans = new LinkedList<>();
        for(int i=0;i<nums.length-2;i++){//Because it can only be a triplet up until the 3rd last pos.
            //Check if nums[i]!=nums[i-1]
            if(i==0 || (i>0 && nums[i]!=nums[i-1]))
            {
                int si = i+1, ei = nums.length-1;
                int sum = 0-nums[i];
                while(si<ei)
                {
                    //Check if the sum is mathcing
                    if(nums[si]+nums[ei]==sum){
                        //System.out.println(nums[i]+":i "+nums[si]+":si "+nums[ei]+" ei");
                        ans.add(Arrays.asList(nums[i],nums[si],nums[ei]));                    
                        //Check if nums[si] is similar to the next nums[si+1]
                        while(si<ei && nums[si]==nums[si+1]){
                            si++;
                        }   
                        //Similarily for ei
                        while(si<ei && nums[ei]==nums[ei-1]){
                            ei--;
                        }                    
                        si++;
                        ei--;
                    }else if(nums[si]+nums[ei]>sum){
                        ei--;
                    }else{
                       si++; 
                }
            }
        }
    }
        return ans;
   }
}