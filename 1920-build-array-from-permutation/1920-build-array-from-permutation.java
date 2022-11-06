class Solution {
    public int[] buildArray(int[] nums) {
        //Better solution for follow-up question
        //Using o(1). The trick was to store two values in one place.
        int n = nums.length;
        for(int i=0;i<nums.length;i++){
            nums[i] = ((nums[nums[i]]%n)*n)+nums[i];// The formula behind this is a = a + b*n; where in b we have [nums[nums[i]%n]
            //System.out.println(nums[i]);
        }
        //To retrive a value
        //System.out.println(".........");
        for(int i=0;i<nums.length;i++){
            nums[i] = nums[i]/n;//a = a/n is to get the original values and a = a%n is for getting the older values
            System.out.println(nums[i]);
        }
        
        return nums;
    }
}