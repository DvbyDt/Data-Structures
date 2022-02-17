import java.util.ArrayList;
import java.util.Collections;
class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
	     // int ans = 0;
	     // for(int i=0;i<num.length;i++) {
	     // ans = (int) (ans+Math.pow(10, num.length-1-i)*num[i]);	    	 
	     // }
	     // ans = ans+k;
	     // List<Integer> ansArray = new ArrayList<Integer>();
	     // while(ans!=0) {
	     // ansArray.add(ans%10);
	     // ans= ans/10;
	     // }
	     // //Reversing using collections
	     // // Collections.reverse(ansArray);
	     // //Reversing without using extra space
	     // //Just traverse till n/2 places
	     // for(int i=0;i<ansArray.size()/2;i++) {
	     // int temp = ansArray.get(i);
	     // ansArray.set(i, ansArray.get(ansArray.size()-i-1));//eg:last element
	     // ansArray.set(ansArray.size()-i-1, temp);
	     // }
	     // return ansArray;
        List<Integer> list = new ArrayList<Integer>();
        int carry=0;
        int i=num.length-1;
        while(i>=0 || k>0 ||carry>0){
            int n = 0;
            if(i >= 0){
                n =num[i];               
            }
            i--;
            int b=0;
            if(k>0){
                b = k%10;
                k = k/10;
            }
            int rem = (carry+n+b)%10;
            int quo = (carry+n+b)/10;
            carry = quo;
            list.add(rem);
        }
        //Reversing using collections
        Collections.reverse(list);
        return list;        
    }
}