class Solution {
    public int threeSumClosest(int[] nums, int target) {
        //Sort the array
        Arrays.sort(nums);
        int minDiff = Integer.MAX_VALUE;
        int closest = 0;
        for(int i=0;i<nums.length-2;i++){
            int si = i+1, ei = nums.length-1;
            while(si<ei){
                int sum = nums[si]+nums[ei]+nums[i];
                if(sum==target){
                    return target;//Target found
                }else if(sum<target){
                    si++;
                }else{
                    ei--;
                }
                //Just compare it with the mininmum difference
                int diff = Math.abs(target - sum);
                if(diff<minDiff){
                    minDiff = diff;
                    closest = sum;
                }
            }
        }
        return closest;
//         Arrays.sort(nums);
// 	var closest = 0;

// 	for (int i = 0, n = nums.length, minDiff = Integer.MAX_VALUE; i < n - 2; i++) {
// 		var j = i + 1;
// 		var k = n - 1;

// 		while (j < k) {
// 			var sum = nums[i] + nums[j] + nums[k];
// 			if (sum == target)
// 				return target;
// 			else if (sum < target)
// 				j++;
// 			else
// 				k--;

// 			var diff = Math.abs(target - sum);
// 			if (diff < minDiff) {
// 				minDiff = diff;
// 				closest = sum;
// 			}
// 		}
// 	}
// 	return closest;
    }
}