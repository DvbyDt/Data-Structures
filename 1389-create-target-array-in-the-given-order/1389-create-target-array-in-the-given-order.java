class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        // int [] temp = new int[nums.length];
        // // putting min values at the output array
        // for(int i=0;i<temp.length;i++){
        //     temp[i] = Integer.MIN_VALUE;
        // }
        // for(int i=0;i<nums.length;i++){
        //     if(temp[index[i]] == Integer.MIN_VALUE){
        //         temp[index[i]] = nums[i];
        //     }else{
        //         for(int j=index[i]+1;j<nums.length;j++){
        //             int temps = temp[j];
        //             temp[j] = temp[index[i]];
        //             temp[index[i]] = temps;
        //         }
        //     }
        //     temp[index[i]] = nums[i];
        // }
        // return temp;
        
        //Method-2
	ArrayList<Integer> list = new ArrayList<>();
    for (int i = 0; i <nums.length ; i++) {
        list.add(index[i],nums[i]);
//        list.add(index, element);
    }
    int e= 0;
    for (Integer integer : list) {
        nums[e++]=integer;
    }
    return nums;        
    }
}