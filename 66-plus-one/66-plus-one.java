class Solution {
    public int[] plusOne(int[] digits) {
        // if(digits[digits.length-1]!=9){
        //     digits[digits.length-1]++;
        //     return digits;
        // }else{
        //     int[] arr = new int[digits.length+1];
        //     int carry = 0;
        //     for(int i=digits.length-1;i>=0;i--){
        //         arr[i+1] = (digits[i]+1)%10;
        //         arr[i] = carry+(digits[i]+1)/10;
        //     }
        //     return arr;
        // }
        int n = digits.length;
        int[] arr = new int[n+1];
        for(int i=digits.length-1;i>=0;i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        arr[0] = 1;
        return arr;
    }
}