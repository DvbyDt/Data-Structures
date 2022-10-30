class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length-1];
        int c=0;
        while(c<first.length()){
            //Check if they are equal
            if(first.charAt(c)==last.charAt(c)){
                c++;
            }else{
                break;
            }
        }
        return c==0 ? "" : first.substring(0,c);
    }
}