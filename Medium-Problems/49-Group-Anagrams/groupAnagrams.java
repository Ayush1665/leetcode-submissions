class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Create a map to group strings by their sorted version
        // Key: sorted string, Value: list of original strings that are anagrams
        Map<String, List<String>> map = new HashMap<>();

        // Iterate through each string in the input array
        for (String s : strs) {
            // Convert the string to a char array so we can sort it
            char[] arr = s.toCharArray();
            // Sort the characters in ascending order
            Arrays.sort(arr);
            // Convert the sorted char array back to a string
            // This sorted string will be the key for the map
            String key = new String(arr);
            
            // If the map does not already have this key, create a new list
            map.putIfAbsent(key, new ArrayList<>());
            // Add the original string to the list corresponding to the sorted key
            map.get(key).add(s);
        }

        // Convert the map values (lists of anagrams) to a List of List<String>
        return new ArrayList<>(map.values());
    }
}
