class Solution {
    public boolean checkIfPangram(String sentence) {
//          if(sentence.length()==0) {
// 			 return true;
// 		 }
// 		 if(sentence.length()==1) {
// 			 return false;
// 		 }
// 		 int [] frequency_array = new int[256];
// 		 for(int i=0;i<sentence.length();i++) {
// 			 frequency_array[(int)sentence.charAt(i)] += 1;
// 		 }
// 		 for(int i=97;i<123;i++) {
// 			 if(frequency_array[i]<1) {
// 				 return false;
// 			 }
// 		 }
		 
// 		 return true;
        
		 // //Better solution
		 // boolean panagram = true;
		 // for(char c='a';c<='z';c++) {
		 // if(!sentence.contains(String.valueOf(c))) {
		 // panagram = false;
		 // break;
		 // }
		 // }
		 // return panagram;	
        
        //Even Better
        if(sentence.length()<26){
            return false;
        }
        for(char c='a';c<='z';c++){
            if(sentence.indexOf(c)<0){
                return false;
            }
        }
        return true;
    }
}