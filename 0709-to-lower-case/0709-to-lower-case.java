class Solution {
    public String toLowerCase(String s) {
        //Approach-1: SImple use of library
        //return s.toLowerCase();
        
        //Approach-2: Iterate in the loop and check for ASCII value if in upper case change it
        StringBuilder sb =  new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>64 && s.charAt(i)<91){
                sb.append((char)(s.charAt(i)+32));
            }else{
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}