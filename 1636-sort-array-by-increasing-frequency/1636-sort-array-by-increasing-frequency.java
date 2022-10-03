class Solution {
    public int[] frequencySort(int[] nums) {
        //Approach-1
        //Map to store the number and frequency
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        //Iterating over the array
        Arrays.stream(nums).forEach(n -> map.put(n,map.getOrDefault(n,0)+1));
        //Then applying custom sort
        return  Arrays.stream(nums).boxed()
        .sorted((a,b) -> map.get(a)!=map.get(b) ? map.get(a) - map.get(b) : b - a)
        .mapToInt(n->n)
        .toArray();                           
    }
}