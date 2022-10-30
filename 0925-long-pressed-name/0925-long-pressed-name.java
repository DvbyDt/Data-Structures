class Solution {
    public boolean isLongPressedName(String name, String typed) {
        //Approach-1
        // int i=0,j=0;
        // for(;i<name.length() && j<typed.length();){
        //     //Check if both chars are equal
        //     if(name.charAt(i)==typed.charAt(j)){
        //         i++;j++;
        //     }else{
        //         //If j equals the previous character
        //         if(i>0 && name.charAt(i-1)==typed.charAt(j)){
        //             j++;
        //         }else{
        //             return false;
        //         }
        //     }
        // }
        // //If j is still left
        // while(j<typed.length()){
        //     if(typed.charAt(j)==name.charAt(name.length()-1)){
        //         j++;
        //     }else {
        //         return false;
        //     }    
        // }
        // //Suppose if i is left somehow
        // if(j>=typed.length() && i<name.length()){
        //     return false;
        // }
        // return true;
        
        //Approach-2
        int m = name.length() , n = typed.length();
        int i=0,j=0;
        while(i<m && j<n){            
            char c1 = name.charAt(i),c2 = typed.charAt(j);
            //Give false if not equal
            if(c1!=c2){return false;}            
            int count1=0,count2=0;
            //Now searching both the strings
            while(i<m && c1==name.charAt(i)){
                count1++;
                i++;
            }
            while(j<n && c2==typed.charAt(j)){ //This will also eliminate the duplicates
                count2++;
                j++;
            }
            
            if(count1>count2) {return false;}
        }
        
        return i==m && j==n;//Reached the end
    }
}