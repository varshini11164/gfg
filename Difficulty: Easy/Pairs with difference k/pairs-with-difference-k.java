// User function Template for Java
class Solution {
    public int countPairs(int[] arr, int k) {
        // Create a frequency map
        Map<Integer, Integer> freq = new HashMap<>();
        
        // Count frequency of each element
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        
        int count = 0;
        for (int num : freq.keySet()) {
            if (freq.containsKey(num + k)) {
                count += freq.get(num) * freq.get(num + k);
            }
        }
        
        return count;
    }
}