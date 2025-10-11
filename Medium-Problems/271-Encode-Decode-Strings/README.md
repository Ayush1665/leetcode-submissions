# Product of Array Expect Itself  

[🔗 Problem Link](https://neetcode.io/problems/string-encode-and-decode?list=neetcode150)   

![Difficulty: Medium](https://img.shields.io/badge/Difficulty-Medium-yellow) 


---


## Approach Explanation  

### 1. Brute Force / Using Separator 
- Concatenate all strings in the array into one string with a unique separator (like #) between them. 
- To decode, split the concatenated string using the separator to get original strings.
- **Time Complexity:** `O(n)` (total characters across all strings)
- **Space Complexity:** `O(1)`  

---

### 2. Length-Prefix Encoding 
- Encode each string as `"<length>#<string>"`
  - Example: `"hello"` - `"5#hello"`  
- Concatenate all encoded strings.
- To decode:
  - Read the length before `#`. 
  - Extract the next `length` characters as the original string. 
  - Repeat until the end. 
- For each number, find its row, column, and box index.
- Works for strings containing any character, including `#`.  
- **Time Complexity:** O(n) 
- **Space Complexity:** O(n)  
