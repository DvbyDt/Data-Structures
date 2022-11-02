class Solution {
    public int romanToInt(String s) {
        int count=0;
        //int p = 0;
        for(int i=s.length()-1;i>-1;i--){
            if(s.charAt(i)=='I'){
                count = count+1;
            }else if(s.charAt(i)=='V'){
                if(i-1>-1 && s.charAt(i-1)=='I'){
                    count =count+4;
                    i--;
                }else{
                    count =count+5;
                } 
            }else if(s.charAt(i)=='X'){
                if(i-1>-1 && s.charAt(i-1)=='I'){
                    count =count+9;
                    i--;
                }else{
                    count =count+10;    
                }                
            }else if(s.charAt(i)=='L'){
                if(i-1>-1 && s.charAt(i-1)=='X'){
                    count =count+40;
                    i--;
                }else{
                    count =count+50;
                } 
            }else if(s.charAt(i)=='C'){
                if(i-1>-1 && s.charAt(i-1)=='X'){
                    count =count+90;
                    i--;
                }else{
                    count = count+100;   
                }                
            }else if(s.charAt(i)=='D'){
                if(i-1>-1 && s.charAt(i-1)=='C'){
                    count =count+400;
                    i--;
                }else{
                    count =count+500;
                } 
            }else if(s.charAt(i)=='M'){
                if(i-1>-1 && s.charAt(i-1)=='C'){
                    count =count+900;
                    i--;
                }else{
                    count =count+1000;   
                }                    
            }
            //p++;
        }
        return count;
    }
}