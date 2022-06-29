class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder sb = new StringBuilder(word);
        StringBuilder output = new StringBuilder();
        boolean found=false;
        int i=0;
        for(;i<word.length();i++){
            if(word.charAt(i)==ch){
                output.append(sb.substring(0,i+1));
                found=true;
                break;
            }
        }
        if(found){
            output = output.reverse();
            output.append(sb.substring(i+1,sb.length()));
            return output.toString();
        }
        return sb.toString();
        
    }
}