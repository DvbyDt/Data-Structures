class Solution {
    public String reverseWords(String s) {
        String str="";
        int spaceIndex=0;
        for(int i=0;i<s.length();i++){
            int j=0;
            if(s.charAt(i)==' '){
                j=i-1;
            }
            else if(i==s.length()-1){
                j=i;
            }
            if(s.charAt(i)==' ' || i==s.length()-1){
                for(;j>=spaceIndex;j--){
                    str+=s.charAt(j);
                }
                if(i!=s.length()-1){
                    str+=" ";
                }
                spaceIndex=i+1;
            }
        }
        return str;        
    }
}