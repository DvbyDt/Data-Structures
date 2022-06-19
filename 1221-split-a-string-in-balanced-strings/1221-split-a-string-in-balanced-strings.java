class Solution {
    public int balancedStringSplit(String s) {
         int c=0,result=0;
	        for(int i=0;i<s.length();i++){
	            if(s.charAt(i)=='R'){
                    c++;
                }else if(s.charAt(i)=='L'){c--;}
                if(c==0){
                    result++;
                }
	            
	        }
	        return result;
    }
}