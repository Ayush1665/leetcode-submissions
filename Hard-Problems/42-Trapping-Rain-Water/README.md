# Trapping Rain Water

[🔗 Problem Link](https://leetcode.com/problems/trapping-rain-water/)  

![Difficulty: Hard](https://img.shields.io/badge/Difficulty-Hard-red)  

---


## Approach Explanation  

### 1. Brute Force 
- For each bar, find the maximum height to its left and maximum height to its right.
- Water trapped at index `i` = `min(maxLeft, maxRight) - height[i]` (if positive).
- Sum up water trapped for all indices.
- **Time Complexity:** `O(n^2)`
- **Space Complexity:** `O(1)` 

---

### 2. Two-Pointer Approach
- Use two pointers: `left = 0`, `right = n - 1`
- Track `leftMax` and `rightMax`
  - If `height[left] < height[right]`:
    - If `height[left] >= leftMax` → update `leftMax`
    - Else → add `leftMax - height[left]` to water
    - Move `left++`
  - Else:
    - If `height[right] >= rightMax` → update `rightMax`
    - Else → add `rightMax - height[right]` to water
    - Move `right--`
 
- **Time Complexity:** `O(n)`  
- **Space Complexity:** `O(1)`
