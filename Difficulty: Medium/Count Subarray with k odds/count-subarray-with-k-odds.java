class Solution {
    public int countSubarrays(int[] arr, int k) {
        java.util.HashMap<Integer, Integer> map = new java.util.HashMap<>();
        map.put(0, 1);

        int sum = 0, ans = 0;

        for (int x : arr) {
            sum += x & 1;                 // add 1 if odd
            ans += map.getOrDefault(sum - k, 0);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return ans;
    }
}