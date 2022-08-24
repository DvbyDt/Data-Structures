class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int rs=0,re=matrix.length-1,cs=0,ce = matrix[0].length-1;
        List<Integer> arr = new ArrayList<>();
        while(rs<=re && cs<=ce){
            //First
            for(int i=cs;i<=ce;i++){
                arr.add(matrix[rs][i]);
                System.out.print(matrix[rs][i]+" ");
            }rs++;
            //Second
            for(int i=rs;i<=re;i++){
                arr.add(matrix[i][ce]);
                System.out.print(matrix[i][ce]+" ");
            }ce--;
            //Third
            if(rs<=re){
                for(int i=ce;i>=cs;i--){
                    arr.add(matrix[re][i]);
                    System.out.print(matrix[re][i]+" ");
                }
                re--;
            }
            //Fourth
            if(cs<=ce){
                for(int i=re;i>=rs;i--){
                arr.add(matrix[i][cs]);
                System.out.print(matrix[i][cs]+" ");
            }cs++;
            }            
        }
        return arr;
    }
}