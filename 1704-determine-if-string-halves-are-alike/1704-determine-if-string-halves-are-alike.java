class Solution {
    public boolean halvesAreAlike(String s) 
    {
//         // StringBuilder a1 = new StringBuilder();
//         // StringBuilder a2 = new StringBuilder();
//         int left=0,right=0;
//         for(int i=0;i<s.length();i++){
//             if(i<(s.length()/2)){
//                 // a1.append(s.charAt(i));
//                 if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'
//                   ||s.charAt(i)=='u'||s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'
//                   ||s.charAt(i)=='O'||s.charAt(i)=='U'){
//                     left++;
//                 }
//             }else{
//                 //a2.append(s.charAt(i));
//                 if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'
//                   ||s.charAt(i)=='u'||s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'
//                   ||s.charAt(i)=='O'||s.charAt(i)=='U'){
//                     right++;
//                 }
//             }
//         }
        
//         if(left==right){
//             return true;
//         }
//         return false;
        
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();
        int left=0,right=0;
        for(int i=0;i<s.length();i++){
            if(i<s.length()/2){
                s1.append(s.charAt(i));
                left = halves(s1.toString());
            }else{
                s2.append(s.charAt(i));
                right = halves(s2.toString());
            }
        }
        if(left==right){
            return true;
        }
        return false;
    }
    
    public static int halves(String s)
    {
        String s1 = "aeiouAEIOU";
        char[] arr = s.toCharArray();
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
           if(!(s1.indexOf(arr[i])!=-1))
            {
              count++;   
            }
             
        }
         return count;   
        }
}
        
        