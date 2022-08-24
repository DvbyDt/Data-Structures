class Solution {
    private String[] d = new String[]{"RIGHT", "DOWN", "LEFT", "UP"};
    
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int rowSize = 1;
        int colSize = 1;
        
        int p=rStart;
        int q=cStart;
        
        int[][] ret = new int[rows*cols][2];
        int directionIndex = 0;
        int counter = 0;
        ret[counter++] = new int[]{p, q};
        while(counter != rows*cols) {
            String direction = d[directionIndex];
            
            switch (direction) {
                case "RIGHT":
                    for (int i=0; i<colSize; i++) {
                        if (isAvailable(p, ++q, rows, cols)) {
                            ret[counter++] = new int[]{p, q};
                        }
                    }
                    colSize++;
                    break;
					
                case "DOWN":
                    for (int i=0; i<rowSize; i++) {
                        if (isAvailable(++p, q, rows, cols)) {
                            ret[counter++] = new int[]{p, q};
                        }
                    }
                    rowSize++;
                    break;
					
                case "LEFT":
                    for (int i=0; i<colSize; i++) {
                        if (isAvailable(p, --q, rows, cols)) {
                            ret[counter++] = new int[]{p, q};
                        }
                    }
                    colSize++;
                    break;
					
                case "UP":
                    for (int i=0; i<rowSize; i++) {
                        if (isAvailable(--p, q, rows, cols)) {
                            ret[counter++] = new int[]{p, q};
                        }
                    }
                    rowSize++;
                    break;
            }
            
            directionIndex = (directionIndex+1) % 4;
        }
        
        return ret;
    }
    
    private boolean isAvailable(int p, int q, int maxR, int maxC) {
        if ( (0 <= p && p <= (maxR - 1)) && (0 <= q && q <= (maxC - 1))) {
            return true;
        }  
        
        return false;
    }  
}