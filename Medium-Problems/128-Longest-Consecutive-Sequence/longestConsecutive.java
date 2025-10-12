class Solution {
  public int longestConsecutive(int[] nums) {
    // Step 1: Put all numbers in a HashSet
    Set<Integer> numSet = new HashSet<>();
    for (int num : nums) {
      numSet.add(num);
    }

    // store maxlength of consecutive sequence
    int maxLen = 0;

    for (int num : numSet) {
      // Only start counting if this number is the start of a sequence
      // i.e., num - 1 is not present in the set
      if (!numSet.contains(num - 1)) {
        int currentNum = num;
        int length = 1;

        // Count the length of the consecutive sequence starting from currentNum
        while (numSet.contains(currentNum + 1)) {
          currentNum++;
          length++;
        }

        // Update the maximum length
        maxLen = Math.max(maxLen, length);
      }
    }
    return maxLen;
  }
}
