class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        //aab baa
        //true
        int[] ans = new int[26];
        for(int i=0;i<magazine.length();i++){
            ans[magazine.charAt(i)-'a']++;
        }
        
        for(int i=0;i<ransomNote.length();i++){
            if(--ans[ransomNote.charAt(i)-'a'] < 0){
                return false;
            }
        }
        return true;
       
    }
}