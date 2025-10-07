# Group Anagrams  

[🔗 Problem Link](https://leetcode.com/problems/group-anagrams)  

![Difficulty: Medium](https://img.shields.io/badge/Difficulty-Medium-yellow)  

---


## Approach Explanation  

### 1. Brute Force 
- Compare every pair of strings to check if they are anagrams.  
- Group strings that are anagrams together.  
- **Time Complexity:** `O(n^2 * k)` (n = number of strings, k = average string length)  
- **Space Complexity:** `O(n)`  

---

### 2. Sorting Each String 
- **Idea:** Anagrams have the same letters. Sorting the letters of each string gives a **unique key**.  
- **Steps:**  
  1. Convert each string to a char array and sort it.  
  2. Use the sorted string as a key in a `HashMap`.  
  3. Map values are lists of original strings that are anagrams.  
  4. Return all values from the map as grouped anagrams.  
- **Time Complexity:** `O(n * k log k)`  
- **Space Complexity:** `O(n * k)`  

---

### 3. Hashing by Character Count  
- Count frequency of each character in the string and use it as a key.  
- Strings with the same frequency map are anagrams.  
- **Time Complexity:** `O(n * k)`  
- **Space Complexity:** `O(n * k)`  

