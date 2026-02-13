class Solution {
    
    private long digitSum(long x) {
        long sum = 0;
        while (x > 0) {
            sum += x % 10;
            x /= 10;
        }
        return sum;
    }
    
    public int getCount(int n, int d) {
        long low = 1, high = n;
        long start = -1;
        
        while (low <= high) {
            long mid = low + (high - low) / 2;
            
            if (mid - digitSum(mid) >= d) {
                start = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        
        if (start == -1) return 0;
        
        return (int)(n - start + 1);
    }
}