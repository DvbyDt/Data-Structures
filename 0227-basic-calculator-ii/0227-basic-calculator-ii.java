class Solution {
    public int calculate(String s) {
         int n;
    if(s == null || (n = s.length()) == 0) {
        return 0;
    }
    char sign = '+';
    char opt = '*';
    int res = 0;
    int prev = 1;
    int num = 0;

    for(int i = 0; i <= n; i++) {
        char c = i == n ? 0 : s.charAt(i);
        if(c == ' ') {
            continue;
        }
        if(c >= '0' && c <= '9') {
            num = num * 10 + (c - '0');
            continue;
        }
        if(c == 0 || "+-*/".indexOf(c) >= 0) {
            prev = opt == '*' ? prev * num : prev / num;
            num = 0;
            if(c == '+' || c == '-' || c == 0) {
                res += sign == '+' ? prev : -prev;
                prev = 1;
                sign = c;
                opt = '*';
            } else {
                opt = c;
            }
        }
    }
    return res;
    }
}