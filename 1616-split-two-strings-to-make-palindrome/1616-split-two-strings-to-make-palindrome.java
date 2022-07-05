class Solution {
    public boolean checkPalindromeFormation(String a, String b) {
//             int i=0,j=b.length()-1;
// 	        StringBuilder s1 = new StringBuilder(a);
// 	        StringBuilder s2 = new StringBuilder(b);
// 	        if(a.equals(s1.reverse().toString()) && (b.equals(s2.reverse().toString()))){
// 	            return true;
// 	        }
	        
// 	        StringBuilder s3 = new StringBuilder();
// 	        while(i<a.length() && j>-1){
// 	            if(a.charAt(i)==b.charAt(j)){
// 	                s3.append(a.charAt(i));
// 	            }
// 	            else{
// 	                break;
// 	            }
// 	            i++;
// 	            j--;
// 	        }	        
// 	        StringBuilder output = new StringBuilder(s3);
//         if(output.length()==0) {return false;}
// 	        return s3.toString().equals(output.toString()) ? true: false;	
        
        return validate(a,b) || validate(b,a);        
    }
    
    public static boolean validate(String a,String b){
        int i = 0;
        int j = a.length()-1;
        while(i<=j && a.charAt(i)==b.charAt(j)){
            i++;
            j--;
            if(i>=j){return true;}
        }
        return ispalindrome(a,i,j) || ispalindrome(b,i,j);
    }
    
    public static boolean ispalindrome(String a, int l, int r){
        while(l<=r && a.charAt(l)==a.charAt(r)){
            l++;
            r--;
            
            if(l>=r){
                return true;
            }            
        }
        
        return false;
    }
}