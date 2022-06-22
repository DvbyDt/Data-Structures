class Solution {
    public String freqAlphabets(String s) {
       StringBuilder s1 = new StringBuilder();
	       for(int i=s.length()-1;i>=0;i--){
	           if(s.charAt(i)=='#'){
	               String a = ""+s.charAt(i-2)+s.charAt(i-1);
	               char ch = (char)(96+Integer.parseInt(a));
	               s1.append(ch);
	               i=i-2;
	           }else{
	              s1.append((char)( s.charAt(i) + 48 ));
	           }
	       }
	       return s1.reverse().toString(); 
    }
}