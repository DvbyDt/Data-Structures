class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> rowsMin = new ArrayList<>();        
        for(int i=0;i<matrix.length;i++){
            int min = matrix[i][0];
            for(int j=0;j<matrix[0].length;j++){
                if(min>matrix[i][j]){
                    min = matrix[i][j];
                }
            }
            //System.out.println(min);
            rowsMin.add(min);
        }
        
        //Columns
        List<Integer> colMax = new ArrayList<>();
        for(int j=0;j<matrix[0].length;j++){
            int max = matrix[0][j];
            for(int i=0;i<matrix.length;i++){
                if(max<matrix[i][j]){
                    max = matrix[i][j];
                }
            }
            //System.out.println(max);
            if(rowsMin.contains(max)){
                colMax.add(max);
            }            
        }
        
        //rowsMin.retainAll(colMax);
        
        return colMax;
    }
}