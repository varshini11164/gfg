// User function Template for Java
class Solution {
    int countPairs(int[] arr, int k) {
        // code here
        HashMap<Integer,Integer> freq=new HashMap<>();
        int cnt=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(freq.containsKey(arr[i]+k)){
                cnt =cnt+freq.get(arr[i]+k);
            }
            if(freq.containsKey(arr[i]-k)){
                cnt=cnt+freq.get(arr[i]-k);
            }
            if(freq.containsKey(arr[i])){
                freq.put(arr[i],freq.get(arr[i])+1);
            }
            else {
                freq.put(arr[i],1);
            }
        }
        return cnt;
            
    }
}