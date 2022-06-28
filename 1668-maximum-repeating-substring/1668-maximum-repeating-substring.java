class Solution {
    public int maxRepeating(String sequence, String word) {
        // StringBuilder sb = new StringBuilder(word);
        // int count=0;
        // while(sequence.contains(sb)){
        //     count++;
        //     sb.append(word);
        // }
        // return count;
        
        //Just count repeating string with this simple method.
        int ans=1;
        while(sequence.contains(word.repeat(ans))){
            ans++;
        }
        return ans-1;
    }
}