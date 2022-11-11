class Solution {
    public boolean canTransform(String start, String end) {
        if(!start.replace("X","").equals(end.replace("X",""))){return false;}
        if(start.length()<end.length()){return false;} 
        int stR =0,enR=0,enL=0,stL=0;
        for(int i=0;i<start.length();i++){
            if(start.charAt(i)=='R') stR++;
            if(end.charAt(i)=='R') enR++;
            if(start.charAt(i)=='L') stL++;
            if(end.charAt(i)=='L') enL++;
            if(enR>stR || stL>enL) return false;
        }
        
        return true;
    //     String startModified = start.replace("X", "");
    // String endModified = end.replace("X", "");
    // if (!startModified.equals(endModified)) return false;
    // int stR = 0, enR = 0, stL = 0, enL = 0;
    // for (int i = 0; i < start.length(); i++) {
    //   if (start.charAt(i) == 'R') stR++;
    //   if (end.charAt(i) == 'R') enR++;
    //   if (start.charAt(i) == 'L') stL++;
    //   if (end.charAt(i) == 'L') enL++;
    //   if (enR > stR || stL > enL) return false;
    // }
    // return true;
    }
}