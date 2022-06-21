class Solution {
    public String truncateSentence(String s, int k) {
        String output="";
        //if(s.length()>=1 && s.length()<=500){
            String[] arr = s.split(" ");
            for(int i=0;i<arr.length;i++){
                if(i<k){
                    if(i==k-1){
                        output+=arr[i];
                    }else{
                        output+=arr[i]+" ";    
                    }                    
                }
            }
        //}
        return output;
    }
}