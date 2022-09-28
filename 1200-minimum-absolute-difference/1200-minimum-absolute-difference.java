class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        List<List<Integer>> minDiff = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            int j = i+1;
            List<Integer> ans = new ArrayList<>();
            if(j<arr.length){
                if(arr[j]-arr[i]<min){
                    min = arr[j] - arr[i];
                    minDiff.clear();//To clear the previous record of min value as the first value
                    //will be entered regardless
                    ans.add(arr[i]);
                    ans.add(arr[j]);
                    minDiff.add(ans);
                }
                else if(arr[j]-arr[i]==min){
                    ans.add(arr[i]);
                    ans.add(arr[j]);
                    minDiff.add(ans);
                }
            }
        }
        return minDiff;
    }
}