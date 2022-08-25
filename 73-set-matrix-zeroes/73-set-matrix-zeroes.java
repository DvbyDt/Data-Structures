class Solution {
    public void setZeroes(int[][] matrix) {
        //Brute-force approach
//         ArrayList<Integer> rows = new ArrayList<>();
//         ArrayList<Integer> cols = new ArrayList<>();
        
//         int n = matrix.length;
//         int m = matrix[0].length;
        
//         //Counting zeros
//         for(int i=0;i<n;i++){
//             for(int j=0;j<m;j++){
//                 if(matrix[i][j]==0){
//                     rows.add(i);
//                     cols.add(j);
//                 }
//             }
//         }
        
//         //Assigning Zeros
//         //Rows:
//         for(int i=0;i<rows.size();i++){
//             for(int j=0;j<m;j++){
//                 matrix[rows.get(i)][j] = 0;
//             }
//         }
        
//         //Columns:
//         for(int i=0;i<n;i++){
//             for(int j=0;j<cols.size();j++){
//                 matrix[i][cols.get(j)] = 0;
//             }
//         }
        
        // return matrix;
        
        //Efficient approach:
        int m=matrix.length;
        int n=matrix[0].length;
        boolean firstRow=false,firstCol=false;
        
        for(int i=0;i<m;i++){
            if(matrix[i][0]==0){
                firstCol=true;
                break;
            }            
        }
        for(int j=0;j<n;j++){
            if(matrix[0][j]==0){
                firstRow=true;
                break;
            }        
        }
        
        //Now make topmost and left 0
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(matrix[i][j]==0){
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }
            }
        }
        
        //Now just filling zeros
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(matrix[i][0]==0 || matrix[0][j]==0){
                    matrix[i][j]=0;
                }
            }
        }
        
        if(firstRow){
            for(int i=0;i<n;i++){
                matrix[0][i] = 0;
            }
        }
        
        if(firstCol){
            for(int i=0;i<m;i++){
                matrix[i][0] = 0;
            }
        }
    }
}