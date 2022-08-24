class Solution {
    public int[][] generateMatrix(int n) {
        if(n==0){return null;}
        if(n==1){int arr[][] = new int[1][1]; arr[0][0]=1; return arr;}
        int arr[][] = new int[n][n];
        int top = 0, bottom=arr.length-1, left = 0, right=arr[0].length-1;
        int num=0;
        while(top<=bottom && left<=right){
            for(int i=left;i<=right;i++){
                num = num+1;
                arr[top][i] = num;
            }top++;
            for(int i=top;i<=bottom;i++){
                num = num+1;
                arr[i][right] = num;
            }right--;
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    num = num+1;
                    arr[bottom][i] = num;
                }
                bottom--;    
            }
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    num = num+1;
                    arr[i][left] = num;
                }
                left++;    
            }            
        }
        return arr;
    }
}