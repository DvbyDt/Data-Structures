class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder output = new StringBuilder();
        int i=0,j=0;
        while(i<word1.length() && j<word2.length())
        {
            output.append(word1.charAt(i));
            output.append(word2.charAt(j));
            i++;
            j++;
        }
        if(i<word1.length()){
            output.append(word1.substring(i));
            //i++;
        }
        if(j<word2.length()){
            output.append(word2.substring(j));
            //j++;
        }
        return output.toString();
    }
}