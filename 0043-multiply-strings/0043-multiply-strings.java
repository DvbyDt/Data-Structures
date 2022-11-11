class Solution {
    public String multiply(String num1, String num2) {
        int m=num1.length()-1,n=num2.length()-1;
        int products[] = new int[num1.length()+num2.length()];
        for(int i=m;i>=0;i--){
            for(int j=n;j>=0;j--){
                products[i+j+1]+= (num1.charAt(i)-'0') * (num2.charAt(j)-'0');
            }
        }
        
        int carry=0;
        for(int i=products.length-1;i>=0;i--){
            int temp = (products[i]+carry)%10;
            carry = (carry+products[i])/10;
            products[i] = temp;
        }
        StringBuilder sb = new StringBuilder();
        for(int nums:products){
            sb.append(nums);
        }
        while(!(sb.length()==0) && sb.charAt(0)=='0') { sb.deleteCharAt(0);}
        return sb.length()==0 ?  "0":sb.toString();
        
    }
}