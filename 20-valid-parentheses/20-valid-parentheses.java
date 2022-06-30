class Solution {
    public boolean isValid(String s) {
        Stack<Character> input = new Stack<Character>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='['){
                input.push(s.charAt(i));
            }
            else{      
                if(input.size()!=0 && (s.charAt(i)==')' && input.peek()=='(' || s.charAt(i)==']' && input.peek()=='[' || s.charAt(i)=='}' && input.peek()=='{'))
                {
                   input.pop(); 
                }
                else{
                    return false;
                }                
            }
        }
        return input.size() ==0 ? true : false;
    }
}