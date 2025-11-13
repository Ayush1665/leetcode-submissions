# Minimum Window Substring

[🔗 Problem Link](https://leetcode.com/problems/minimum-window-substring/)  

![Difficulty: Hard](https://img.shields.io/badge/Difficulty-Hard-red)  

---


## Approach Explanation  

### 1. Brute Force 
- Generate all possible substrings of `s`.
- For each substring, check if it contains all characters of `t` with required frequency.
- Keep track of the smallest valid substring.
- **Time Complexity:** `O(n^3)`
(since substring generation and frequency checking are costly)
- **Space Complexity:** `O(1)` 

---

### 2. Two-Pointer Approach
- Use two pointers `left` and `right` to maintain a sliding window.
- Maintain frequency maps: 
  - `need` → count of each character in `t`.
   
  - `window` → count of charcacters currently in the window.
- Keep a variable `have` for how many characters match the required frequency.
- Steps: 
  1. Expand `right` pointer, adding characters into `window`.
  2. Once all required characters are matched (`have == need.size()`), try shrinking from `left` to find a smaller valid window.
  3. Keep updating the minimum length window then valid.
 
- **Time Complexity:** `O(n)`  
- **Space Complexity:** `O(26)` or `O(K)` where k = No. of charcters.

## 💡 Example
### Input

```java
s = "ADOBECODEBANC"
t = "ABC"
```

### Output

```java
"BANC"
```

#### Breakdown

We need all characters **A**, **B**, and **C** from `t` inside the smallest window of `s`.

| Step | Right Pointer | Window (Substring) | Have | Valid? | Action                        |
| ---- | ------------- | ------------------ | ---- | ------ | ----------------------------- |
| 0    | A             | `A`                | 1    | ❌      | Only A found                  |
| 1    | D             | `AD`               | 1    | ❌      | D not needed                  |
| 2    | O             | `ADO`              | 1    | ❌      | O not needed                  |
| 3    | B             | `ADOB`             | 2    | ❌      | A,B found                     |
| 4    | E             | `ADOBE`            | 2    | ❌      | Missing C                     |
| 5    | C             | `ADOBEC`           | 3    | ✅      | First valid window `"ADOBEC"` |
| →    | Shrink        | Remove `A`         | 2    | ❌      | Lost A → stop shrinking       |

📌 **Smallest valid till now:** `"ADOBEC"` (length = 6)

Continue expanding...

| Step | Right Pointer | Window               | Have | Valid? | Action                                     |
| ---- | ------------- | -------------------- | ---- | ------ | ------------------------------------------ |
| 6    | O             | `DOBECO`             | 2    | ❌      | Still invalid                              |
| 7    | D             | `DOBECOD`            | 2    | ❌      | Invalid                                    |
| 8    | E             | `DOBECODE`           | 2    | ❌      | Invalid                                    |
| 9    | B             | `DOBECODEB`          | 2    | ❌      | Duplicate B                                |
| 10   | A             | `DOBECODEBA`         | 3    | ✅      | Valid again                                |
| →    | Shrink        | Remove until invalid | 2    | ❌      | Before invalid → `"BECODEBA"` (length = 8) |

Continue expanding...

| Step | Right Pointer | Window               | Have | Valid? | Action                   |
| ---- | ------------- | -------------------- | ---- | ------ | ------------------------ |
| 11   | N             | `BECODEBAN`          | 2    | ❌      | Missing C                |
| 12   | C             | `BECODEBANC`         | 3    | ✅      | Valid                    |
| →    | Shrink        | Remove until invalid | -    | -      | Final valid = `"BANC"` ✅ |

✅ **Answer:** `"BANC"`
✅ **Length:** 4
✅ **Indices:** `9–12`

---

