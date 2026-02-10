class Solution {
    public int kokoEat(int[] arr, int k) {
        int low=1;
        
        int high = maxValue(arr);
        while(low<=high){
            int mid = (low+high)/2;
            if(mid==0){
                low=mid+1;
                continue;
            }
            int totalHrs = func(arr, mid);
            if(totalHrs<=k){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
    
    public int func(int[] arr, int mid){
        int hours = 0;
        for(int i=0;i<arr.length;i++){
            hours += Math.ceil((double)arr[i]/(double)mid);
        }
        return hours;
    }
    
    public int maxValue(int[] arr){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max) max=arr[i];
        }
        return max;
    }
}