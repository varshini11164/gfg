class Solution {
    public int maxDistance(int[] arr) {
        // Code here
        HashMap<Integer, Integer> map=new HashMap<>();
        int res=0;
        for(int i=0;i<arr.length;i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i],i);
            }
            else{
                int d=i-map.get(arr[i]);
                res=Math.max(res, d);
            }
        }
        return res;
    }
}