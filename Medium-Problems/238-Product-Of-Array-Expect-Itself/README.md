# Product of Array Expect Itself  

[🔗 Problem Link](https://leetcode.com/problems/product-of-array-except-self)  

![Difficulty: Medium](https://img.shields.io/badge/Difficulty-Medium-yellow)  

---


## Approach Explanation  

### 1. Brute Force 
- For each element, multiply all other elements except itself  
- **Time Complexity:** `O(n^2)`
- **Space Complexity:** `O(1)`  

---

### 2. Using Divison  
  - Find total product of all numbers.  
 - Divide total product by each element.
- **Fails if any element = 0** (division by zero).  
- **Time:** O(n)  
- **Space:** O(1)  

---

### 3. Prefix and Suffix Product Approach
- **Left Pass:** Store product of all elements before each index.
- **Right Pass:** Multiply with product of all elements after that index.
- Store left products in output array during first pass.
- Multiply running right product in second (reverse) pass.
- **Time:** O(n)  
- **Space:** O(1)  

