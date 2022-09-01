class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        //We will search for the rightmost element as it is a sorted array
        int i=0;//this accounts for rows
        int j=matrix[0].length-1;//this is for columns
        while(i<matrix.length && j>=0){
            //check if the rightmost element is the answer
            if(matrix[i][j]==target){
                return true;
            }
            else if(matrix[i][j]>target){//check if target > matrix element
                j--;
            }else if(matrix[i][j]<target){//if less than target then search the next row
                i++;
            }
        }
        return false;
    }
}