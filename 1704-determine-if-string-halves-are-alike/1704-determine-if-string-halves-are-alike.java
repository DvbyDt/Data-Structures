class Solution {
    public boolean halvesAreAlike(String s) {
        // StringBuilder a1 = new StringBuilder();
        // StringBuilder a2 = new StringBuilder();
        int left=0,right=0;
        for(int i=0;i<s.length();i++){
            if(i<(s.length()/2)){
                // a1.append(s.charAt(i));
                if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'
                  ||s.charAt(i)=='u'||s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'
                  ||s.charAt(i)=='O'||s.charAt(i)=='U'){
                    left++;
                }
            }else{
                //a2.append(s.charAt(i));
                if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'
                  ||s.charAt(i)=='u'||s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'
                  ||s.charAt(i)=='O'||s.charAt(i)=='U'){
                    right++;
                }
            }
        }
        
        if(left==right){
            return true;
        }
        return false;
        
    }
}