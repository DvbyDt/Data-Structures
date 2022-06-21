class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count=0;
        for(String word:words){
            boolean isTrue = true;
            for(int j=0;j<word.length();j++){
                if(!allowed.contains(word.valueOf(word.charAt(j)))){
                    isTrue = false;
                    break;
                }//k++;
            }
            if(isTrue){
                count++;
            }
        }
        return count;
    }
}