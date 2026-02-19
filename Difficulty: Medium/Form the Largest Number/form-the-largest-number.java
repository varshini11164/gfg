class Solution {
    public String findLargest(int[] arr) {
        // code here
        int n = arr.length;
        String[] newArr = new String[n];
        for(int i=0;i<n;i++)
        {
            newArr[i] = String.valueOf(arr[i]);
        }
        
        Arrays.sort(newArr,(a,b)-> (b+a).compareTo(a+b));
        
        StringBuilder sb = new StringBuilder();
        
        for(String ele:newArr)
        {
            sb.append(ele);
        }
        
        int index = 0;
        while(index<sb.length() && sb.charAt(index)=='0')
        index++;
        
        String res = sb.substring(index);
        
        return res.length()==0?"0":res;
    }
}