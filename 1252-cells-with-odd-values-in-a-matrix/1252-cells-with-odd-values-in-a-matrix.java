class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int matrix[][] = new int[m][n];
        int row = 0,column = 0;
        //Main logic
        for(int i=0;i<indices.length;i++){
            //Assigning row the values
            row = indices[i][0];
            for(int j=0;j<matrix[0].length;j++){
                matrix[row][j]++;
            }
            //Assigning the column values
            column = indices[i][1];
            for(int j=0;j<matrix.length;j++){
                matrix[j][column]++;
            }
        }
        int count = 0;
        //Now counting
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]%2!=0){
                    count++;
                }
            }
        }
        
        return count;
    }
}