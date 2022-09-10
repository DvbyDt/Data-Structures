class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        //We will search for the rightmost element as it is a sorted array
        // int i=0;//this accounts for rows
        // int j=matrix[0].length-1;//this is for columns
        // while(i<matrix.length && j>=0){
        //     //check if the rightmost element is the answer
        //     if(matrix[i][j]==target){
        //         return true;
        //     }
        //     else if(matrix[i][j]>target){//check if target > matrix element
        //         j--;
        //     }else if(matrix[i][j]<target){//if less than target then search the next row
        //         i++;
        //     }
        // }
        // return false;
        
        //Optimised Binary Search for 2D matrix
        if(matrix.length==0 || matrix[0].length==0){
            return false;
        }
        int start = 0;
        int end = matrix.length * matrix[0].length-1;
        
        while(start<=end){
            int mid = start+(end-start)/2;
            int r = mid/matrix[0].length;
            int c = mid%matrix[0].length;
            if(matrix[r][c]==target){
                return true;
            }else if(matrix[r][c]<target){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return false;
    }
}