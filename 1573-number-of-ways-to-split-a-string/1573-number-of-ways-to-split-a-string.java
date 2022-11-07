class Solution {
    public int numWays(String s) {
        int mod = (int)Math.pow(10,9)+7;
        
        //First count the number of ones in the string
        int countOnes=0;
        char ch[] = s.toCharArray();
        for(char c:ch){
            if(c=='1'){
                countOnes++;
            }
        }
        //Case 1:If count mod 1 !=0
        if(countOnes%3!=0){return 0;}
        
        //Case 2: If it does not contain any ones
        else if(countOnes==0){
            long length = s.length();
            return (int)((length-1) * (length-2)/ 2 % mod);
        }
        
        //Now find how many groups will be formed of countOnes
        int countPerGroup = countOnes/3;
        int counter=0;
        long firstBlock=0,secondBlock=0;
        for(char c:ch){
            if(c=='1'){
                counter++;
            }
            //After counting ones check the first and second block.
            if(counter==countPerGroup){
                firstBlock++;
            }else if(counter==2*countPerGroup){
                secondBlock++;
            }
        }
        return (int)(firstBlock*secondBlock % mod);
    }
}