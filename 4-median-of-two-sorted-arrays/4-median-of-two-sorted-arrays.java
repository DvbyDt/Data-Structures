class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n= nums2.length;
        if(m==0 && n==0){return 0.0;}
        int i=0,j=0,k=0;
        int [] arr = new int[m+n];
        while(i<m && j<n){
            if(nums1[i]<=nums2[j]){
                arr[k] = nums1[i];
                System.out.println("Value at k:"+k+"->"+arr[k]);
                // k++;
                i++;
            }else{
                arr[k] = nums2[j];
                System.out.println("Value at k:"+k+"->"+arr[k]);
                // k++;
                j++;
            }
            k++;
        }
        
        //Reamining elements for m
        while(k<arr.length && i<m){
            arr[k] = nums1[i];
            System.out.println("Value at k:"+k+"->"+arr[k]);
            k++;
            i++;
        }
        
        //Remaining for n
        while(k<arr.length && j<n){
            arr[k] = nums2[j];
            System.out.println("Value at k:"+k+"->"+arr[k]);
            k++;
            j++;
        }
        
        //Finding Median
        double med=0.0;
        //If even:
        if((arr.length%2)==0){
            int n1 = arr.length/2;//2
            int n2 = (arr.length/2)+1;//3
            med = ((double)(arr[n1-1]+arr[n2-1]))/2;//
        }else{//If odd:
            int n1 = (arr.length+1)/2;
            med = (double)arr[n1-1];
        }
        return med;
    }
}