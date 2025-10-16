# Two Sum II  

[🔗 Problem Link](https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/)  

![Difficulty: Medium](https://img.shields.io/badge/Difficulty-Medium-yellow)  

---


## Approach Explanation  

### 1. Brute Force 
- Check all pairs of numbers to see if their sum equals the target.
- Return the first pair found.
- **Time Complexity:** `O(n^2)`
- **Space Complexity:** `O(1)`  

---

### 2. Two Pointers 
- **Idea:** Since the array is sorted, we can use two pointers to find the target sum efficiently. 
- **Steps:**  
  1. Initialize `left` at 0 and `right` at `numbers.length - 1`. 
  2. While `left < right`:  
      - Compute `sum = numbers[left] + numbers[right]`.  
      - If `sum == target`: return `[left+1, right+1]` (1-based index).
      - If `sum < target`: move `left` forward.
      If `sum > target`: move `right` backward.

- **Time Complexity:** `O(n)`  
- **Space Complexity:** `O(1)`  
