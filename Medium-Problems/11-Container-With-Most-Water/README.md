# 3 Sum

[🔗 Problem Link](https://leetcode.com/problems/container-with-most-water/)  

![Difficulty: Medium](https://img.shields.io/badge/Difficulty-Medium-yellow)  

---


## Approach Explanation  

### 1. Brute Force 
- Check every possible triplet `(i, j)` of lines:
  - Calculate area = `min(height[i], height[j]) * (j - i)`  
  - Track max area
- **Time Complexity:** `O(n^2)`
- **Space Complexity:** `O(1)` 

---

### 2. Two-Pointer Approach
- Initialize two pointers: `left = 0`, `right = n - 1`.
- While `left < right`:
  - Calculate area = `min(height[left], height[right]) * (right - left)`
  - Update `maxArea` if larger.
  - Move the pointer pointing to the smaller height inward (to try a taller line).
- Continue until pointers meet.
 
- **Time Complexity:** `O(n)`  
- **Space Complexity:** `O(1)`
