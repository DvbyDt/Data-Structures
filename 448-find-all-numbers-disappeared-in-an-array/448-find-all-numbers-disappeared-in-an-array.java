class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
       //base case
        if(nums.length==0){return null;}
        int i=0;   
        while(i<nums.length){
            int correct = nums[i]-1;
            if(nums[i]!=nums[correct]){
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            }else{
                i++;
            }
        }
        //Now taking array list
        List<Integer> arr = new ArrayList<>();
        for(int index=0;index<nums.length;index++){
            if(index+1!=nums[index]){
                arr.add(index+1);
            }
        }
        return arr;
    }
}