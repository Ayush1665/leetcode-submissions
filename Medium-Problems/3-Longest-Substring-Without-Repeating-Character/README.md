# Longest Substring Without Repeating Characters

[🔗 Problem Link](http://leetcode.com/problems/longest-substring-without-repeating-characters/)  

![Difficulty: Medium](https://img.shields.io/badge/Difficulty-Medium-yellow)  

---

## Approach Explanation  

### 1. Brute Force 
- Generate all possible substrings
- For each substring, check if all characters are unique.
- Track the maximum length found.
- **Time Complexity:** `O(n^3)`
- **Space Complexity:** `O(min(n, charset))` 

---

### 2. Sliding Window Approach
- Use a set to store unique characters in the current window.
- Expand `right` pointer to add new characters.
- If a duplicate is found, remove characters from `left` until all are unique again.
- Update the maximum window length each time.
 
- **Time Complexity:** `O(n)`  
- **Space Complexity:** `O(min(n, charset))`
