class Solution {
    public String interpret(String command) {
        String str="";
        for(int i=0;i<command.length();i++){
            if(command.charAt(i)=='G'){
                str=str+'G';
            }
            else if(i+1<command.length() && command.charAt(i)=='(' && command.charAt(i+1)==')'){
                str=str+'o';
            }
            else if(i+1<command.length() && command.charAt(i)=='(' && command.charAt(i+1)=='a'){
                str=str+"al";
            }
        }
        return str;
        
    }
}