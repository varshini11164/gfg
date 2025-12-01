class Solution {
    public int getSecondLargest(int[] arr) {
        int l = -1;
        int sl = -1;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]>l) 
                {
                    sl=l;
                    l= arr[i];
                }
            if(arr[i]<l && arr[i]>sl) 
                sl = arr[i];
        }
    return sl;
    }
}

