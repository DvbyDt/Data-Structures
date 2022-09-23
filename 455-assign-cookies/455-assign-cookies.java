class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        //Count of both the pointers
        int g_pointer = 0, s_pointer = 0;
        for(;g_pointer<g.length && s_pointer<s.length;){
            if(g[g_pointer]<=s[s_pointer]){
                g_pointer++;
                s_pointer++;
            }else{
                s_pointer++;
            }
        }
        return g_pointer;
    }
}