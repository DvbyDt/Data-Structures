class Solution {
    public int maximumPopulation(int[][] logs) {
         //First take the array which will store values from 1950 to 2050
        int[] arr = new int[101];//101 because 2050-1950+1; as it should have index from 0 to 100.
        //Fill the array 
        for(int[] a:logs){
            int by = a[0];
            int dy = a[1];
            
            //Assinging value for birth till there death;
            arr[by-1950]++;//Incrment from the birth year till death-1 index;
            arr[dy-1950]--;//Decrement his death year
        }
        
        int max = arr[0];
        int year = 1950;
        for(int i=1;i<arr.length;i++)
        {
            //Take the prefix sum
            arr[i]+=arr[i-1];
            if(max<arr[i])
            {
                max = arr[i];
                year = 1950+i;
            }   
        }           
        return year;
    }
}