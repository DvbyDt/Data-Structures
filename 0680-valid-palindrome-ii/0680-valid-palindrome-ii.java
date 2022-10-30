class Solution {
    public boolean validPalindrome(String s) {
        //Applying two pointer approach
        int left = 0,right = s.length()-1;
        while(left<right){
            //Just searching for the first non-similar element.
            if(s.charAt(left)!=s.charAt(right)){
                return isPlaindrome(s,left+1,right)||isPlaindrome(s,left,right-1);
            }
            //Otherwise just increment
            left++;
            right--;
        }
        return true;
    }
    
    //Now making our own method just to check by removing just one character
    public static boolean isPlaindrome(String s,int i,int j){
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}