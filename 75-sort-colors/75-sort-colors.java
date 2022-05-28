class Solution {
    public void sortColors(int[] nums) {
        int z=0;
        int t=0;
        int o=0;
        for(int i=0;i<nums.length;i++){
            switch(nums[i]){
                case 0: z++;break;
                case 1: o++;break;
                case 2: t++;break;
            }
        }
        int i=0;
        while(z>0){
            z--;
            nums[i++] = 0;
        }
        while(o>0){
            o--;
            nums[i++] = 1;
        }
        while(t>0){
            t--;
            nums[i++] = 2;
        }
        
    }
}