class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        int[] cnt = new int[26];
        for (char ch : s.toCharArray())
            cnt[ch - 'a']++;
        for (char ch : t.toCharArray()) {
            if (--cnt[ch - 'a'] < 0)
                return false;
        }
        return true;
    }
}