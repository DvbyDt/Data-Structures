class Solution {
    public boolean areSentencesSimilar(String sentence1, String sentence2) {
        //Taking the largest size of the string and makeing it as s1.
        if(sentence1.length() < sentence2.length()){
            String temp = sentence1;
            sentence1 = sentence2;
            sentence2 = temp;
        }
        //Splliting the String
        String[] arr1 = sentence1.split(" ");
        String[] arr2 = sentence2.split(" ");
        
        //Now applying two pointer appraoch
        int i1=0,i2=0,j1=arr1.length-1,j2=arr2.length-1;
        while(i2<=j2){
            if(arr1[i2].equals(arr2[i2])){
                i1++;
                i2++;
            }else if(arr1[j1].equals(arr2[j2])){
                j1--;
                j2--;
            }else{
                return false;
            }
        }
        return true;
    }
}