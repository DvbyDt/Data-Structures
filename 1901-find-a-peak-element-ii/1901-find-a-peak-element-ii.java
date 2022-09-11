class Solution {
    public int[] findPeakGrid(int[][] mat) {
        //Row length
        int m = mat.length;
        //Column length
        int n = mat[0].length;
        int start = 0,end = m-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            //Maximum Column Index
            int maxColIndex = -1;
            int num = 0;
            for(int i=0;i<n;i++){
                if(num<mat[mid][i]){
                    maxColIndex = i;
                    num = mat[mid][i];
                }
            }            
            int max = mat[mid][maxColIndex];
            boolean isLeft = (mid == 0) ? true : mat[mid-1][maxColIndex]<max;
            boolean isRight = (mid == m-1) ? true : mat[mid+1][maxColIndex]<max;
            
            if(isLeft && isRight) {return new int[]{mid,maxColIndex};}
            else if(isLeft){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        
        return new int[]{-1,-1};
    
    }
}