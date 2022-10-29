class Solution {
    public boolean isLongPressedName(String name, String typed) {
        int i=0,j=0;
        for(;i<name.length() && j<typed.length();){
            //Check if both chars are equal
            if(name.charAt(i)==typed.charAt(j)){
                i++;j++;
            }else{
                //If j equals the previous character
                if(i>0 && name.charAt(i-1)==typed.charAt(j)){
                    j++;
                }else{
                    return false;
                }
            }
        }
        //If j is still left
        while(j<typed.length()){
            if(typed.charAt(j)==name.charAt(name.length()-1)){
                j++;
            }else {
                return false;
            }    
        }
        //Suppose if i is left somehow
        if(j>=typed.length() && i<name.length()){
            return false;
        }
        return true;
    }
}