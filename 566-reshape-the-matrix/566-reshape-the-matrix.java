class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;
        if(r*c != m*n){
            return mat;
        }
        
        int[][] reshape = new int[r][c];
        
        for(int i=0;i<r*c;i++){
            reshape[i/c][i%c] = mat[i/n][i%n];
        }
        
        return reshape;
    }
}