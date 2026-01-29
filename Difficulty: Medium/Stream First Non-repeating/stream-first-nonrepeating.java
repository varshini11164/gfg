class Solution {
    public String firstNonRepeating(String s) {
        int[] freq = new int[26];
        StringBuilder ans = new StringBuilder();
        java.util.Queue<Character> q = new java.util.LinkedList<>();

        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
            q.offer(c);

            while (!q.isEmpty() && freq[q.peek() - 'a'] > 1) {
                q.poll();
            }

            if (q.isEmpty()) ans.append('#');
            else ans.append(q.peek());
        }

        return ans.toString();
    }
}