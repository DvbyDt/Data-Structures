class Solution {
    public String convertToTitle(int columnNumber) {
        // String output="";
//         if(columnNumber<27){
//             output = output + (char)(64+columnNumber);
//         }else{
            
//         }        
//          while(columnNumber!=0){
// 	           int rem = columnNumber%26;	           
// 	            if(rem==0)
// 	            {
// 	                columnNumber-=26;
// 	                if(columnNumber==0) {
// 	                	output = (char)(64+columnNumber+1)+output;
// 	                }else {
// 	                	 output=(char)(64+columnNumber)+output;
// 	                }	               
// 	            }else
// 	            {
// 	            	columnNumber = columnNumber/26;
// 	                output = (char)(64+rem)+output;
// 	            }
	           
// 	        }        
        
        StringBuilder output = new StringBuilder();
        while(columnNumber>26){
            int rem = columnNumber%26;
            if(rem==0){
                output.append('Z');
                columnNumber-=26;
            }else{
                output.append((char)(rem+'A'-1));
            }
            columnNumber/=26;
        }
            output.append((char)(columnNumber+'A'-1));
                
        return output.reverse().toString();
    }
}