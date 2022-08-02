class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        //base case
        if(mat.length != target.length){
            return false;
        }
        else{
            for(int i=0;i<4;i++){
                if(checkRotate(mat,target)){
                    return true;
                }
                rotate(mat);
            }            
            return false;
        }
    }
    
    public static boolean checkRotate(int[][] mat,int[][] target){
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                if(mat[i][j]!=target[i][j]){
                    return false;
                }
            }
        }
        return true;
    }
    
    
    public static void rotate(int[][] mat){
        //First transpose
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<i;j++){
                int temp = mat[j][i];
                mat[j][i] = mat[i][j];
                mat[i][j] = temp;
            }
        }
        //Flip
        int start = 0, end =mat.length-1;
        while(start<=end){
            for(int i=0;i<mat.length;i++){
                int temp = mat[i][start];
                mat[i][start] = mat[i][end];
                mat[i][end] = temp;
            }
            start++;
            end--;
        }
        
        
    }
}