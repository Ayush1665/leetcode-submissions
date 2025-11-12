class Solution {
    public int characterReplacement(String s, int k) {
        int maxFreq = 0, maxLen = 0;
        int count[] = new int[26];
        int start = 0;
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'A']++;
            maxFreq = Math.max(maxFreq, count[s.charAt(i) - 'A']);
            if ((i - start + 1) - maxFreq > k) {
                count[s.charAt(start) - 'A']--;
                start++;
            }
            maxLen = Math.max(maxLen, i - start + 1);
        }
        return maxLen;
    }
}