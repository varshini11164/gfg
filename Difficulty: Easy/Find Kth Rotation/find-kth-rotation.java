class Solution {
    public int findKRotation(int arr[]) {
        // Code here
        int index=0;
        for(int i = 1; i<arr.length; i++){
            if(arr[i]< arr[index]){
                index = i;
            }
        }
        return index;
    }
}