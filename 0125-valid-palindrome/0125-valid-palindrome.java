class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int left = 0,right = s.length()-1;
        while(left<right){
            char c1 = s.charAt(left);
            char c2 = s.charAt(right);
            //If c1 is not a letter or digit
            if(!Character.isLetterOrDigit(c1)){
                left++;
            }
            //If c2 is not a letter or digit
            else if(!Character.isLetterOrDigit(c2)){
                right--;
            }
            else{
               if(s.charAt(left)!=s.charAt(right))
               {
                   //System.out.println(s.charAt(left));
                   //System.out.println(s.charAt(right));
                   return false; 
               }
                left++;
                right--;
            }            
        }        
        return true;
    }
}