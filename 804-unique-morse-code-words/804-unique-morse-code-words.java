class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        //Create an array of morse code
        String[] mcode = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        //Now create an array list that will store all the transformations.
        ArrayList<String> list = new ArrayList<String>();
        for(int i=0;i<words.length;i++){
            //Taking a temporary string that will store the mcodes as a string
            String temp="";
            String word = words[i];
            for(int j=0;j<word.length();j++){
                //Get the mcode index and concatenate it to temp string.
                temp+=mcode[(int)(word.charAt(j))-97];                
            }
            //At last just check whether the list already contains that particular mcode String 
            //or not.
            if(!list.contains(temp)){
                list.add(temp);
            }
        }
        return list.size();
    }
}