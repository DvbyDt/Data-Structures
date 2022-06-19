class Solution {
    public String restoreString(String s, int[] indices) {
        String output="";
        if(s.length()==indices.length){
            // for(int i=0;i<indices.length;i++){
            //     for(int j=0;j<indices.length;j++){
            //         if(i==indices[j]){
            //             output+=s.charAt(j);
            //             break;
            //         }
            //     }
            // }
            char[] arr = new char[indices.length];
            //Storing values in the char array
            for(int i=0;i<indices.length;i++){
                arr[indices[i]] = s.charAt(i);
            }            
            return new String(arr);
            
        }
        return output;
    }
}