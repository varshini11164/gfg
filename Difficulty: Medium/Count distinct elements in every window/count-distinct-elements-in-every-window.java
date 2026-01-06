class Solution {
    ArrayList<Integer> countDistinct(int[] arr, int k) {
        ArrayList<Integer> result = new ArrayList<>();
        if(k > arr.length) return result;

        HashMap<Integer, Integer> freq = new HashMap<>();
        int start = 0;

        for(int end = 0; end < arr.length; end++){
            freq.put(arr[end], freq.getOrDefault(arr[end], 0) + 1);
            if(end - start + 1 > k){
                int left = arr[start];
                freq.put(left, freq.get(left) - 1);
                if(freq.get(left) == 0) {
                    freq.remove(left);
                }
                start++;
            }
            if(end - start + 1 == k){
                result.add(freq.size());
            }
        }

        return result;
    }
}