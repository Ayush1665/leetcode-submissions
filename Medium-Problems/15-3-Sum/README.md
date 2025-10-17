# 3 Sum

[🔗 Problem Link](https://leetcode.com/problems/3sum/)  

![Difficulty: Medium](https://img.shields.io/badge/Difficulty-Medium-yellow)  

---


## Approach Explanation  

### 1. Brute Force 
- Check every possible triplet `(i, j, k)`
- If their sum = 0 → add to result (avoid duplicates with set)  
- **Time Complexity:** `O(n^3)`
- **Space Complexity:** `O(n^2)` (for storing results)  

---

### 2. Two-Pointer Approach
- Sort the array.  
- Loop through each element `nums[i]`:
  - Skip duplicates for `i`.
  - Use two pointers (`left`, `right`) to find pairs that make the sum 0 with `nums[i]`.
- Move pointers accordingly:
  - If sum < 0 → `left++`
  - If sum > 0 → `right--`
  - If sum = 0 → store triplet and skip duplicates.
- Continue until all unique triplets are found.
 
- **Time Complexity:** `O(n^2)`  
- **Space Complexity:** `O(1)` (excluding result) 
