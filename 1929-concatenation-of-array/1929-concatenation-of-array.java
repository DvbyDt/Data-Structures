class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;        
        int[] temp = new int[n*2];
        for(int i=0;i<n;i++){
            temp[i] = nums[i];
            temp[i+n] = nums[i];
        }
        System.gc();
        return temp;   
        
    }
}