#  Contains Duplicate 
[🔗 Problem Link](https://leetcode.com/problems/contains-duplicate/)

![Difficulty: Easy](https://img.shields.io/badge/Difficulty-Easy-brightgreen)

## Approach Explanation

### 1. Brute Force (Nested Loops)
- Compare each element with every other.
- Simple but inefficient for large inputs.
- **Time:** O(n²)  
- **Space:** O(1)

---

### 2. Sorting Approach
- Sort the array first.
- Check if any adjacent elements are equal.
- **Time:** O(n log n)  
- **Space:** O(1) or O(log n)

---

### 3. HashSet (Optimal)
- Store elements in a HashSet.
- If an element already exists, return true.
- **Time:** O(n)  
- **Space:** O(n)

---

### 4. HashMap (Alternative)
- Use a HashMap to count occurrences.
- Detect duplicates by checking existing keys.
- **Time:** O(n)  
- **Space:** O(n)


