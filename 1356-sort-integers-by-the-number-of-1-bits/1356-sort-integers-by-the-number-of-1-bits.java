class Solution {
    public int[] sortByBits(int[] arr) {
        int[][] count = new int[arr.length][2];
        for(int i=0;i<arr.length;i++){
            count[i][0] = arr[i];
            count[i][1] = countOnes(arr[i]);
        }
        
        Arrays.sort(count,new myCmp());
        
        for(int i=0;i<arr.length;i++){
            arr[i] = count[i][0];
        }
        
        return arr;
    }
    
    public static int countOnes(int n){
        int count=0;
        while(n!=0){
            if((n%2)==1){
                count++;
            }
            n = n/2;
        }
        return count;
    }
    
    class myCmp implements Comparator<int[]>{
        public int compare(int[] a,int[] b){
            if(a[1] != b[1]){
                return a[1]-b[1];
            }else{
                return a[0]-b[0];
            }
        }
    }
}