##  Valid Anagram 

### 1. Sorting Approach
- Sort both strings and compare.
- Easy to implement but slightly slower due to sorting.
- **Time:** O(n log n)  
- **Space:** O(n)

---

### 2. Frequency Array (Optimal for lowercase a–z)
- Use a fixed array of size 26 to count letters.
- Increment counts for the first string and decrement for the second.
- If all counts return to zero → strings are anagrams.
- **Time:** O(n)  
- **Space:** O(1)

---

### 3. Single-pass Decrement (Optimized)
- Count and check in one pass, exiting early when mismatch occurs.
- Reduces unnecessary iterations for non-anagrams.
- **Time:** O(n)  
- **Space:** O(1)


