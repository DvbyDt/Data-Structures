class Solution {
    public String restoreString(String s, int[] indices) {
        String output="";
        if(s.length()==indices.length){
            for(int i=0;i<indices.length;i++){
                for(int j=0;j<indices.length;j++){
                    if(i==indices[j]){
                        output+=s.charAt(j);
                        break;
                    }
                }
            }
        }
        return output;
    }
}