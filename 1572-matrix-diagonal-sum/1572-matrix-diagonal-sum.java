class Solution {
    public int diagonalSum(int[][] mat) {
        //This method is taking o(n^2).
        // int sum=0;
        // for(int i=0;i<mat.length;i++){
        //     for(int j=0;j<mat[i].length;j++){
        //         if((i==j)||(i+j==mat.length-1)){
        //             sum=sum+mat[i][j];
        //         }
        //     }
        // }
        // return sum;        
        
        //A new method is required which will take o(n).
        int sum=0;
        for(int i=0;i<mat.length;i++){
            sum+=mat[i][i];//primary diagonal
            sum+=mat[mat.length-1-i][i];//secondary diagonal 
        }
        //if it is odd you might have added the center element twice
        sum = mat.length%2 == 0 ? sum : sum-mat[mat.length/2][mat.length/2];
        return sum;
    }
}