class Solution {
    public long subarrayXor(int arr[], int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        long count = 0;
        int prefix = 0;
        map.put(0, 1);
        
        for (int num : arr) {
            prefix ^= num;
            count += map.getOrDefault(prefix ^ k, 0);
            map.put(prefix, map.getOrDefault(prefix, 0) + 1);
        }
        
        return count;
    }
}