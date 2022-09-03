class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        //1. First sort the two Arrays
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        //2.Take array list and apply two pointer
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0,j=0;i<nums1.length && j<nums2.length;){
            if(nums1[i]==nums2[j] && !arr.contains(nums1[i])){
                arr.add(nums1[i]);
                i++;j++;
            }else if(nums1[i]>nums2[j]){
                j++;
            }else{
                i++;
            }
        }
        int[] ans =new int[arr.size()];
        int i=0;
        for(int n:arr){
            ans[i] = n;
            i++;
        }
        return ans;
    }
}