class Solution {
    public ArrayList<int[]> mergeOverlap(int[][] arr) {
        // Code here
        Arrays.sort(arr,new Comparator<int[]>(){
            public int compare(int[] arr1,int[] arr2){
                return Integer.compare(arr1[0],arr2[0]);
            }
        });
        ArrayList<int[]> result=new ArrayList<>();
        int n=arr.length;
        int i=0;
        int j=1;
        while(j<n){
            if(arr[j][0]<=arr[i][1]){
                arr[i][1]=Math.max(arr[i][1],arr[j][1]);
                j++;
            }
            else{
                result.add(arr[i]);
                i=j;
                j++;
            }
        }
        result.add(arr[i]);
        return result;
    }
}