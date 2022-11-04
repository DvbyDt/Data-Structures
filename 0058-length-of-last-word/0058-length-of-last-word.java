class Solution {
    public int lengthOfLastWord(String s) {
        //Appraoch-1
        // String[] str = s.split(" ");
        // return str[str.length-1].length();
        
        //Approach-2:
        int length=0;
        for (int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)!=' '){
                length++;
            }else{
                //If it's a space then check if we already passed the last element
                if(length>0){return length;}
            }
        }
        return length;
    }
}