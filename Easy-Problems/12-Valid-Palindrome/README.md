# Valid Palindrome

[🔗 Problem Link](https://leetcode.com/problems/valid-palindrome)

![Difficulty: Easy](https://img.shields.io/badge/Difficulty-Easy-brightgreen)

---

## Approach Explanation

###  Two Pointers

- Use two pointers, `left` starting at 0 and `right` at `s.length-1`.
- Move pointers inward while skipping non-alphanumeric characters.
- Compare lowercase versions of characters at `left` and `right`.
If mismatch occurs, return `false`.
- **Time Complexity:** `O(n)`
- **Space Complexity:** `O(1)`
