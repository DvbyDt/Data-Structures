class Solution {
    public boolean checkIfExist(int[] arr) {
        //base case
        if(arr.length==0){return true;}        
        //Approach-1:Basic
        // for(int i=0;i<arr.length;i++){
        //     for(int j=0;j<arr.length;j++){
        //         if(i!=j && arr[i]==2*arr[j]){
        //             return true;
        //         }
        //     }
        // }
        // return false;
        //Approach-2: Binary search
        Arrays.sort(arr);
        
        int res=-1;
        for(int i=0;i<arr.length;i++){
          res = binarysearch(arr,2*arr[i]);  
          if(res!=-1 && i!=res){
              return true;
         }
        }        
        return false;
    }
    
    public static int binarysearch(int[] arr, int target){
        int start = 0,end = arr.length-1;
        while(start<=end){
                int mid = start+(end-start)/2;
                System.out.println("Mid:"+mid);
                if(arr[mid] == target){
                    System.out.println("This is the answer:"+mid);
                    return mid;
                }else if(arr[mid] < target){
                    start = mid+1;
                }else{
                    end = mid-1;
                }
            }
        return -1;
    }
}