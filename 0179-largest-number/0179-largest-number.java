class Solution {
    public String largestNumber(int[] nums) {
        //1. Take a string array put everything in it.
        String[] arr = new String[nums.length];
        for(int i=0;i<arr.length;i++){
            arr[i] = nums[i]+"";
        }
        //2. Now sort them 
        Arrays.sort(arr,(a,b)->{
            //Take long because chances are it might not be in range of an integer.
            Long n1 = Long.parseLong(a+b);
            Long n2 = Long.parseLong(b+a);
            if(n1>n2){
                return 1;
            }else if(n1<n2){
                return -1;
            }else{
                return 0;
            }
        });
        //Check for 0 always
        if(arr[arr.length-1].charAt(0) == '0'){
            return "0";
        }
        //Now put everything in a StringBuilder and return
        StringBuilder sb = new StringBuilder("");
        for(int i=arr.length-1;i>=0;i--){
            sb.append(arr[i]);
        }
        return sb.toString();
    }
}