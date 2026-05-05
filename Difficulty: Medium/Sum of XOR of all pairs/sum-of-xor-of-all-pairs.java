class Solution {
    public long sumXOR(int[] arr) {
        int n = arr.length;
        long result = 0;

        for (int bit = 0; bit < 32; bit++) {
            long count = 0;

            for (int num : arr) {
                if ((num & (1 << bit)) != 0) {
                    count++;
                }
            }

            long pairs = count * (n - count);
            result += pairs * (1L << bit);
        }

        return result;
    }
}