class Solution {
     public static String sortSentence(String s) {
	        String output="";
	        String[] arr1 = s.split(" ");
	        String[] arr2 = new String[arr1.length];
	        // for(int i=0;i<arr1.length;i++){
	        //     int len = arr1[i].length();
	        //     int temp = Integer.parseInt(String.valueOf(arr1[i].charAt(len-1)));
	        //     arr2[temp-1] = arr1[i];
	        // }
	        // for(int i=0;i<arr2.length;i++){
	        // 	String temp = arr2[i].substring(0,arr2[i].length()-1);
	        //     if(i==arr2.length-1){
	        //         output+=temp;
	        //     }else{
	        //         output+=temp+" ";
	        //     }            
	        // }
            for(int i=0;i<arr1.length;i++){
                char temp = arr1[i].charAt(arr1[i].length()-1);
                arr2[temp-'0'-1] = arr1[i].substring(0,arr1[i].length()-1);
                
            }
         for(int i=0;i<arr2.length;i++){
	        	//String temp = arr2[i].substring(0,arr2[i].length()-1);
	            if(i==arr2.length-1){
	                output+=arr2[i];
	            }else{
	                output+=arr2[i]+" ";
	            }            
	        }
	        return output;
	    }
}