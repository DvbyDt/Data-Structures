class Solution {
    public int[][] transpose(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        if(row!=col){
            int temp = row;
            row = col;
            col = temp;
        }
        int [][] output = new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                output[i][j] = matrix[j][i];
            }
        }
        return output;
    }
}