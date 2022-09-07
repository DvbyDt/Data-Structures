class Solution {
    public int[] findRightInterval(int[][] intervals) {
        //Applying simple binary search to solve the problem
        int[] ans = new int[intervals.length];
        int idx = -1;
        for(int i=0;i<intervals.length;i++){
            idx = binarySearch(intervals,intervals[i][1]);
            ans[i] = idx;
        }
        return ans;
    }
    
    public static int binarySearch(int[][] intervals,int target){
        int minValue = Integer.MAX_VALUE;
        int ans = -1;
        for(int i=0;i<intervals.length;i++){
            if(intervals[i][0]>=target && minValue>intervals[i][0]){
                minValue = intervals[i][0];
                ans = i;
            }
        }
        return ans;
    }
}