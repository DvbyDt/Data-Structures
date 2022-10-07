class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        // Arrays.sort(nums);
        // ArrayList<List<Integer>> arr = new ArrayList<List<Integer>>();        
        // for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         long t = target - nums[i];
        //         long target2 = t - nums[j];
        //         int left = j+1;
        //         int right = nums.length-1;
        //         while(left<right){
        //             int two_sum = nums[left]+nums[right];
        //             if(two_sum<target2){
        //                 left++;
        //             }else if(two_sum>target2){
        //                 right--;
        //             }else{
        //                 List<Integer> ans = new ArrayList<Integer>();
        //                 ans.add(nums[i]);
        //                 ans.add(nums[j]);
        //                 ans.add(nums[left]);
        //                 ans.add(nums[right]);
        //                 arr.add(ans);
        //                 while(left<right && nums[left]==ans.get(2)){
        //                   ++left;
        //                 }
        //                 while(left<right && nums[right]==ans.get(3)){
        //                   --right;
        //                 }
        //             }
        //         }
        //        while(j+1<nums.length && nums[j+1]==nums[j]){
        //           ++j;
        //         }
        //     }
        //     while(i+1<nums.length && nums[i+1]==nums[i]){
        //         ++i;
        //     }
        // }
        // return arr;
        
        //Sort the arrays
        Arrays.sort(nums);
        //Will apply 3Sum after reducing a 4Sum problem to 3Sum.
        List<List<Integer>> res = new LinkedList<>();
        for(int i=0;i<nums.length-3;i++){//n-k to reduce it to k elements
            // if(i==0 || (i>0 && nums[i]!=nums[i-1])){
              for(int j=i+1;j<nums.length-2;j++){
               // if(j==i+1 && nums[j]!=nums[j-1]){
                  long target_1 = target-nums[i];
                  long target_2 = target_1-nums[j];
                  int si = j+1 , ei = nums.length-1;
                  while(si<ei){
                      long sum = nums[si]+nums[ei];
                      if(sum==target_2){
                          //System.out.println("Sum :"+sum+"for i: " +i);
                          res.add(Arrays.asList(nums[i],nums[j],nums[si],nums[ei]));
                          //Now just check the next values duplicates
                          while(si<ei && nums[si]==nums[si+1]) {si++;}
                          while(si<ei && nums[ei]==nums[ei-1]) {ei--;}                          
                          si++;
                          ei--;                          
                      }else if(sum>target_2){
                          ei--;
                      }else{
                          si++;
                      }
                    }
                  //Checking duplicates
                  while(j+1<nums.length && nums[j]==nums[j+1]){j++;}
                // }            
              }
           // }            
            while(i+1<nums.length && nums[i]==nums[i+1]){i++;}
        }
        return res;  
        
//         ArrayList<List<Integer>> res = new ArrayList<List<Integer>>();
        
//         if (num == null || num.length == 0)
//             return res;
        
//         int n = num.length;
    
//         Arrays.sort(num); 
    
//         for (int i = 0; i < n; i++) {
        
//             long target_3 = target - num[i];
        
//             for (int j = i + 1; j < n; j++) {
            
//                 long target_2 = target_3 - num[j];
            
//                 int front = j + 1;
//                 int back = n - 1;
            
//                 while(front < back) {
                
//                     int two_sum = num[front] + num[back];
                
//                     if (two_sum < target_2) front++;
                
//                     else if (two_sum > target_2) back--;
                
//                     else {
                    
//                         List<Integer> quad = new ArrayList<>(); 
//                         quad.add(num[i]);
//                         quad.add(num[j]);
//                         quad.add(num[front]);
//                         quad.add(num[back]);
//                         res.add(quad);
                    
//                         // Processing the duplicates of number 3
//                         while (front < back && num[front] == quad.get(2)) ++front;
                    
//                         // Processing the duplicates of number 4
//                         while (front < back && num[back] == quad.get(3)) --back;
                
//                     }
//                 }
                
//                 // Processing the duplicates of number 2
//                 while(j + 1 < n && num[j + 1] == num[j]) ++j;
//             }
        
//             // Processing the duplicates of number 1
//             while (i + 1 < n && num[i + 1] == num[i]) ++i;
        
//         }
        
    
//         return res;
    }
}