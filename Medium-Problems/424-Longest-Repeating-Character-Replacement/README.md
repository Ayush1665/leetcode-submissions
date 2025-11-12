# Longest Repeating Character Replacement

[🔗 Problem Link](https://leetcode.com/problems/longest-repeating-character-replacemen/)  

![Difficulty: Medium](https://img.shields.io/badge/Difficulty-Medium-yellow)  

---

## Approach Explanation  

### 1. Brute Force 
- Try every possible substring.
- For each substring, count the frequency of each character.
- Check if it can be converted into all same characters with at most k replacements.
→ Condition: `substring_length - max_frequency ≤ k`
- **Time Complexity:** `O(n² * 26)`
- **Space Complexity:** `O(26)` 

---

### 2. Sliding Window Approach
- Use two pointers `left` and `right` to represent a sliding window.
- Maintain a frequency array `count[26]` for characters in the window.
- Track the count of the most frequent character → `maxCount`.
- If `(window_length - maxCount) > k`, shrink the window from the `left`.
- Steps:
  1. Expand `right` pointer and add current character. 
  2. Update `maxCount`.
  3. If replacements needed exceed `k`, move `left` pointer. 
  4. Record the longest valid window.
 
- **Time Complexity:** `O(n)`  
- **Space Complexity:** `O(26)`
