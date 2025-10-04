class Solution {
  public int[] twoSum(int[] nums, int target) {
    // Create HashMap to store numbers and their indices
    HashMap<Integer, Integer> map = new HashMap<>();

    for (int i = 0; i < nums.length; i++) {
      // Calculate the complement of current number
      int comaplement = target - nums[i];

      // Check if complement is already in map
      if (map.containsKey(comaplement)) {
        // If found, return the indices of the complement and current
        return new int[] { map.get(comaplement), i };
      }
      // Add current number and its index to map
      map.put(nums[i], i);
    }
    return new int[] { -1, -1 };  // Not Found 
  }
}