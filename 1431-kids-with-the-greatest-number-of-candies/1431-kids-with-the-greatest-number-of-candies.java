import java.util.ArrayList;
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = Integer.MIN_VALUE;
        //Finding the max first
        for(int i=0;i<candies.length;i++){
            if(max<candies[i]){
                max = candies[i];
            }
        }
       ArrayList<Boolean> greatestNumberCandies = new ArrayList<Boolean>(candies.length);
       for(int i=0;i<candies.length;i++){
           if(extraCandies+candies[i]>=max){
               greatestNumberCandies.add(true);
           }else{
               greatestNumberCandies.add(false);
           }
       }
    return greatestNumberCandies;
    }
}