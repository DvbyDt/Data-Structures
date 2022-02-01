class Solution {
    public int[] shuffle(int[] nums, int n) {
        // int [] temp = new int[2*n];
        // //filling x elements
        // int k = 0;
        // for(int i=0;i<n && k<2*n;i++,k+=2){
        //     temp[k] = nums[i];
        // }
        // //filling y elements
        // int j = 1;
        // for(int i=2*n/2;i<2*n && j<2*n;i++,j+=2){
        //     temp[j] = nums[i];
        // }
        
        int temp[] = new int[nums.length];
        int j=0;
        for(int i=0;i<2*n;i+=2) {
        	temp[i] = nums[j];
        	temp[i+1] = nums[n+j];
        	j++;
        }
		//return temp;
        return temp;
    }
}