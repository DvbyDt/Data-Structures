class Solution {
    public int[][] allCellsDistOrder(int rows, int cols, int rCenter, int cCenter) {
        //Tricky question
        int[][] ans = new int[rows*cols][2];//0 and 1
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                //Assigning values to cols
                int box = i*cols+j;//Gets all the values of the entire ans
                ans[box][0] = i;
                ans[box][1] = j;
            }
        }
        //Sorting the arrays using lambda expressions
        Arrays.sort(ans,(a,b)->{
            int d1 = Math.abs(a[0] - rCenter)+ Math.abs(a[1] - cCenter);
            int d2 = Math.abs(b[0] - rCenter)+ Math.abs(b[1]-cCenter);
            
            return d1-d2;
        });
        
        return ans;
    }
}