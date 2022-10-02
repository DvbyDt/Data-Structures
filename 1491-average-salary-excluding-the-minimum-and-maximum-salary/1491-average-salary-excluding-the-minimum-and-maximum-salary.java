class Solution {
    public double average(int[] salary) {
        //Approach-1:Sort the array
        double avg = 0;
        int i=1;
        Arrays.sort(salary);
        for(i=1;i<salary.length-1;i++){
            avg = avg+salary[i];    
            System.out.println(avg+" :i"+i);
        }
           // System.out.println(" :i"+ (i-1));
        avg = avg/(i-1);
        return avg;
    }
}