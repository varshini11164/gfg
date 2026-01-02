class Solution {
    
    static int count;
    
    static void mergeSort(int[] a , int low ,int high){
        
        if(low>=high) return;
        int mid = low + (high-low)/2;
        
        mergeSort(a , low , mid);
        mergeSort(a , mid+1 , high);
        merge(a , low , mid , high);
        
    }
    
    static void merge(int[] a , int low , int mid , int high){
        
        int n1 = mid - low + 1;
        int n2 = high - mid;
        
        int[] b = new int[n1];
        int[] c = new int[n2];
        
        int k = low;
        for(int i=0; i<b.length; i++){
            b[i] = a[k++]; 
        }
        
        for(int i=0; i<c.length; i++){
            c[i] = a[k++]; 
        }
        
        k = low;
        int i = 0 , j = 0;
        
        while(i<b.length && j<c.length){
            
            if(b[i]<=c[j]) a[k++] = b[i++];
            
            else {
                count += b.length - i;
                a[k++] = c[j++];
            }
        }
        
        while(i<b.length){
            a[k++] = b[i++];
        }
        
        while(i<c.length){
            a[k++] = c[j++];
        }
    } 
    static int inversionCount(int arr[]) {
        
        count = 0;
        
        mergeSort(arr , 0 , arr.length-1);
        return count;
    }
}