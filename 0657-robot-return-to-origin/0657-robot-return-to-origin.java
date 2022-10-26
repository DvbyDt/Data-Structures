class Solution {
    public boolean judgeCircle(String moves) {
        //Approach-1:Take complimentary directions and quate them at the time of recording.
        int moveL=0,moveR=0,moveD=0,moveU=0;
        for(int i=0;i<moves.length();i++){
            if(moves.charAt(i)=='U'){
                moveU++;
            }else if(moves.charAt(i)=='D'){
                moveD++;
            }else if(moves.charAt(i)=='L'){
                moveL++;
            }else{
                moveR++;
            }
        }
        
        if(moveL==moveR && moveD==moveU){return true;}
        
        return false;
        
    }
}