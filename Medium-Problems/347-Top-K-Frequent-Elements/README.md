# Top K Frequent Elements

[🔗 Problem Link](https://leetcode.com/problems/top-k-frequent-elements/)

![Difficulty: Easy](https://img.shields.io/badge/Difficulty-Medium-yellow)  

---

## Approach Explanation  

### 1. Brute Force 
- Count the frequency of each element using a `HashMap`. 
- Sort the map entries by frequency in descending order.
- Take the top `k` elements.  
- **Time Complexity:** `O(n log n)`  because of sorting
- **Space Complexity:** `O(n)`  

---

### 2. Better Approach (Sorting + Two Pointers)  
- Sort the array while keeping track of original indices.  
- Use **two pointers**: one at the start, one at the end.  
- Move pointers based on the sum compared to target.  
- **Time Complexity:** `O(n log n)` (sorting)  
- **Space Complexity:** `O(n)` (for index tracking)  

### 3.HashMap + Min Heap
1. **Count element frequencies** using a `HashMap<Integer, Integer>`.  
   Example: `nums = [1,1,1,2,2,3]` → `{1:3, 2:2, 3:1}`  
2. **Use a Min-Heap (PriorityQueue)** to keep the top `k` frequent elements.  
   - Add each element to the heap.  
   - If heap size exceeds `k`, remove the least frequent element.  
3. **Extract top `k` elements** from the heap and return them as the result.
