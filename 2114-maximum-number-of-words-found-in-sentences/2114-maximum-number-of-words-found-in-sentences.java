class Solution {
    public int mostWordsFound(String[] sentences) {
        int max=0;
        for(int i=0;i<sentences.length;i++){
            int space = numberofwords(sentences[i]);
            if(space>max){
                max=space;
            }
        }
        return max;
    }
    
    public static int numberofwords(String sentences){
        int c=0;
        for(int i=0;i<sentences.length();i++){
            if(sentences.charAt(i)==' '){
                c++;
            }
        }
        return c+1;
    }
}