class Solution {
    public void sort012(int[] arr) {
        if (arr == null || arr.length <= 1) return;
        
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;
        
        while (mid <= high) {
            if (arr[mid] == 0) {
               
                int tmp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = tmp;
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else { 
                int tmp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = tmp;
                high--;
               
            }
        }
    }
}