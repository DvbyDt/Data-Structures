class Solution {
    public boolean isSubsequence(String s, String t) {
// This won't work as order is important in a subsequnece
//         for(int i=0;i<s.length();i++){
//             if(t.indexOf(s.charAt(i))==-1){
//                 return false;
//             }
//         }
        
//         return true;
        int i=0,j=0;
        for(;i<s.length() && j<t.length();){
            if(s.charAt(i) == (t.charAt(j))){
                i++;j++;
            }else{
                j++;
            }        
            }
        
        if(i<s.length() && j>=t.length()){
            return false;
        }
        
        return true;
        
    }
}