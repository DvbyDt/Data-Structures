class Solution {
    public int firstUniqChar(String s) {
        //First take the character array
        int [] ch = new int[26];
        //Giving values to it
        for(int i=0;i<s.length();i++){
            ch[s.charAt(i)-'a'] = ch[s.charAt(i)-'a']+1;
        }
        
        for(int i=0;i<s.length();i++){
            if(ch[s.charAt(i)-'a']==1){
                return i;
            }
        }
        
        return -1;
        
    }
}