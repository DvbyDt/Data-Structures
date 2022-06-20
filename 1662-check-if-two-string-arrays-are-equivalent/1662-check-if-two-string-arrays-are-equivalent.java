class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder a = new StringBuilder();
        for(int i=0;i<word1.length;i++){
            a.append(word1[i]);
        }
        StringBuilder b = new StringBuilder();
        for(int i=0;i<word2.length;i++){
            b.append(word2[i]);
        }
        return a.toString().equals(b.toString());
    }
}