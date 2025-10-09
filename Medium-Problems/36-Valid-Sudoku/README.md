# Product of Array Expect Itself  

[🔗 Problem Link](https://leetcode.com/problems/valid-sudoku/)  

![Difficulty: Medium](https://img.shields.io/badge/Difficulty-Medium-yellow)  

---


## Approach Explanation  

### 1. Brute Force 
- For each cell, check its entire row, column, and 3×3 sub-box for duplicates. 
- If any duplicate found → invalid.
- **Time Complexity:** `O(n^3)` (since checking each row/col/box per cell)
- **Space Complexity:** `O(1)`  

---

### 2. Boolean Tracking  
- Create 3 boolean matrices `rows[9][9]`,`cols[9][9]` and `boxes[9][9]`  
- Loop through all cells in the Sudoku board.
- Skip `.` (empty cells).
- For each number, find its row, column, and box index.
- Check if it already exists → invalid
- Otherwise, mark it as used in all three trackers.
- After scanning all cells, return true (valid Sudoku).
- **Fails if any element = 0** (division by zero).  
- **Time:** O(1)  (constant size board)
- **Space:** O(1)  
