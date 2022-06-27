class Solution {
    public String longestCommonPrefix(String[] strs) {
        int size=strs.length-1;
        Arrays.sort(strs);
        int min = Math.min(strs[0].length(),strs[size].length());
        int i=0;
        while(i<min && strs[0].charAt(i)==strs[size].charAt(i)){
            i++;
        }
        return strs[0].substring(0,i);
    }
}