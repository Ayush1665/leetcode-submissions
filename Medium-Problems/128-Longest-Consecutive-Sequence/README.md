# Longest Consecutive Sequence

[🔗 Problem Link](https://leetcode.com/problems/longest-consecutive-sequence/)

![Difficulty: Medium](https://img.shields.io/badge/Difficulty-Medium-yellow)

---

## Approach Explanation

### 1. Brute Force

- For each element, try to build the consecutive sequence by checking for `num+1, num+2, ...`
- **Time Complexity:** `O(n^2)`
- **Space Complexity:** `O(1)`

---

### 2. Sorting Approach

- Sort the array first.
- Traverse the sorted array and count consecutive numbers.
- **Fails if any element = 0** (division by zero).
- **Time:** `O(n log n)`
- **Space:** `O(n)` (if creates new array)

---

### 3. HashSet Approach

- Insert all numbers into a `set` for O(1) lookups.
- For each number, check if it is the start of a sequence `(num - 1 ` not in set).
- Count consecutive numbers starting from this number.
- Keep track of the maximum count.
- **Time:** `O(n)`
- **Space:** `O(n)`
