class Solution {
    public String toLowerCase(String s) {
        //return s.toLowerCase();
        String output="";
        for(int i=0;i<s.length();i++){
            if((int)(s.charAt(i))>=65 && (int)(s.charAt(i))<=90){
                int a = (int)(s.charAt(i)) - 65;
                output+=(char)(97+a);
            }
            else{
                output+=s.charAt(i);
            }
        }
        return output;
    }
}