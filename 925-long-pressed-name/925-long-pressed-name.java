class Solution {
    public boolean isLongPressedName(String name, String typed) {
        boolean istrue = false;
        int i=0,j=0;
        for(;i<name.length() && j<typed.length();){
            if(name.charAt(i)==typed.charAt(j)){
                istrue = true;
                i++;
                j++;
            }else{
                if(i>0 && typed.charAt(j)==name.charAt(i-1)){
                    istrue = true;
                    j++;
                }else{
                    istrue = false;
                    break;
                }
            }
        }
        while(j<typed.length()){
            if(i>0 && typed.charAt(j)==name.charAt(i-1)){
                istrue = true;
            }else{
                istrue = false;
                break;
            }
            j++;
        }
        if(j==typed.length() && i<name.length()){
            return false;
        }
        return istrue; 
    }
}