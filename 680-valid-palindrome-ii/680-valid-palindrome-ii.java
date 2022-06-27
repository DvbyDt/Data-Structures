class Solution {
    public boolean validPalindrome(String s) {
        int start = 0,end = s.length()-1;
        while(start < end){
            if(s.charAt(start)!=s.charAt(end)){
                return isPalindrome(s,start) || isPalindrome(s,end);
            }
            start++;
            end--;
        }
        return true;
    }
    
    public static boolean isPalindrome(String s,int index){
        String s1 = s.substring(0,index);
        String s2 = s.substring(index+1,s.length());
        String s3 = s1+s2;
        int i=0,j=s3.length()-1;
        while(i<j){
            if(s3.charAt(i)!=s3.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}