class Solution {
    public String reverseWords(String s) {
        String[] str = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<str.length;i++){
            sb.append(reverseEachWord(str[i]));
            if(i!=str.length-1){
                sb.append(" ");
            }
        }
        return sb.toString();
    }
    
    public static String reverseEachWord(String s){
        StringBuilder sb = new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}