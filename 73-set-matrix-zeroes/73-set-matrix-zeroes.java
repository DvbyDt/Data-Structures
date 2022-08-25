class Solution {
    public void setZeroes(int[][] matrix) {
        //Brute-force approach
        ArrayList<Integer> rows = new ArrayList<>();
        ArrayList<Integer> cols = new ArrayList<>();
        
        int n = matrix.length;
        int m = matrix[0].length;
        
        //Counting zeros
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==0){
                    rows.add(i);
                    cols.add(j);
                }
            }
        }
        
        //Assigning Zeros
        //Rows:
        for(int i=0;i<rows.size();i++){
            for(int j=0;j<m;j++){
                matrix[rows.get(i)][j] = 0;
            }
        }
        
        //Columns:
        for(int i=0;i<n;i++){
            for(int j=0;j<cols.size();j++){
                matrix[i][cols.get(j)] = 0;
            }
        }
        
        // return matrix;
    }
}