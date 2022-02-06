class Solution {
    public int largestAltitude(int[] gain) {
        if(gain.length==0) {return 0;}		
		int max = Integer.MIN_VALUE;
		int temp[] = new int[gain.length+1];
		int i=0;
		temp[0] = 0;
		max = temp[0];
		for(int k=1;k<temp.length;k++) {
			temp[k] = temp[k-1]+gain[i];
			i++;
			if(max<temp[k]) {
				max = temp[k];
			}
		}
		return max;		
    }
}