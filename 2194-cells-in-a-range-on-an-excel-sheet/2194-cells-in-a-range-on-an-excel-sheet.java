class Solution {
    public List<String> cellsInRange(String s) {
        int c=0,r=0;
        //Number of columns
        for(int i=(int)(s.charAt(0));i<=(int)s.charAt(3);i++){
            c++;
        }
        //Number of rows
        for(int i=(int)(s.charAt(1));i<=(int)s.charAt(4);i++){
            r++;
        }
        //int[][] arr = new int[r][c];
        int ascii = (int)(s.charAt(0));
        List<String> output = new ArrayList<String>();
        //Actual stroing the values
        for(int i=0;i<c;i++){
            char val = s.charAt(1);
            for(int j=0;j<r;j++){
                output.add((char)ascii+""+val);
                val++;
            }
            ascii++;
        }
        return output;
    }
}