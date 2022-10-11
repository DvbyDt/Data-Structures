class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
//         //Base case
//         if(intervals.length==0 || intervals[0].length==0){
//             return 0;
//         }
        
//         //Sorting the arrays
//         Arrays.sort(intervals,(a,b)-> Integer.compare(a[0],b[0]));
//         //Getting list
//         ArrayList<int[]> ans = new ArrayList<>();
//         int count=1;
//         for(int[] interval:intervals){
//             //size is 0
//             if(ans.size()==0){
//                 ans.add(interval);
//             }else{
//                 int[] prevInterval = ans.get(ans.size()-1);
//                 if(prevInterval[1] >= interval[0]){
//                     prevInterval[1] = Math.max(prevInterval[1],interval[1]);
//                     count++;
//                 }else{
//                     ans.add(interval);
//                 }
//             }            
//         }
//         return intervals.length-count;
        
        if(intervals==null || intervals.length == 0) return 0;
         
        Arrays.sort(intervals, (a,b) -> (a[0]- b[0]));
         
        int count=1;
         
        int end = intervals[0][1];
         
        for(int i=1;i<intervals.length;i++) {
            if(intervals[i][0] >= end) {
                count++;
                end = intervals[i][1];
            } else {
                end = Math.min( intervals[i][1], end);
            }
        }
        return intervals.length-count;
        
    }
}