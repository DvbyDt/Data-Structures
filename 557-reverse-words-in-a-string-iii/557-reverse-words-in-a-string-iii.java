class Solution {
    public String reverseWords(String str) {
        // String str="";
        // int spaceIndex=0;
        // for(int i=0;i<s.length();i++){
        //     int j=0;
        //     if(s.charAt(i)==' '){
        //         j=i-1;
        //     }
        //     else if(i==s.length()-1){
        //         j=i;
        //     }
        //     if(s.charAt(i)==' ' || i==s.length()-1){
        //         for(;j>=spaceIndex;j--){
        //             str+=s.charAt(j);
        //         }
        //         if(i!=s.length()-1){
        //             str+=" ";
        //         }
        //         spaceIndex=i+1;
        //     }
        // }
        // return str; 
         
        // String [] arr = str.split(" ");
        // String str1="";
        // for(int i=0;i<arr.length;i++) {
        // 	String word =arr[i];
        // 	for(int j= word.length()-1;j>=0;j--) {
        // 		str1+=word.charAt(j);
        // 	}
        //     if(i!=arr.length-1){
        //         str1+=" ";
        //     }      	
        // }
        // //System.out.println(str1);
        // return str10
//         var words = s.split(" ");
//       var result = String.valueOf("");
      
//       for(var word : words)
//         result += new StringBuilder(word).reverse().toString() + " ";
      
//       return result.trim();;
        
        String[] arr = str.split(" ");
        //String space="";
        String output = String.valueOf("");
        for(String vari:arr){
            output+= new StringBuilder(vari).reverse().toString()+" ";
        }
        return output.trim();
    }
}