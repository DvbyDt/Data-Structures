class Solution {
    public String convertToTitle(int columnNumber) {
        if(columnNumber==0){return "";}
        StringBuilder sb = new StringBuilder();
        while(columnNumber>26){
            int rem = columnNumber%26;
            if(rem==0){
                sb.append('Z');
                columnNumber-=26;
            }else{
                sb.append((char)(rem+'A'-1));
            }
            columnNumber/=26;
        }
        
        sb.append((char)(columnNumber+64));
        return sb.reverse().toString();
    }
}