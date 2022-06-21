class Solution {
    public int countPoints(String rings) {
        int arr[][] = new int[10][3];
        for(int i=1;i<rings.length();i+=2){
            int val=0;
            if(rings.charAt(i-1)=='B'){
                 val = Integer.valueOf(rings.charAt(i))-48;
                 arr[val][2] = 1;
            }
            else if(rings.charAt(i-1)=='G'){
                 val = Integer.valueOf(rings.charAt(i))-48;
                 arr[val][1] = 1;
            }
            else if(rings.charAt(i-1)=='R'){
                 val = Integer.valueOf(rings.charAt(i))-48;
                 arr[val][0] = 1;
            }
        }
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i][0]==1 && arr[i][1]==1 && arr[i][2]==1){
                count++;
            }
        }
        return count;
    }
}