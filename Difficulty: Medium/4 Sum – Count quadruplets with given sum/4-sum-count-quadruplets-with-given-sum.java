class Solution {
    public int countSum(int arr[], int target) {
        int n = arr.length;
        HashMap<Integer , Integer> map = new HashMap<>();
        int count = 0 ;
        for(int i = 0 ;i<n ;i++){
            for(int j = i+1 ;j<n;j++){
                int sum = arr[i] + arr[j];
                if(map.containsKey(target - sum)){
                    count = count + map.get(target - sum);
                }
            }
            for(int j = 0 ;j<i ;j++){
                int temp = arr[i] + arr[j];
                map.put(temp, map.getOrDefault(temp, 0) + 1);
            }
        }
        return count;
    }
}

