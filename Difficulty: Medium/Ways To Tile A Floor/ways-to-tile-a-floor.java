class Solution {
    public int numberOfWays(int n) {
        if (n <= 2) return n;     
        long a = 1, b = 2;        
        for (int i = 3; i <= n; i++) {
            long c = a + b;        
            a = b;
            b = c;
        }
        return (int) b;            
    }
}