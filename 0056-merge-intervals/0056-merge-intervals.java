class Solution {
    public int[][] merge(int[][] intervals) {
        //Sorting the array
        Arrays.sort(intervals,(a,b) -> Integer.compare(a[0],b[0]));
        ArrayList<int[]> ans = new ArrayList<>();
        for(int[] interval:intervals){
            //Check the size
            if(ans.size()==0){
                ans.add(interval);
            }else{
                int [] prevInterval = ans.get(ans.size()-1);//Size of the last list element
                if(prevInterval[1] >= interval[0]){
                    prevInterval[1] = Math.max(prevInterval[1],interval[1]);
                }else{
                    ans.add(interval);
                }
            }
        }        
        return ans.toArray(new int[ans.size()][]);
    }
}