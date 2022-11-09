class Solution {
    public int nextGreaterElement(int n) {
        //There are three cases in this proble that have to be though of.
        char[] ch = String.valueOf(n).toCharArray();
        int i=ch.length-2;
        StringBuilder sb = new StringBuilder();        
        while(i>=0 && ch[i]>=ch[i+1] ){
            i--;
        }
        //Case 1:if nothing is greater
        if(i==-1){return -1;}
        
        //Case 2:Swap numbers inbetween
        int k=ch.length-1;
        while(ch[i]>=ch[k]){
            k--;
        }
        swap(ch,i,k);
        //Now sort the remaning piece
        Arrays.sort(ch,i+1,ch.length);
        for(int j=0;j<ch.length;j++){
            sb.append(ch[j]);
        }
        long ans = Long.parseLong(sb.toString());
        if(ans>Integer.MAX_VALUE){
            return -1;
        }else{
            return (int)ans;
        }
    }
    
    public static void swap(char[] ch,int i,int k){
        char temp = ch[i];
        ch[i] = ch[k];
        ch[k] = temp;
    }
}