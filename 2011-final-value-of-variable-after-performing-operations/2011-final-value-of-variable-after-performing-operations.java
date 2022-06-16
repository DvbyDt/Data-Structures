class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x=0;
        for(int i=0;i<operations.length;i++){
            // if(operations[i].equals("--X") || operations[i].equals("X--")){
            //     x=x-1;
            // }
            // else {
            //     x=x+1;
            // }
            if(operations[i].charAt(1)=='+'){
                x=x+1;
            }else{
                x=x-1;
            }
        }
        return x;
    }
}