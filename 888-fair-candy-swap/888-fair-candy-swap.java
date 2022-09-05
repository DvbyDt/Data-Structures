class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int suma = 0,sumb = 0;
        //Finding sum of both Alice and Bob
        for(int i=0;i<aliceSizes.length;i++){
            suma+=aliceSizes[i];
        }
        for(int i=0;i<bobSizes.length;i++){
            sumb+=bobSizes[i];
        }
        
        Arrays.sort(aliceSizes);
        //Getting the difference i.e delta
        int diff = (suma-sumb)/2;
        //Now travesring and applying binary search to it
        for(int num:bobSizes){
            if(binarySearch(aliceSizes,num+diff)!=-1){
                return new int[]{num+diff,num};
            }
        }
        return null;
    }
    
    public static int binarySearch(int[] aliceSizes,int target){
        int start = 0,end= aliceSizes.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(aliceSizes[mid]==target){
                return mid;   
            }
            else if(target > aliceSizes[mid]){
                start = mid+1;
            }else{
                end = mid-1;
            }
    }
        return -1;
   }
}