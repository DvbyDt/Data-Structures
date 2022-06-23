class Solution {
    public boolean judgeCircle(String moves) {
        int moveup = 0,moveleft=0,moveright=0,movedown=0;
        for(int i=0;i<moves.length();i++){
            if(moves.charAt(i)=='L'){
                moveleft++;
            }else if(moves.charAt(i)=='U'){
                moveup++;
            }else if(moves.charAt(i)=='R'){
                moveright++;
            }
            else{
                movedown++;
            }
        }
        if(moveup==movedown && moveleft == moveright){return true;}
        return false;
    }
}