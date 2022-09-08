class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        //base case: if h<piles.length return 0;
        if(h<piles.length){return 0;}
        //FInding the max from piles
        int max = -1;
        for(int i=0;i<piles.length;i++){
            if(max<piles[i]){
                max = piles[i];
            }
        }
        
        int start = 0, end = max, speed = 0;
        while(start <= end){
            int mid = start+(end-start)/2;
            int sum = 0;
            for(int i=0;i<piles.length;i++){
                sum = sum + (int)(Math.ceil(piles[i]*1.0/mid));
                //System.out.println("SUm: "+sum);
            }
            if(sum <= h){
                speed = mid;
                //System.out.println("speed: "+speed);
                end = mid-1;
            }else{
                //System.out.println("Mid: "+mid);
                start = mid+1;
            }
        }
        return speed;
    }
}