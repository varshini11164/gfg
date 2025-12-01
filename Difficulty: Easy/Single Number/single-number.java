// User function Template for Java

class Solution {
    int getSingle(int arr[]) {
        int count=arr[0];
        for(int i=1;i<arr.length;i++){
            count^=arr[i];
        }
        return count;
    }
}