class Solution {
    public int repeatedStringMatch(String a, String b) {
        int count=0;
        StringBuilder sb = new StringBuilder();
        while(sb.length()<b.length()){
            sb.append(a);
            count++;
        }
        if(sb.toString().contains(b)){
            return count;    
        }
        //If length is same and abhi bhi ek do characters from b are not there then add them
        else if(sb.append(a).toString().contains(b)){
            return count+1;
        }
        return -1;        
    }
}