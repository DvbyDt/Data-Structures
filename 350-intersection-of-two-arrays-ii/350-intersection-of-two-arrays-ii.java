class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        //Comapring values
        ArrayList<Integer> arr = new ArrayList<>();
        int i=0,j=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]==nums2[j]){
                arr.add(nums1[i]);
                i++;
                j++;
            }else if(nums1[i]<nums2[j]){
                i++;
            }else{
                j++;
            }
        }
       int [] ans = new int[arr.size()];
       //Return the elements
        int k=0;
       for(int n:arr){
           ans[k++] = n;
       }
       return ans;        
    }
}