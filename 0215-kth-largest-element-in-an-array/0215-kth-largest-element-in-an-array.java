class Solution {
    public int findKthLargest(int[] nums, int k) {
       //Sort the array
        Arrays.sort(nums);
        return nums[nums.length-k];
    }
}