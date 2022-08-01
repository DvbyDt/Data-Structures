class Solution {
    public boolean isAnagram(String s, String t) {
        int[] arr = new int[26];
        //Putting values into the array
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'a']++;
        }
        //Now decrementing
        for(int i=0;i<t.length();i++){
            arr[t.charAt(i)-'a']--;
        }
        //Now check the array
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                return false;
            }
        }
        return true;
    }
}