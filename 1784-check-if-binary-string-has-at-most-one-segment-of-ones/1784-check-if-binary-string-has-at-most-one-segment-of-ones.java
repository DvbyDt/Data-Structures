class Solution {
    public boolean checkOnesSegment(String s) {
        int n=s.length()-1;
        if(n==1){
            return s.charAt(0)=='1' ? true : false;  
        }
        for(int i=n;i>-1;i--){
            if(i-1>-1 && s.charAt(i)=='1' && s.charAt(i-1)=='0'){
                return false;
            }
        }
        return true;
    }
}