class Solution {
    public int strStr(String haystack, String needle) {
        //Approach-1: SImplest idea
        //return haystack.indexOf(needle);
        
        //Approach-2: If you are told that you can't use indexOf()
        //Just make use of sliding window
        //haystack-needle because to leave room for tail of the needle.
        for(int i=0;i<=haystack.length()-needle.length();i++){
            //Here in this case we are starting from back due to the reason of test cases as most 
            //of them differ at the last or second last character.
            for(int j=needle.length()-1;j>=0;j--){
                if(haystack.charAt(i+j)!=needle.charAt(j)){
                    break;
                }
                if(j==0){//If you reach j that means all the characters matched.
                    return i;
                }
            }            
        }
        
        return -1;
    }
}