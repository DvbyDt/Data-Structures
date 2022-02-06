class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
         int[][]temp = new int[image.length][image[0].length];
	        for(int i=0;i<image.length;i++) {
                int row = 0;
	        	for(int j=image[i].length-1;j>=0;j--) {
	        		if(image[i][j]==0) {
	        			temp[i][row] = 1;
	        		}else if(image[i][j]==1) {
	        			temp[i][row] = 0;
	        		}
                    row++;
	        	}
	        }
	        return temp;
    }
}