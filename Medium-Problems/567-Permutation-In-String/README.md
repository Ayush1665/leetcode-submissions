# Permutation in String

[🔗 Problem Link](https://leetcode.com/problems/permutation-in-string/)  

![Difficulty: Medium](https://img.shields.io/badge/Difficulty-Medium-yellow)  

---

## Approach Explanation  

### 1. Brute Force 
- Generate **all permutations** of `s1`.
- For each permutation, check if it exists as a substring in `s2`.
- Use the condition sorted`(substring) == sorted(s1)` to compare.
→ Works but is extremely inefficient.
- **Time Complexity:** `O(n! * m)`
- **Space Complexity:** `O(1)` 

---

### 2. Sliding Window Approach
- Use a window of size equal to `len(s1)` that slides over `s2`.
- Maintain two frequency arrays:
- `count1[26]` → frequency of characters in `s1`.
- `count2[26]` → frequency of characters in current window of `s2`. 
- At each step:
  1. Add the next character to `count2`.
  2. Remove the character that slides out (when `window size > len(s1)`).
  3. Compare `count1` and `count2`.
  4. If equal → a permutation of `s1` exists in `s2`.
- Efficient since we only update the window instead of recomputing counts.
 
- **Time Complexity:** `O(n)`  
- **Space Complexity:** `O(26)`
