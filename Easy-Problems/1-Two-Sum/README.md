# Two Sum  

[🔗 Problem Link](https://leetcode.com/problems/two-sum)

![Difficulty: Easy](https://img.shields.io/badge/Difficulty-Easy-brightgreen)

---

## Approach Explanation  

### 1. Brute Force (Nested Loops) 
- Check every pair `(i, j)` in the array.  
- If `nums[i] + nums[j] == target`, return `[i, j]`.  
- **Time Complexity:** `O(n^2)`  
- **Space Complexity:** `O(1)`  

---

### 2. Better Approach (Sorting + Two Pointers)  
- Sort the array while keeping track of original indices.  
- Use **two pointers**: one at the start, one at the end.  
- Move pointers based on the sum compared to target.  
- **Time Complexity:** `O(n log n)` (sorting)  
- **Space Complexity:** `O(n)` (for index tracking)  

---

### 3. Optimal Approach (HashMap)  
- Use a **HashMap** to store numbers and their indices.  
- For each number, check if `(target - num)` is already in the map.  
- If yes → return the indices.  
- **Time Complexity:** `O(n)`  
- **Space Complexity:** `O(n)`  

---
