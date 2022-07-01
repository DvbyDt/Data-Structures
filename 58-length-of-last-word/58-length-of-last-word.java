class Solution {
    public int lengthOfLastWord(String s) {
        //int count=0;
	        String[] str = s.split(" ");
	        return str[str.length-1].length();
    }
}