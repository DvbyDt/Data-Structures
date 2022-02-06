class Solution {
    public int findNumbers(int[] nums) {
        int even_digits = 0;
        for(int i=0;i<nums.length;i++){
            int digits = 0;
            while(nums[i]!=0){
                int rem_digits = nums[i]%10;
                nums[i] = nums[i]/10;
                digits = digits+1;
            }
            if(digits%2==0){
                even_digits++;
            }            
        }
        return even_digits;
    }
}