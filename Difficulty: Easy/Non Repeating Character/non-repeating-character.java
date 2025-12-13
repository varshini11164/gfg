class Solution {
    private static final int size=26;
    public char nonRepeatingChar(String s) {
        // code here
        int[] freq=new int[size];
        for(char c:s.toCharArray()){
            freq[c-'a']++;
        }
        for(char c:s.toCharArray()){
            if(freq[c-'a']==1){
                return c;
            }
        }
        return '$';
    }
}
