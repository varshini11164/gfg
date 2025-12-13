class Solution {
    public char nonRepeatingChar(String s) {
        // code here
        int n = s.length();
        for(int i=0;i<n;i++){
            boolean found=false;
            for(int j=0;j<n;j++){
                if(i!=j&&s.charAt(i)==s.charAt(j)){
                    found=true;
                    break;
                }
            }
            if(!found)
                return s.charAt(i);
        }
        return '$';
        
    }
}
