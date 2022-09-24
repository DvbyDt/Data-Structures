public class Solution {
    public int[] SortArrayByParity(int[] nums) {
        if(nums.Length==1||nums.Length==0){return nums;}
        int si = 0,ei = nums.Length-1;
        while(si<ei){
            if((nums[si]%2)!=0 && (nums[ei]%2)==0){//odd
                //Swap
                int temp = nums[si];
                nums[si] = nums[ei];
                nums[ei] = temp;
                si++;
                ei--;
            }else if((nums[si]%2)==0){
                si++;
            }else{
                ei--;
            }
        }
        return nums;
    }
}